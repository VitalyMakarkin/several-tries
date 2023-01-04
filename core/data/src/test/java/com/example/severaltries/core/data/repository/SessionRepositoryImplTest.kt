package com.example.severaltries.core.data.repository

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class SessionRepositoryImplTest {

    private lateinit var repository: SessionRepositoryImpl

    @Before
    fun setup() {
        repository = SessionRepositoryImpl()
    }

    @Test
    fun sessionRepositoryImpl_getLastSession() =
        assertEquals(
            repository.getLastSession(),
            null
        )
}