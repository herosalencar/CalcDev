package br.com.halcoder.calcdev.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val DarkColorScheme = darkColorScheme(
    background = NavyBlue,
    primary = LightNavyBlue,
    secondary = MediumBlue,
    onSecondary = Black,
    surface = LightBlue,
    onSurface = White,
)

private val LightColorScheme = lightColorScheme(
    background = White,
    primary = LightNavyBlue,
    secondary = MediumBlue,
    onSecondary = White,
    surface = LightBlue,
    onSurface = Black,
)

val CalculatorButtonsTextStyle = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Medium
)

val CalculatorButtonsSpecialOperatorsTextStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Medium
)

@Composable
fun CalcDevTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}