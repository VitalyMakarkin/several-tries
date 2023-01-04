package com.example.severaltries.feature.gameplay.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.severaltries.feature.gameplay.GameplayRoute

const val gameplayNavigationRoute = "gameplay"

fun NavController.navigateToGameplay(navOptions: NavOptions? = null) {
    this.navigate(gameplayNavigationRoute, navOptions)
}

fun NavGraphBuilder.gameplayScreen() {
    composable(route = gameplayNavigationRoute) {
        GameplayRoute()
    }
}