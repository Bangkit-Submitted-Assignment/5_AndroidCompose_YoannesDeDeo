package com.dicoding.jujutsuanimecharacter.screen

sealed class Screen (val route :String) {
    object Home:Screen("home")
    object Profile:Screen("profile")
    object DetailCharacter:Screen("home/{id}"){
        fun createRoute(id: Long)="home/$id"
    }
}

