package com.example.severaltries.core.data.repository

import com.example.severaltries.core.data.model.Session

interface SessionRepository {
    /**
     * Returns last session
     */
    fun getLastSession(): Session?
}