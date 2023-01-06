package com.example.severaltries.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "dictionary_words"
)
data class DictionaryWord(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    val id: Int,
    @ColumnInfo(name = COLUMN_WORD)
    val word: String
) {
    companion object {
        const val COLUMN_ID = "id"
        const val COLUMN_WORD = "word"
    }
}
