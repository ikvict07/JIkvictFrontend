package org.jikvict.browser.util

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import org.jikvict.browser.LocalNavController
import org.jikvict.browser.theme.DarkTheme
import org.jikvict.browser.theme.LightTheme


@Composable
fun DefaultPreview(isDark: Boolean = true, content: @Composable () -> Unit) {
    val theme = if (isDark) {
        DarkTheme
    } else {
        LightTheme
    }
    MaterialTheme(colorScheme = theme.colorScheme()) {
        val navController = rememberNavController()
        val themeSwitcher = PreviewThemeSwitcher(isDark)
        CompositionLocalProvider(
            LocalNavController provides navController,
            ThemeSwitcherProvider provides themeSwitcher
        ) {
            content()
        }
    }
}

class PreviewThemeSwitcher(var isDarkT: Boolean) : IThemeSwitcher {
    override val isDark: Boolean
        get() = isDarkT

    override fun switchTheme() {
    }
}