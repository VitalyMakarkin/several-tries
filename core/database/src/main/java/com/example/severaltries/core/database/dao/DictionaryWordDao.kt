package com.example.severaltries.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.severaltries.core.database.model.DictionaryWordEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DictionaryWordDao {

    @Query(value = "SELECT * FROM dictionary_words")
    fun getDictionaryWordEntities(): Flow<List<DictionaryWordEntity>>

    @Query(
        value =
            """
                SELECT * FROM dictionary_words
                WHERE id = :id
            """
    )
    fun getDictionaryWord(id: Int): Flow<DictionaryWordEntity>

    @Upsert
    suspend fun upsertDictionaryWord(entity: DictionaryWordEntity)
}