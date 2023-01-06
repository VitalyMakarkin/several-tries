package com.example.severaltries.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import com.example.severaltries.core.database.model.SessionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {

    @Transaction
    @Query(
        value = """
            SELECT * FROM sessions
            ORDER BY id DESC
        """
    )
    fun getLastSession(): Flow<SessionEntity>

    @Upsert
    suspend fun upsertSession(entity: SessionEntity)
}