package com.gshockv.loginappui.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class NavGraph(val route: String) {
  data object Welcome: NavGraph(route = "welcome_screen")
  data object Login: NavGraph(route = "login_screen")
  data object Registration: NavGraph(route = "registration_screen")
  data object Home: NavGraph(route = "home_screen")
}

@Composable
fun MainAppScreen() {
  val navController = rememberNavController()

  NavHost(
    navController = navController,
    startDestination = NavGraph.Welcome.route
  ) {
    composable(route = NavGraph.Welcome.route) {
      WelcomeScreen(
        onOpenLoginClick = {
          navController.navigate(NavGraph.Login.route)
        }
      )
    }

    composable(route = NavGraph.Login.route) {
      LoginScreen(
        onLoginClick = {
          navController.navigate(NavGraph.Home.route)
        },
        onRegistrationClick = {
          navController.navigate(NavGraph.Registration.route)
        }
      )
    }

    composable(route = NavGraph.Registration.route) {
      RegistrationScreen(
        onRegisterClick = {
          navController.navigate(NavGraph.Home.route)
        },
        onLoginClick = {
          navController.navigate(NavGraph.Login.route)
        }
      )
    }

    composable(route = NavGraph.Home.route) {
      HomeScreen(
        onRestartFlowClick = {
          navController.navigate(NavGraph.Welcome.route)
        }
      )
    }
  }
}
