package com.example.ururun

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ururun.ui.screens.HomeScreen
import com.example.ururun.ui.screens.BuyingScreen
import com.example.ururun.ui.screens.BuyingScreenViewModel
import com.example.ururun.ui.screens.SellingScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "buying") {
        val viewModel:BuyingScreenViewModel = BuyingScreenViewModel()
        composable("buying") { BuyingScreen(navController,  viewModel) }
        composable("selling") { SellingScreen(navController, viewModel) }
    }


}

@Composable
fun BottomNavigationBar(
    items:List<BottomNavItem>,
    navController:NavController,
    modifier: Modifier,
    onItemClick:(BottomNavItem) -> Unit
){
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation (
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 5.dp
            ){
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                selectedContentColor = Color.DarkGray,
                unselectedContentColor = Color.Gray,
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        Icon(imageVector = item.icon, contentDescription = item.name)
                        if(selected){
                            Text(text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }

                }

                )
        }
    }

}
