package com.example.severaltries.core.data.repository

import com.example.severaltries.core.data.model.Word

interface WordRepository {
    /**
     * Returns available word
     */
    fun getWords(): List<Word>
}