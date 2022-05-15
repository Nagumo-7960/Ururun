package com.example.ururun.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ururun.R

@Composable
fun BuyingScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column() {
            Row {
                MyWalletIcon()
            }
        }
    }
}

@Composable
fun MyWalletIcon(){
    Image(
        painter = painterResource(id = R.drawable.yen),
        contentDescription = "my_wallet_icon",
        modifier = Modifier
            .size(
                width = 50.dp,
                height = 50.dp
            )
    )

}

@Preview
@Composable
fun PreviewBuyingScreen(){
    val navController = rememberNavController()
    BuyingScreen(navController)
}