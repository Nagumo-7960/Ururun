package com.example.ururun.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ururun.R
import java.lang.reflect.Modifier

@Composable
fun HomeScreen(navController: NavController) {
    HomeBackground()
}

@Composable
fun HomeBackground() {
    Image(
        painter = painterResource(id = R.drawable.home),
        contentDescription = "home_background",
        contentScale = ContentScale.FillBounds,
    )
}

@Preview
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen(navController)
}