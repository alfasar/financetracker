package com.example.financetracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(
    isSystemInDarkTheme: Boolean = isSystemInDarkTheme(),
    content: ComposableFun
) {

    val colors = if (isSystemInDarkTheme) {
        darkColors()
    } else {
        lightColors()
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )

}