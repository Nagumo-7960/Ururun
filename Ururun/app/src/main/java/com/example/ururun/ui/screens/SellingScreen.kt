package com.example.ururun.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ururun.R

@Composable
fun SellingScreen(navController: NavController,viewModel: BuyingScreenViewModel) {
    val amtMyWallet = viewModel.amtMyWallet.observeAsState().value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            start = 10.dp
                        )
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        MyWalletIcon()
                        AmtMyWallet(amtMyWallet)
                    }
                }
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(
                        top = 30.dp
                    )
                ) {
                    Row {
                        ProdForSellCard_1(viewModel)
                        ProdForSellCard_2(viewModel)
                    }
                    Row {
                        ProdForSellCard_3(viewModel)
                        ProdForSellCard_4(viewModel)
                    }
                }
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                SaleButton()
            }
        }


    }
}

@Composable
fun ProdForSellCard_1(viewModel: BuyingScreenViewModel) {
    val value:Int = 30000
    Card(
        modifier = Modifier
            .padding(
                top = 20.dp,
                start = 20.dp,
                end = 20.dp,
                bottom = 20.dp

            )
            .clickable {
                viewModel.sale(value)
                Log.d("refresh",viewModel.amtMyWallet.value.toString())
            },
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
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
            Text(
                text = "スマートフォン",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = value.toString()+"円")

        }
    }
}

@Composable
fun ProdForSellCard_2(viewModel: BuyingScreenViewModel) {
    val value:Int = 20000
    Card(
        modifier = Modifier
            .padding(
                top = 20.dp,
                start = 20.dp,
                end = 20.dp,
                bottom = 20.dp

            ),
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.fashion_watch),
                contentDescription = "fashon_watch",
                modifier = Modifier
                    .size(
                        width = 150.dp,
                        height = 150.dp
                    )
                    .clickable {
                        viewModel.sale(value)
                    },
                contentScale = ContentScale.Crop
            )
            Text(
                text = "スマートウォッチ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = value.toString()+"円")

        }
    }
}

@Composable
fun ProdForSellCard_3(viewModel: BuyingScreenViewModel) {
    val value:Int = 25000
    Card(
        modifier = Modifier
            .padding(
                top = 20.dp,
                start = 20.dp,
                end = 20.dp,
                bottom = 20.dp
            ),
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.omocha_game),
                contentDescription = "omocha_game",
                modifier = Modifier
                    .size(
                        width = 150.dp,
                        height = 150.dp
                    )
                    .clickable {
                        viewModel.sale(value)
                    },
                contentScale = ContentScale.Crop
            )
            Text(
                text = "スマートゲーム",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = value.toString()+"円")

        }
    }
}

@Composable
fun ProdForSellCard_4(viewModel: BuyingScreenViewModel) {
    val value:Int = 10000
    Card(
        modifier = Modifier
            .padding(
                top = 20.dp,
                start = 20.dp,
                end = 20.dp,
                bottom = 20.dp

            ),
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.shoes_sneaker),
                contentDescription = "shoes",
                modifier = Modifier
                    .size(
                        width = 150.dp,
                        height = 150.dp
                    )
                    .clickable {
                        viewModel.sale(value)
                    },
                contentScale = ContentScale.Crop
            )
            Text(
                text = "スマートシューズ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = value.toString()+"円")

        }
    }
}

@Composable
fun SaleButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        elevation = ButtonDefaults.elevation(5.dp),
        modifier = Modifier
            .width(100.dp)
            .height(50.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.White
        )
    ) {
        Text(
            text = "売る",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
    }
}

@Preview
@Composable
fun PreviewScreen() {
    val navController = rememberNavController()
    SellingScreen(navController, viewModel())
}