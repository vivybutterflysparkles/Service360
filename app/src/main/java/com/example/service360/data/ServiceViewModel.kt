package com.example.service360.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.example.service360.navigation.ROUT_LOGIN
import com.example.service360.models.Service
import com.example.service360.navigation.ADD_SERVICE_URL
import com.example.service360.navigation.VIEW_SERVICE_URL
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage


class ServiceViewModel(var navController: NavController, var context: Context) {
    var authViewModel:AuthViewModel
    var progress: ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(ROUT_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadService(name:String, provider:String, price:String, phone: String,filePath: Uri){
        val productId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Services/$productId")

        storageRef.putFile(filePath).addOnCompleteListener{

            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var service= Service(name,provider,price,phone,imageUrl,productId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Services/$productId")
                    databaseRef.setValue(service).addOnCompleteListener {
                        if (it.isSuccessful){
                            navController.navigate(VIEW_SERVICE_URL)
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun allServices(
        product: MutableState<Service>,
        products: SnapshotStateList<Service>):SnapshotStateList<Service>{

        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Services")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                products.clear()
                for (snap in snapshot.children){
                    var retrievedProduct = snap.getValue(Service::class.java)
                    product.value = retrievedProduct!!
                    products.add(retrievedProduct)
                }

            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return products
    }



    fun updateService(productId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Services/$productId")
        ref.removeValue()
        navController.navigate(ADD_SERVICE_URL)
    }


    fun deleteService(productId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Services/$productId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}