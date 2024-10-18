package com.cybersilicon.jetapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cybersilicon.jetapp.screens.ChatScreen
import com.cybersilicon.jetapp.screens.ExploreScreen
import com.cybersilicon.jetapp.screens.MapScreen
import com.cybersilicon.jetapp.screens.ProfileScreen


@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route ) {
        composable(route = BottomBarScreen.Home.route) { ExploreScreen() }
        composable(route = BottomBarScreen.Map.route) { MapScreen() }
        composable(route = BottomBarScreen.Chat.route) { ChatScreen() }
        composable(route = BottomBarScreen.Profile.route) { ProfileScreen() }
    }
}