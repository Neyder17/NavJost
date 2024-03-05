package com.example.navjost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "pantalla1") {
        composable("pantalla1") {
            Pantalla1(navController)
        }
        composable("pantalla2") {
            Pantalla2(navController)
        }
        composable("pantalla3") {
            Pantalla3(navController)
        }
    }
}
