package com.example.service360.data

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.service360.models.User
import com.example.service360.navigation.ADD_SERVICE_URL
import com.example.service360.navigation.ROUT_ABOUT
import com.example.service360.navigation.ROUT_LOGIN
import com.example.service360.navigation.ROUT_SIGNUP
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class AuthViewModel(var navController: NavController, var context: Context){
    val mAuth: FirebaseAuth
    val progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }
    @SuppressLint("RestrictedApi")
    fun signup(name:String, email:String, password:String, confpassword:String){


        if (email.isBlank() || password.isBlank() ||confpassword.isBlank()){

            Toast.makeText(context,"Please email and password cannot be blank",Toast.LENGTH_LONG).show()
        }else if (password != confpassword){
            Toast.makeText(context,"Password do not match",Toast.LENGTH_LONG).show()
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                if (it.isSuccessful){
                    val userdata= User(
                        name,
                        email,
                        password,
                        mAuth.currentUser!!.uid
                    )
                    val regRef= FirebaseDatabase.getInstance().getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful){
                            Toast.makeText(context,"Registered Successfully",Toast.LENGTH_LONG).show()
                            navController.navigate( ROUT_LOGIN)

                        }else{
                            Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
                            navController.navigate(ROUT_SIGNUP)
                        }
                    }
                }else{
                    navController.navigate(ROUT_SIGNUP)
                }

            } }

    }

    fun login(email: String, password: String){

        if (email.isBlank() || password.isBlank()){
            Toast.makeText(context,"Please email and password cannot be blank", Toast.LENGTH_LONG).show()
        }
        else if (email == "vivian@gmail.com" && password == "123456"){
            navController.navigate(ROUT_LOGIN)
        }
        else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful ){
                    navController.navigate(ROUT_ABOUT)
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }




    fun adminlogin(email: String, password: String){

        if (email.isBlank() || password.isBlank()){
            Toast.makeText(context,"Please email and password cannot be blank", Toast.LENGTH_LONG).show()
        }

        else if (email == "vivian@gmail.com" && password == "123456"){
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful ){
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                    navController.navigate(ADD_SERVICE_URL)
                }else{
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }

        }
        else{
            navController.navigate(ADD_SERVICE_URL)
        }
    }




    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUT_LOGIN)
    }

    fun isLoggedIn(): Boolean = mAuth.currentUser != null

}