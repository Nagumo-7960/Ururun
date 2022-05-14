package com.example.ururun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ururun.ui.theme.UrurunTheme
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Navigation(navController = navController)

            Scaffold(
                bottomBar = {
                    BottomNavigationBar(
                        items = listOf(
                            BottomNavItem(
                                name = "Buying",
                                route = "buying",
                                icon = Icons.Default.Home
                            ),
                            BottomNavItem(
                                name = "Selling",
                                route = "selling",
                                icon = Icons.Default.Share
                            )
                        ),
                        navController = navController,
                        modifier = Modifier,
                        onItemClick ={
                            navController.navigate(it.route)
                        }
                    )
                }
            ) {
                Navigation(navController = navController)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}