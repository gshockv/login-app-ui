package com.gshockv.loginappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.gshockv.loginappui.ui.screen.MainAppScreen
import com.gshockv.loginappui.ui.theme.LoginAppUiTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      LoginAppUiTheme {
        MainAppScreen()
      }
    }
  }
}
