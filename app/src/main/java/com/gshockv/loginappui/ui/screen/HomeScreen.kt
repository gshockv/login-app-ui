package com.gshockv.loginappui.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gshockv.loginappui.ui.component.ActionButton
import com.gshockv.loginappui.ui.theme.LoginAppUiTheme
import com.gshockv.loginappui.ui.theme.PrimaryGreen
import com.gshockv.loginappui.ui.theme.PrimaryGreenDark
import com.gshockv.loginappui.ui.theme.PrimaryPinkDark
import com.gshockv.loginappui.ui.theme.PrimaryViolet
import com.gshockv.loginappui.ui.util.KonfettiUtil
import nl.dionsegijn.konfetti.compose.KonfettiView

@Composable
fun HomeScreen(
  onRestartFlowClick: () -> Unit,
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .fillMaxSize()
      .background(
        Brush.verticalGradient(
          0f to PrimaryViolet,
          1f to PrimaryGreen
        )
      )
      .systemBarsPadding(),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Spacer(
      modifier = Modifier.weight(weight = 1f)
    )
    Greetings()
    Spacer(
      modifier = Modifier.weight(weight = 1f)
    )

    ActionButton(
      text = "Press to Restart",
      isNavigationArrowVisible = false,
      onClick = onRestartFlowClick,
      colors = ButtonDefaults.buttonColors(
        containerColor = PrimaryGreenDark,
        contentColor = Color.White
      ),
      shadowColor = PrimaryPinkDark,
      modifier = Modifier.padding(24.dp)
    )
  }
  KonfettiView(
    modifier = Modifier.fillMaxSize(),
    parties = KonfettiUtil.parade()
  )
}

@Composable
private fun Greetings(
  modifier: Modifier = Modifier
) {
  Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.spacedBy(8.dp)
  ) {
    Text(
      text = "Congratulations!",
      style = MaterialTheme.typography.headlineMedium,
      fontWeight = FontWeight.Bold,
      color = Color.White
    )
    Text(
      text = "\uD83E\uDD73",
      style = MaterialTheme.typography.headlineMedium,
      color = Color.Black
    )
  }
}

@Composable
@Preview(showSystemUi = true)
private fun PreviewHomeScreen() {
  LoginAppUiTheme {
    HomeScreen(
      onRestartFlowClick = {}
    )
  }
}
