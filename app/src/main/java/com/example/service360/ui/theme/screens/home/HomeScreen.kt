package com.example.service360.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.service360.R
import com.example.service360.navigation.ROUT_ABOUT
import com.example.service360.navigation.VIEW_SERVICES_URL
import com.example.service360.ui.theme.MYRED

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){

    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {

        TopAppBar(
            title = { Text(text = "HOME", fontFamily = FontFamily.Default, color = Color.White,) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(MYRED),
            navigationIcon = {
                IconButton(onClick = { navController.navigate(ROUT_ABOUT)  }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "back",
                        tint = Color.White
                    )

                }
            },
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.barber),
                        contentDescription = "barber",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Barber",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Experienced barber specializing in modern cuts and classic styles. Attention to detail, friendly service, and clean workspace. Skilled in fades, beard trims, and hot towel shaves.",
                    fontSize = 15.sp)



            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.carwash),
                        contentDescription = "carwash",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Carwash",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Professional car wash service offering thorough cleaning inside and out. Includes exterior wash, interior vacuuming, and detailing. Friendly staff, eco-friendly products, and attention to detail.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.catering),
                        contentDescription = "catering",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Catering",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Choose from diverse menu options, customize for any event, and enjoy seamless delivery and setup. Perfect for gatherings, meetings, and special occasions.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.cleaning),
                        contentDescription = "cleaning",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Cleaning",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Experienced cleaning service specializing in thorough, detail-oriented cleaning. Offering a spotless finish for homes and offices, with eco-friendly products and flexible scheduling.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.cobbler),
                        contentDescription = "cobbler",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Cobbler",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Experienced cobbler specializing in custom footwear and precise repairs. With meticulous craftsmanship and personalized service, they excel in leatherwork, sole replacements, and bespoke designs.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.electrician),
                        contentDescription = "electrician",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Electrician",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Skilled electrician offering top-tier residential and commercial services. Specializing in intricate wiring, flawless installations, and precision repairs, all with an emphasis on safety.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.hairdresser),
                        contentDescription = "hairdresser",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Hairdresser",
                        fontSize = 35.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Expert hairdresser providing high-end styling services with a flair for modern and classic looks. Specializing in precision cuts, creative color, and personalized treatments.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.mboga),
                        contentDescription = "mboga",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Mama mboga",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Experienced Mama Mboga offering fresh, high-quality produce with a personal touch. Specializing in locally-sourced fruits, vegetables, and artisanal goods.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.plumber),
                        contentDescription = "plumber",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Plumber",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Skilled plumber delivering top-notch residential and commercial services. Expertise in leak repairs, installations, and system maintenance with a focus on precision and efficiency.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(10.dp))

        //Start of Row
        Row {
            //card one
            Card(modifier = Modifier.padding(5.dp)
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.tailor),
                        contentDescription = "tailor",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Tailor",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }
            //card end
            Column (modifier = Modifier.padding(start = 20.dp)){
                Text(text = "Expert tailor offering bespoke clothing services with a keen eye for detail. Specializing in custom fittings, alterations, and unique designs, all crafted to your precise specifications.", fontSize = 15.sp)


            }

        }

        //End of row

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(VIEW_SERVICES_URL) },
            colors = ButtonDefaults.buttonColors(MYRED),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(5.dp)) {
            Text(text = "REQUEST SERVICE", fontFamily = FontFamily.SansSerif)
        }

        Spacer(modifier = Modifier.height(50.dp))




    }


}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}
