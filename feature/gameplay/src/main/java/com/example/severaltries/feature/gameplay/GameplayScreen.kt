package com.example.severaltries.feature.gameplay

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun GameplayRoute(
    modifier: Modifier = Modifier,
    viewModel: GameplayViewModel = hiltViewModel()
) {
    GameplayScreen(
        modifier = modifier
    )
}

@Composable
internal fun GameplayScreen(
    modifier: Modifier,
) {
    Text(text = "Hello")
}

@Composable
private fun LetterCell(letter: String) {
    Text(text = letter)
}

@Composable
private fun WordRow(letters: List<String>) {
    Row {
        letters.map { LetterCell(it) }
    }
}

@Composable
private fun WordColumn(wordList: List<List<String>>) {
    Column {
        wordList.map { WordRow(it) }
    }
}