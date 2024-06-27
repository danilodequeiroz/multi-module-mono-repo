package com.github.danilodequeiroz.multimodulemonorepo.presentation.composable.setcontent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.danilodequeiroz.multimodulemonorepo.presentation.composable.screen.Screen1
import com.github.danilodequeiroz.multimodulemonorepo.presentation.composable.screen.Screen2

@Composable
fun ContentSet(navController: NavHostController) {
    MaterialTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,

                ) {
                NavHost(navController = navController, startDestination = "screen1") {
                    composable("screen1") {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Screen1(navController)
                        }
                    }
                    composable("screen2") {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Screen2(navController)
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun ContentSetPreview() {
    ContentSet(
        rememberNavController()
    )
}