package com.cybersilicon.jetapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ImageSearch
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.PersonPinCircle
import androidx.compose.ui.graphics.vector.ImageVector


 data class Chat(
        val username: String,
        val lastMessage: String,
        val time: String,
        val unreadCount: Int,
        val profileImage: ImageVector
    )

    val sampleChats = listOf(
        Chat("Kelas Malam", "kevin.eth is typing...", "14:28", 1, Icons.Rounded.ImageSearch),
        Chat("Jocelyn Gouse", "You're now an admin", "yesterday", 3, Icons.Rounded.ImageSearch),
        Chat("Minari Sol", "Just sent the design, feel this...", "yesterday", 0, Icons.Rounded.ImageSearch),
        Chat("kevin.eth", "kevin.eth is typing...", "14:28", 1, Icons.Rounded.ImageSearch),
        Chat("druids.eth", "I thought it was you, lol", "yesterday", 2, Icons.Rounded.ImageSearch),
        Chat("minari.sol", "Just sent the design, feel this...", "yesterday", 0, Icons.Rounded.ImageSearch),
        Chat("kevin.eth", "kevin.eth is typing...", "14:28", 1, Icons.Rounded.ImageSearch),
        Chat("druids.eth", "I thought it was you, lol", "yesterday", 7, Icons.Rounded.ImageSearch),
        Chat("minari.sol", "Just sent the design, feel this...", "yesterday", 0, Icons.Rounded.ImageSearch),Chat("kevin.eth", "kevin.eth is typing...", "14:28", 1, Icons.Rounded.PersonPinCircle),
        Chat("druids.eth", "I thought it was you, lol", "yesterday", 26, Icons.Rounded.ImageSearch),
        Chat("minari.sol", "Just sent the design, feel this...", "yesterday", 0, Icons.Rounded.ImageSearch),
        Chat("kevin.eth", "kevin.eth is typing...", "14:28", 2, Icons.Rounded.ImageSearch),
        Chat("druids.eth", "I thought it was you, lol", "yesterday", 1, Icons.Rounded.ImageSearch),
        Chat("minari.sol", "Just sent the design, feel this...", "yesterday", 0, Icons.Rounded.ImageSearch),

        //Autres chats ici
    )
