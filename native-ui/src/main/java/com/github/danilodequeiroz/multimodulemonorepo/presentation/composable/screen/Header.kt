package com.github.danilodequeiroz.multimodulemonorepo.presentation.composable.screen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Header(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineLarge,
        color = MaterialTheme.colorScheme.primary
    )
    Spacer(modifier = Modifier.height(16.dp))
}

@Preview(showBackground = true)
@Composable
fun HeaderAlone() {
    Header("Screen 1")
}

@Preview(showBackground = true)
@Composable
fun HeaderWithColumn() {
    Column(
        modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header("Screen 1")
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderWithBox() {
    Box(
        modifier = Modifier.padding(16.dp),
    ) {
        Header("Screen 1")
    }
}
