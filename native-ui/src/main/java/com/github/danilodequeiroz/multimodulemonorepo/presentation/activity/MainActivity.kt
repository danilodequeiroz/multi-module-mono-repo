package com.github.danilodequeiroz.multimodulemonorepo.presentation.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.rememberNavController
import com.github.danilodequeiroz.multimodulemonorepo.presentation.composable.setcontent.ContentSet
import com.github.danilodequeiroz.multimodulemonorepo.presentation.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val collected = viewModel.trendingAudios.collectAsState()
            Log.d("TAG", "onCreate: ${collected.value}")
            ContentSet(
                navController = rememberNavController()
            )
        }
    }
}
