package com.dicoding.jujutsuanimecharacter.component

import androidx.compose.ui.graphics.vector.ImageVector
import com.dicoding.jujutsuanimecharacter.screen.Screen

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen
)