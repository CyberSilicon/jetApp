package com.cybersilicon.jetapp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(
                //modifier= Modifier.systemBarsPadding(),
                modifier= Modifier.background(shape = RoundedCornerShape(10.dp, 10.dp, 0.dp, 0.dp), color = Color.Black),
                containerColor = Color.Transparent,
                tonalElevation = 0.dp,
                //windowInsets = WindowInsets(0.dp),
            ) {BottomBar(navController = navController) }
        },
        //contentWindowInsets = WindowInsets(0.dp, 0.dp, 0.dp, 0.dp),
    ) {
            // Apply the padding globally to the whole BottomNavScreensController
                BottomNavGraph(navController = navController)
    }
}


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        //BottomBarScreen.Explore,
        BottomBarScreen.Chat,
        BottomBarScreen.Map,
        BottomBarScreen.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        modifier = Modifier.padding(10.dp),
        backgroundColor = Color.Transparent, // Custom background color
        contentColor = Color.Gray,
        elevation = 0.dp,
        content = {
            screens.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }

    )

}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
//        label = {
//            Text(
//                text = screen.title,
//                style = if (currentDestination?.route == screen.route) {MaterialTheme.typography.labelLarge
//                } else {MaterialTheme.typography.labelMedium},
//                color = if (currentDestination?.route == screen.route) {
//                    MaterialTheme.colorScheme.primary
//                }else {
//                    contentColorFor(backgroundColor = Color.Gray)                }
//            )},
        icon = {
            Icon(
                modifier = Modifier.padding(20.dp).size(28.dp),
                imageVector = screen.icon,
                contentDescription = "Navigation Icon",
                tint = if (currentDestination?.route == screen.route) {
                    Color.White
                }else {
                    Color.DarkGray
                }
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        //selected = currentDestination?.route == screen.route,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                    launchSingleTop = true
            }
        }
    )
}
