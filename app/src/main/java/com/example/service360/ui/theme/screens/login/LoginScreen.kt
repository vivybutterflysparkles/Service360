package com.example.service360.ui.theme.screens.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.service360.R
import com.example.service360.data.AuthViewModel
import com.example.service360.navigation.ROUT_SIGNUP
import com.example.service360.ui.theme.MYRED

@Composable
fun LoginScreen(navController: NavController){

    Column (modifier = Modifier
        .paint(painterResource(id = R.drawable.img_2), contentScale = ContentScale.FillBounds)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Welcome Back!",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = MYRED,
            fontWeight = FontWeight.ExtraBold

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Already have an account. Please enter your details",
            fontSize = 18.sp,
            fontFamily = FontFamily.Default,
            color = Color.Black,
            textAlign = TextAlign.Center

        )

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            onValueChange ={email = it},
            label = { Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon ={ Icon(imageVector = Icons.Default.Email, contentDescription = "email", tint = Color.Black) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

            )

        Spacer(modifier = Modifier.height(20.dp))


        OutlinedTextField(
            value = password,
            onValueChange ={password = it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon ={ Icon(imageVector = Icons.Default.Lock, contentDescription = "person", tint = Color.Black) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(20.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Row {
            Button(
                onClick = { authViewModel.login(email, password) },
                colors = ButtonDefaults.buttonColors(MYRED),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "LogIn", fontFamily = FontFamily.SansSerif)
            }
            Spacer(modifier = Modifier.width(10.dp))

            Button(
                onClick = { authViewModel.adminlogin(email, password) },
                colors = ButtonDefaults.buttonColors(MYRED),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "LogIn as Admin", fontFamily = FontFamily.SansSerif)
            }

        }



        Button(
            onClick = { navController.navigate(ROUT_SIGNUP) },
            colors = ButtonDefaults.buttonColors(MYRED),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp, end = 100.dp),
            shape = RoundedCornerShape(5.dp)) {
            Text(text = "SignUp", fontFamily = FontFamily.SansSerif)
        }
    }

}



@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())



}