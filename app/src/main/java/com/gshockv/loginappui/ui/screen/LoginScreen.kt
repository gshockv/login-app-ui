package com.gshockv.loginappui.ui.screen

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gshockv.loginappui.R
import com.gshockv.loginappui.ui.component.AuthenticationScreenTemplate
import com.gshockv.loginappui.ui.theme.LoginAppUiTheme
import com.gshockv.loginappui.ui.theme.PrimaryPink
import com.gshockv.loginappui.ui.theme.PrimaryPinkBlended
import com.gshockv.loginappui.ui.theme.PrimaryPinkDark
import com.gshockv.loginappui.ui.theme.PrimaryPinkLight

@Composable
fun LoginScreen(
  onLoginClick: () -> Unit,
  onRegistrationClick: () -> Unit,
  modifier: Modifier = Modifier
) {
  AuthenticationScreenTemplate(
    modifier = modifier,

    backgroundGradient = arrayOf(
      0f to PrimaryPinkBlended,
      1f to PrimaryPink
    ),
    welcomeImgRes = R.drawable.img_coder_m,
    title = "Welcome back!",
    subtitle = "Please, Log In.",
    mainActionButtonTitle = "Continue",
    secondaryActionButtonTitle = "Create an Account",

    mainActionButtonColors = ButtonDefaults.buttonColors(
      containerColor = PrimaryPinkDark,
      contentColor = Color.White
    ),
    secondaryActionButtonColors = ButtonDefaults.buttonColors(
      containerColor = PrimaryPinkLight,
      contentColor = Color.White
    ),
    actionButtonShadow = PrimaryPinkDark,
    onMainActionButtonClick = onLoginClick,
    onSecondaryActionButtonClick = onRegistrationClick
  )
}

@Composable
@Preview(showSystemUi = true)
private fun PreviewLoginScreen() {
  LoginAppUiTheme {
    LoginScreen(
      onLoginClick = {},
      onRegistrationClick = {}
    )
  }
}
