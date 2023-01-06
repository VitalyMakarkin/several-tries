package com.example.severaltries.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "session_words",
    primaryKeys = [
        SessionDictionaryWordCrossRef.COLUMN_SESSION_ID,
        SessionDictionaryWordCrossRef.COLUMN_DICTIONARY_WORD_ID
    ],
    foreignKeys = [
        ForeignKey(
            entity = SessionEntity::class,
            parentColumns = [SessionEntity.COLUMN_ID],
            childColumns = [SessionDictionaryWordCrossRef.COLUMN_SESSION_ID],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = DictionaryWordEntity::class,
            parentColumns = [DictionaryWordEntity.COLUMN_ID],
            childColumns = [SessionDictionaryWordCrossRef.COLUMN_DICTIONARY_WORD_ID],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = [SessionDictionaryWordCrossRef.COLUMN_SESSION_ID]),
        Index(value = [SessionDictionaryWordCrossRef.COLUMN_DICTIONARY_WORD_ID])
    ]
)
data class SessionDictionaryWordCrossRef(
    @ColumnInfo(name = COLUMN_SESSION_ID)
    val sessionId: Int,
    @ColumnInfo(name = COLUMN_DICTIONARY_WORD_ID)
    val dictionaryWordId: Int,
//    @ColumnInfo(name = COLUMN_ATTEMPT_NUMBER)
//    val attemptNumber: Int
) {
    companion object {
        const val COLUMN_SESSION_ID = "session_id"
        const val COLUMN_DICTIONARY_WORD_ID = "dict_word_id"
//        const val COLUMN_ATTEMPT_NUMBER = "attempt_number"
    }
}
