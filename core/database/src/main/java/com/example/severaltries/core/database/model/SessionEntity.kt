package com.example.severaltries.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "sessions"
)
data class SessionEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    val id: Int,
    @ColumnInfo(name = COLUMN_TARGET_WORD)
    val targetWord: String
) {
    companion object {
        const val COLUMN_ID = "id"
        const val COLUMN_TARGET_WORD = "target_word"
    }
}