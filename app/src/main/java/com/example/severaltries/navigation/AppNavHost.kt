package com.example.severaltries.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.severaltries.feature.gameplay.navigation.gameplayNavigationRoute
import com.example.severaltries.feature.gameplay.navigation.gameplayScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = gameplayNavigationRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        gameplayScreen()
    }
}