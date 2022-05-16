package com.example.ururun.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ururun.R

@Composable
fun BuyingScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column() {
            Column(
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
            ) {
                Row (verticalAlignment = Alignment.CenterVertically){
                    MyWalletIcon()
                    AmtMyWallet()
                }
            }

            Column() {
                Row {
                    ProdForBuyCard()
                }
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

@Composable
fun AmtMyWallet(){
    Text(
        text = "3,000,000",
        modifier = Modifier
            .padding(
                start = 10.dp
            ),
        fontSize = 30.sp
    )
}

@Composable
fun ProdForBuyCard(){
    Card() {
        Column {
            Image(
                painter = painterResource(id = R.drawable.smartphone),
                contentDescription = "smartphone",
                modifier = Modifier
                    .size(
                        width = 150.dp,
                        height = 150.dp
                    ),
                contentScale = ContentScale.Crop
            )
            Text(text = "スマートフォン")
            Text(text = "30000円")
        
        }
    }
}

@Preview
@Composable
fun PreviewBuyingScreen(){
    val navController = rememberNavController()
    BuyingScreen(navController)
}