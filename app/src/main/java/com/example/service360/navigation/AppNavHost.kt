package com.example.Service360.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.service360.navigation.ADD_ACCOUNT
import com.example.service360.navigation.ADD_SERVICE_URL
import com.example.service360.navigation.ROUT_ABOUT
import com.example.service360.navigation.ROUT_HOME
import com.example.service360.navigation.ROUT_LOGIN
import com.example.service360.navigation.ROUT_SIGNUP
import com.example.service360.navigation.ROUT_SPLASH
import com.example.service360.navigation.VIEW_ACCOUNT
import com.example.service360.navigation.VIEW_SERVICES_URL
import com.example.service360.navigation.VIEW_SERVICE_URL
import com.example.service360.ui.theme.screens.about.AboutScreen
import com.example.service360.ui.theme.screens.account.AddAccountScreen
import com.example.service360.ui.theme.screens.account.ViewAccountScreen
import com.example.service360.ui.theme.screens.home.HomeScreen
import com.example.service360.ui.theme.screens.login.LoginScreen
import com.example.service360.ui.theme.screens.services.AddServiceScreen
import com.example.service360.ui.theme.screens.services.ViewServiceScreen
import com.example.service360.ui.theme.screens.services.ViewServicesScreen
import com.example.service360.ui.theme.screens.signup.SignupScreen
import com.example.service360.ui.theme.screens.splash.SplashScreen

@SuppressLint("NewApi")
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(VIEW_SERVICES_URL) {
            ViewServicesScreen(navController = navController)
        }

        composable(VIEW_SERVICE_URL) {
            ViewServiceScreen(navController = navController)
        }

        composable(ADD_SERVICE_URL) {
            AddServiceScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ADD_ACCOUNT){
            AddAccountScreen(navController = navController)
        }
        composable(VIEW_ACCOUNT){
            ViewAccountScreen(navController = navController)
        }






    }
}

