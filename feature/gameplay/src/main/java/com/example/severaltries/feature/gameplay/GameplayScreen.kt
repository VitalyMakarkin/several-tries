package com.example.severaltries.feature.gameplay

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun GameplayRoute(
    modifier: Modifier = Modifier,
    viewModel: GameplayViewModel = hiltViewModel()
) {
    val gameplayUiState by viewModel.gameplayUiState.collectAsStateWithLifecycle()

    GameplayScreen(
        gameplayUiState = gameplayUiState,
        modifier = modifier
    )
}

@Composable
internal fun GameplayScreen(
    gameplayUiState: GameplayUiState,
    modifier: Modifier = Modifier,
) {
    when (gameplayUiState) {
        is GameplayUiState.Success -> {
            Column(
                modifier = modifier
            ) {
                gameplayUiState.words.map { word ->
                    Text(text = word)
                }
            }
        }

        is GameplayUiState.Error -> {
            Text(text = "Error!")
        }

        is GameplayUiState.Loading -> {
            Text(text = "Loading...")
        }
    }
}