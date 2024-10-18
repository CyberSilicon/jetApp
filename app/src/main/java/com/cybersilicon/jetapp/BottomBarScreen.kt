package com.cybersilicon.jetapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.BubbleChart
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.BubbleChart
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val title : String,
    val icon : ImageVector,
    val route : String,
    val selectedIcon : ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews : Boolean,
    val badgeCount: Int? = null
) {
   data object Home : BottomBarScreen(
        title = "Home",
        icon = Icons.Filled.Home,
        route = "home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        hasNews = false
    )
    data object Map : BottomBarScreen(
        title = "Map",
        icon = Icons.Filled.BubbleChart,
        route = "map",
        selectedIcon = Icons.Filled.BubbleChart,
        unselectedIcon = Icons.Outlined.BubbleChart,
        hasNews = false
    )
    data object Chat : BottomBarScreen(
        title = "Chat",
        icon = Icons.Filled.ChatBubble,
        route = "chat",
        selectedIcon = Icons.Filled.ChatBubble,
        unselectedIcon = Icons.Outlined.ChatBubbleOutline,
        hasNews = false,
        badgeCount = 6
    )
    data object Profile : BottomBarScreen(
        title = "Profile",
        icon = Icons.Filled.AccountCircle,
        route = "profile",
        selectedIcon = Icons.Filled.AccountCircle,
        unselectedIcon = Icons.Outlined.AccountCircle,
        hasNews = true
    )
}