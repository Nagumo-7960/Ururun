package com.example.ururun.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ururun.R

@Composable
fun HomeScreen(toStart:() -> Unit) {
    Box (
        modifier = Modifier
            .fillMaxSize()
            ){
        HomeBackground(toStart)
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Column() {
                Row (
                    modifier = Modifier.fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically
                        ){
                    HomeTitleText(toStart)
                }
            }
        }
    }
}

@Composable
fun HomeBackground(toStart:() -> Unit) {
    Image(
        painter = painterResource(id = R.drawable.home),
        contentDescription = "home_background",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
            .clickable(
                enabled = true,
                onClick = {
                    toStart()
                }
            )
    )
}
@Composable
fun HomeTitleText(toStart:() -> Unit){
    Text(
        text = "うるるん",
        fontSize = 80.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier
            .clickable(
                enabled = true,
                onClick = {
                    toStart()
                }
            )
    )

}

@Preview
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen{}
}