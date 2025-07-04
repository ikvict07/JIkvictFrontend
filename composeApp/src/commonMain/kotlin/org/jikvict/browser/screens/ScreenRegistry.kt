package org.jikvict.browser.screens

val registeredScreens = listOf<ScreenRegistrar<out NavigableScreen>>(
    HomeScreenRegistrar,
    NotFoundScreenRegistrar,
    MakeJarScreenRegistrar,
)
val routers = listOf<ScreenRouterRegistrar<out NavigableScreen>>(
    HomeScreenRouterRegistrar,
    NotFoundScreenRouterRegistrar,
    MakeJarScreenRouterRegistrar,
)