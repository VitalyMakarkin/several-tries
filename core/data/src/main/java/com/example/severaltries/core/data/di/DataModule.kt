package com.example.severaltries.core.data.di

import com.example.severaltries.core.data.repository.SessionRepository
import com.example.severaltries.core.data.repository.SessionRepositoryImpl
import com.example.severaltries.core.data.repository.WordRepository
import com.example.severaltries.core.data.repository.WordRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsWordRepository(
        wordRepository: WordRepositoryImpl
    ): WordRepository

    @Binds
    fun bindsSessionRepository(
        sessionRepository: SessionRepositoryImpl
    ): SessionRepository
}