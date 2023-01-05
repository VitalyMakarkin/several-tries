package com.example.severaltries.feature.gameplay

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class GameplayViewModel @Inject constructor() : ViewModel() {

    val gameplayUiState: StateFlow<GameplayUiState> =
        gameplayUiState()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = GameplayUiState.Loading
            )
}

private fun gameplayUiState(): Flow<GameplayUiState> {
    return flow {
        GameplayUiState.Success(
            words = listOf(
                "word1",
                "word2",
                "word3"
            )
        )
    }
}

sealed interface GameplayUiState {
    data class Success(val words: List<String>) : GameplayUiState
    object Error : GameplayUiState
    object Loading : GameplayUiState
}