package com.example.uitransportaion.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

enum class Screens {
    HomePage,
    EtiketPage,
    AkitvitasPage,
    ProfilePage
}

data class NavItem(
    val label : String,
    val icon : ImageVector,
    val route : String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Rounded.Home,
        route = Screens.HomePage.name
    ),
    NavItem(
        label = "Etiket",
        icon = Icons.Rounded.AirplaneTicket,
        route = Screens.EtiketPage.name
    ),
    NavItem(
        label = "Aktivitas",
        icon = Icons.Rounded.DocumentScanner,
        route = Screens.AkitvitasPage.name
    ),
    NavItem(
        label = "Profile",
        icon = Icons.Rounded.SupervisedUserCircle,
        route = Screens.ProfilePage.name
    ),
)


