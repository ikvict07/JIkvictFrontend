package org.jikvict.browser

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jikvict.browser.screens.HomeScreen
import org.jikvict.browser.screens.registerNavForScreen
import org.jikvict.browser.screens.registeredScreens
import org.jikvict.browser.theme.DarkTheme
import org.jikvict.browser.theme.JIkvictTypography
import org.jikvict.browser.theme.LightTheme
import org.jikvict.browser.theme.rememberInterFontFamily
import org.jikvict.browser.theme.rememberJetBrainsMonoFontFamily
import org.jikvict.browser.util.ThemeSwitcher
import org.jikvict.browser.util.ThemeSwitcherProvider
import org.jikvict.browser.util.getTheme


// TODO: Сделать @Register(name) аннотацию чтобы создать список name с обьектами помеченными этой аннотацией

// TODO: Сделать @CreateNav аннотацию чтобы создать object HomeScreenRegistrar : ScreenRegistrar<HomeScreen> by createRegistrar() для каждого class помеченого этой аннотацией
@Preview
@Composable
fun App(navController: NavHostController) {
    val fonts = JIkvictTypography(rememberInterFontFamily(), rememberJetBrainsMonoFontFamily())
    val themeToSet = if (getTheme()) DarkTheme else LightTheme
    val theme = remember { mutableStateOf(themeToSet) }
    val themeSwitcher = remember { ThemeSwitcher(theme) }
    MaterialTheme(
        colorScheme = theme.value.colorScheme(),
        typography = fonts.typography
    ) {
        CompositionLocalProvider(
            LocalNavController provides navController,
            ThemeSwitcherProvider provides themeSwitcher
        ) {
            NavHost(navController, startDestination = HomeScreen(1)) {
                registeredScreens.forEach { screen ->
                    registerNavForScreen(screen)
                }
            }
        }
    }
}


val LocalNavController =
    staticCompositionLocalOf<NavHostController> {
        error("No NavController provided")
    }

