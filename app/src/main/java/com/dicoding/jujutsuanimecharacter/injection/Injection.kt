package com.dicoding.jujutsuanimecharacter.injection

import com.dicoding.jujutsuanimecharacter.repository.CharacterRepository

object Injection {
    fun provideRepository(): CharacterRepository {
        return CharacterRepository.getInstance()
    }
}