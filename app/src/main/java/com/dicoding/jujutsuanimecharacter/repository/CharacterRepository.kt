package com.dicoding.jujutsuanimecharacter.repository

import com.dicoding.jujutsuanimecharacter.model.AtributeCharacter
import com.dicoding.jujutsuanimecharacter.model.DataCharacter

class CharacterRepository {

    fun getCharacter(): List<AtributeCharacter> {
        return DataCharacter.dataCharacter
    }

    fun searchHeroes(query: String): List<AtributeCharacter> {
        return DataCharacter.dataCharacter.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

    fun getDetail(id: Long): AtributeCharacter? {
        return DataCharacter.dataCharacter.firstOrNull(){
            it.id==id
        }
    }


    companion object {
        @Volatile
        private var instance: CharacterRepository? = null

        fun getInstance(): CharacterRepository =
            instance ?: synchronized(this) {
                CharacterRepository().apply {
                    instance = this
                }
            }
    }
}