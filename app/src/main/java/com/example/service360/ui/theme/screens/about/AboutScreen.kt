package com.example.service360.ui.theme.screens.about

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.service360.R
import com.example.service360.navigation.ROUT_HOME
import com.example.service360.ui.theme.MYRED

@Composable
fun AboutScreen(navController: NavController){

    Column(modifier = Modifier
        .paint(painterResource(id = R.drawable.img_2), contentScale = ContentScale.FillBounds)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Text(text =  "**About Us**",
            fontSize = 50.sp,
            color = MYRED,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Serif
        )
        
        Spacer(modifier = Modifier.height(20.dp))


        Text(text =
                "Service360 is your go-to app for all-around home services.  \n" +
                "\n" +
                "We connect you with trusted professionals, ensuring reliability, quality, and convenience.  \n" +
                "\n" +
                "Let us handle the chores, so you can focus on what matters most.  \n" +
                "\n" +
                "Service360—Your Home, Our Priority.  ",
            fontSize = 20.sp,
            color = MYRED,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(ROUT_HOME)  },
            colors = ButtonDefaults.buttonColors(MYRED),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(text = "HOME", fontFamily = FontFamily.SansSerif)
        }

    }


}

@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())



}
