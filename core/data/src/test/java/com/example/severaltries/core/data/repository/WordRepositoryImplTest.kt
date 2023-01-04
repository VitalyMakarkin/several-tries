package com.example.severaltries.core.data.repository

import com.example.severaltries.core.data.model.Word
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class WordRepositoryImplTest {

    private lateinit var repository: WordRepositoryImpl

    @Before
    fun setup() {
        repository = WordRepositoryImpl()
    }

    @Test
    fun wordRepositoryImpl_getWords() =
        assertEquals(
            repository.getWords(),
            emptyList<Word>()
        )
}