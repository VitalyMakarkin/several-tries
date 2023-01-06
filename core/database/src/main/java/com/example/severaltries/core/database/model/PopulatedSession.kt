package com.example.severaltries.core.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class PopulatedSession(
    @Embedded
    val session: SessionEntity,
    @Relation(
        parentColumn = SessionEntity.COLUMN_ID,
        entityColumn = DictionaryWordEntity.COLUMN_ID,
        associateBy = Junction(
            value = SessionDictionaryWordCrossRef::class,
            parentColumn = SessionDictionaryWordCrossRef.COLUMN_SESSION_ID,
            entityColumn = SessionDictionaryWordCrossRef.COLUMN_DICTIONARY_WORD_ID
        )
    )
    val attemptWords: List<DictionaryWordEntity>
)