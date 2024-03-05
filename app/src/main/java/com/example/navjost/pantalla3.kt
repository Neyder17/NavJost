package com.example.navjost

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Pantalla3(navController: NavController) {
    Column  (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )   {
        Image(
            painter = painterResource(id = R.drawable.th),
            contentDescription = "La momiza insana de Bingus",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Bingus es un gato muy peculiar con muschos memes, para multiples ocasiones")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("pantalla2") }) {
            Text(text = "Volver a Pantalla 2")
        }
        Button(onClick = { navController.navigate("pantalla1") }) {
            Text(text = "Iniciar otra veh")
        }
    }
}