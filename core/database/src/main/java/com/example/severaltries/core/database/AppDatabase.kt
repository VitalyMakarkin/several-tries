package com.example.severaltries.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.severaltries.core.database.dao.DictionaryWordDao
import com.example.severaltries.core.database.dao.SessionDao
import com.example.severaltries.core.database.model.DictionaryWordEntity
import com.example.severaltries.core.database.model.SessionDictionaryWordCrossRef
import com.example.severaltries.core.database.model.SessionEntity

@Database(
    entities = [
        SessionEntity::class,
        DictionaryWordEntity::class,
        SessionDictionaryWordCrossRef::class
    ],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun sessionDao(): SessionDao
    abstract fun dictionaryWordDao(): DictionaryWordDao
}