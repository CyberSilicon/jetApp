package com.cybersilicon.jetapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.BubbleChart
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.BubbleChart
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.BubbleChart
import androidx.compose.material.icons.rounded.ChatBubble
import androidx.compose.material.icons.rounded.ChatBubbleOutline
import androidx.compose.material.icons.rounded.DashboardCustomize
import androidx.compose.material.icons.rounded.Explore
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Person2
import androidx.compose.material.icons.rounded.PersonPin
import androidx.compose.material.icons.rounded.PersonPinCircle
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val title : String,
    val icon : ImageVector,
    val route : String,
    val hasNews : Boolean,
    val badgeCount: Int? = null
    //val selectedIcon : ImageVector,
    //val unselectedIcon : ImageVector,

) {
//   data object Explore : BottomBarScreen(
//        title = "Explore",
//        icon = Icons.Rounded.Explore,
//        route = "explore",
//        hasNews = false
////        selectedIcon = Icons.Rounded.Explore,
////        unselectedIcon = Icons.Outlined.Explore,
//
//    )
    data object Map : BottomBarScreen(
        title = "Map",
        icon = Icons.Rounded.DashboardCustomize,
        route = "map",
        hasNews = false,
//        selectedIcon = Icons.Rounded.BubbleChart,
//        unselectedIcon = Icons.Outlined.BubbleChart,
    )
    data object Chat : BottomBarScreen(
        title = "Chat",
        icon = Icons.Rounded.ChatBubble,
        route = "chat",
//        selectedIcon = Icons.Rounded.ChatBubble,
//        unselectedIcon = Icons.Rounded.ChatBubbleOutline,
        hasNews = false,
        badgeCount = 6
    )
    data object Profile : BottomBarScreen(
        title = "PersonPin",
        icon = Icons.Rounded.AccountCircle,
        route = "profile",
        hasNews = true
    //      selectedIcon = Icons.Rounded.AccountCircle,
//        unselectedIcon = Icons.Outlined.AccountCircle,
    )
}