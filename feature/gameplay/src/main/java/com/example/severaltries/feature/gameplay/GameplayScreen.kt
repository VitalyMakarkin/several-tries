package com.example.severaltries.feature.gameplay

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import java.lang.reflect.Modifier

@Composable
internal fun GameplayScreen(
    modifier: Modifier,
    viewModel: GameplayViewModel = hiltViewModel()
) {
    Text(text = "Hello")
}

@Composable
fun LetterCell(letter: String) {
    Text(text = letter)
}

@Composable
fun WordRow(letters: List<String>) {
    Row {
        letters.map { LetterCell(it) }
    }
}

@Composable
fun WordColumn(wordList: List<List<String>>) {
    Column {
        wordList.map { WordRow(it) }
    }
}