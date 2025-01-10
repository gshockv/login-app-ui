package com.gshockv.loginappui.ui.screen

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gshockv.loginappui.R
import com.gshockv.loginappui.ui.component.AuthenticationScreenTemplate
import com.gshockv.loginappui.ui.theme.LoginAppUiTheme
import com.gshockv.loginappui.ui.theme.PrimaryViolet
import com.gshockv.loginappui.ui.theme.PrimaryVioletDark
import com.gshockv.loginappui.ui.theme.PrimaryVioletLight

@Composable
fun RegistrationScreen(
  onRegisterClick: () -> Unit,
  onLoginClick: () -> Unit,
  modifier: Modifier = Modifier
) {
  AuthenticationScreenTemplate(
    modifier = modifier,

    backgroundGradient = arrayOf(
      0f to PrimaryViolet,
      1f to PrimaryVioletDark
    ),
    welcomeImgRes = R.drawable.img_coder_w,
    title = "Hi there!",
    subtitle = "Let's Get Started.",
    mainActionButtonTitle = "Create an Account",
    secondaryActionButtonTitle = "Log In",

    mainActionButtonColors = ButtonDefaults.buttonColors(
      containerColor = PrimaryVioletDark,
      contentColor = Color.White
    ),
    secondaryActionButtonColors = ButtonDefaults.buttonColors(
      containerColor = PrimaryVioletLight,
      contentColor = Color.White
    ),
    actionButtonShadow = PrimaryVioletDark,
    onMainActionButtonClick = onRegisterClick,
    onSecondaryActionButtonClick = onLoginClick
  )
}

@Composable
@Preview(showSystemUi = true)
private fun PreviewRegistrationScreen() {
  LoginAppUiTheme {
    RegistrationScreen(
      onRegisterClick = {},
      onLoginClick = {}
    )
  }
}
