package com.gshockv.loginappui.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gshockv.loginappui.R
import com.gshockv.loginappui.ui.component.ActionButton
import com.gshockv.loginappui.ui.theme.DarkTextColor
import com.gshockv.loginappui.ui.theme.LoginAppUiTheme
import com.gshockv.loginappui.ui.theme.PrimaryPinkBlended
import com.gshockv.loginappui.ui.theme.PrimaryYellow
import com.gshockv.loginappui.ui.theme.PrimaryYellowDark
import com.gshockv.loginappui.ui.theme.PrimaryYellowLight

@Composable
fun WelcomeScreen(
  onOpenLoginClick: () -> Unit,
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .fillMaxSize()
      .background(
        Brush.verticalGradient(
          0f to PrimaryPinkBlended,
          0.6f to PrimaryYellowLight,
          1f to PrimaryYellow
        )
      )
      .systemBarsPadding(),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Image(
      painter = painterResource(R.drawable.img_welcome),
      contentDescription = null,
      modifier = Modifier
        .size(300.dp)
        .padding(top = 32.dp)
    )
    Spacer(
      modifier = Modifier.height(24.dp)
    )
    Text(
      text = "Let's start coding!",
      modifier = Modifier.padding(horizontal = 24.dp),
      style = MaterialTheme.typography.headlineLarge,
      fontWeight = FontWeight.Black,
      color = DarkTextColor
    )
    Spacer(
      modifier = Modifier.height(16.dp)
    )
    Text(
      text = "Create a beautiful Login App using\nKotlin, Jetpack Compose and Material3",
      modifier = Modifier.padding(horizontal = 24.dp),
      textAlign = TextAlign.Center,
      style = MaterialTheme.typography.bodyLarge,
      color = DarkTextColor
    )

    Spacer(
      modifier = Modifier.weight(weight = 1f)
    )

    ActionButton(
      text = "Next",
      isNavigationArrowVisible = true,
      colors = ButtonDefaults.buttonColors(
        containerColor = PrimaryYellowDark,
        contentColor = DarkTextColor
      ),
      shadowColor = PrimaryYellowDark,
      onClick = onOpenLoginClick,
      modifier = Modifier.padding(24.dp)
    )
  }
}

@Composable
@Preview(showSystemUi = true)
fun PreviewWelcomeScreen() {
  LoginAppUiTheme {
    WelcomeScreen(
      onOpenLoginClick = {}
    )
  }
}
