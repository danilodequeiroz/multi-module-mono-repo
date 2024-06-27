package com.github.danilodequeiroz.multimodulemonorepo.presentation.composable.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen1(navController: NavController) {
    Header("Screen 1")
    Button(onClick = { navController.navigate("screen2") }) {
        Text("Go to Screen 2")
    }
}

@Composable
fun Screen2(navController: NavController) {
    Header("Screen 2")
    Button(onClick = { navController.navigate("screen1") }) {
        Text("Go back to Screen 1")
    }
}

@Composable
@Preview
fun Screen1WithColumn() {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Screen1(
            rememberNavController()
        )
    }
}


@Composable
@Preview
fun Screen1WithRow() {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Screen1(
            rememberNavController()
        )
    }
}