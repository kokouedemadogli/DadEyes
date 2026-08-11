package com.dadeyes.parental.presentation.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Primary,
    onPrimary = OnPrimary,
    primaryContainer = Primary.copy(alpha = 0.1f),
    onPrimaryContainer = Primary,
    secondary = Secondary,
    onSecondary = Color.White,
    secondaryContainer = Secondary.copy(alpha = 0.1f),
    onSecondaryContainer = Secondary,
    tertiary = Tertiary,
    onTertiary = Color.White,
    tertiaryContainer = Tertiary.copy(alpha = 0.1f),
    onTertiaryContainer = Tertiary,
    error = Error,
    onError = Color.White,
    errorContainer = ErrorContainer,
    onErrorContainer = Error,
    background = Background,
    onBackground = OnBackground,
    surface = Surface,
    onSurface = OnSurface,
    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = OnSurface.copy(alpha = 0.7f),
    outline = OnSurface.copy(alpha = 0.5f),
    outlineVariant = OnSurface.copy(alpha = 0.2f),
    scrim = Color.Black
)

private val DarkColors = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = Primary.copy(alpha = 0.2f),
    onPrimaryContainer = Primary.copy(alpha = 0.9f),
    secondary = Secondary,
    onSecondary = Color.Black,
    secondaryContainer = Secondary.copy(alpha = 0.2f),
    onSecondaryContainer = Secondary.copy(alpha = 0.9f),
    tertiary = Tertiary,
    onTertiary = Color.White,
    tertiaryContainer = Tertiary.copy(alpha = 0.2f),
    onTertiaryContainer = Tertiary.copy(alpha = 0.9f),
    error = Error,
    onError = Color.White,
    errorContainer = Error.copy(alpha = 0.2f),
    onErrorContainer = Error.copy(alpha = 0.9f),
    background = Color(0xFF121212),
    onBackground = Color(0xFFFFFFFF),
    surface = Color(0xFF1F1F1F),
    onSurface = Color(0xFFFFFFFF),
    surfaceVariant = Color(0xFF2F2F2F),
    onSurfaceVariant = Color(0xFFBBBBBB),
    outline = Color(0xFFBBBBBB),
    outlineVariant = Color(0xFF666666),
    scrim = Color.Black
)

@Composable
fun DadEyesTheme(
    darkTheme: Boolean = false,
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColors
        else -> LightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}