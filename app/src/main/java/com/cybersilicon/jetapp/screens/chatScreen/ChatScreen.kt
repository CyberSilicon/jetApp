    package com.cybersilicon.jetapp.screens.chatScreen
    import androidx.compose.foundation.BorderStroke
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.lazy.LazyColumn
    import androidx.compose.foundation.lazy.items
    import androidx.compose.foundation.shape.CircleShape
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.filled.PersonPin
    import androidx.compose.material.icons.filled.SupervisedUserCircle
    import androidx.compose.material.icons.filled.Workspaces
    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.draw.clip
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.cybersilicon.jetapp.Chat
    import com.cybersilicon.jetapp.sampleChats
    import com.cybersilicon.jetapp.ui.theme.Color.*


    @Composable
    fun ChatScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp) // Padding pour la topbar système
        ) {
            MainTopBar()
            LocationTopBar()
            ChatTopBar()
            // Liste des messages
            LazyColumn(modifier = Modifier.padding(8.dp)) {
                items(sampleChats) { chat ->
                    ChatItem(chat)
                }
            }
        }
    }

    @Composable
    fun ChatItem(chat: Chat) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                //chat.profileImage,
                imageVector = Icons.Filled.SupervisedUserCircle,
                contentDescription = "Profile Image",
                modifier = Modifier.size(55.dp).clip(CircleShape).border(
                    BorderStroke(2.dp, Color.Gray), CircleShape
                ),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = chat.username, fontWeight = FontWeight.Medium, fontSize = 19.sp, color = Color.Black)
                Text(text = chat.lastMessage, fontSize = 15.sp, color = Color.Gray)
            }

            //Timestamp and unreead msg badge
            Column(horizontalAlignment = Alignment.End) {
                Text(text = chat.time, fontSize = 14.sp, color = Color.Gray)
                if (chat.unreadCount > 0) {
                    // Utiliser Badge pour afficher le nombre de messages non lus
                    Badge(
                        containerColor = Color.Cyan,
                        contentColor = Color.Black,
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Text(text = chat.unreadCount.toString())
                    }
                }
            }
        }
    }