package com.example.ururun.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

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
        }
    }
}

@Preview
@Composable
fun PreviewScreen() {
    val navController = rememberNavController()
    SellingScreen(navController, viewModel())
}