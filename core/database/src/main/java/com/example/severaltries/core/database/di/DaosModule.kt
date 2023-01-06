package com.example.severaltries.core.database.di

import com.example.severaltries.core.database.AppDatabase
import com.example.severaltries.core.database.dao.DictionaryWordDao
import com.example.severaltries.core.database.dao.SessionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {

    @Provides
    fun provideSessionDao(
        database: AppDatabase
    ): SessionDao = database.sessionDao()

    @Provides
    fun provideDictionaryWordDao(
        database: AppDatabase
    ): DictionaryWordDao = database.dictionaryWordDao()
}