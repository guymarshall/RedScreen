package com.marshall.guy.redscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.marshall.guy.redscreen.ui.theme.RedScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = window.attributes
        layoutParams.screenBrightness = 1.0f
        window.attributes = layoutParams

        enableEdgeToEdge()
        setContent {
            RedScreenTheme {
                RedBackground()
            }
        }
    }
}

@Composable
fun RedBackground() {
    androidx.compose.foundation.layout.Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    )
}