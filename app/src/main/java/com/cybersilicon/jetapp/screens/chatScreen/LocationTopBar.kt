package com.cybersilicon.jetapp.screens.chatScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.PersonPinCircle
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LocationTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)) // Ajouter le clip ici
            .background(Color(0xFF1A1C29))
            .border(
                border = BorderStroke(2.dp, Color.Transparent),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp
                ) // Bordure arrondie pour top-left et top-right
            )
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(start = 16.dp),
        ) {
            Image(
                painter = rememberVectorPainter(Icons.Rounded.AccountCircle),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape) // Pour arrondir l'image
                    .border(2.dp, Color.White, CircleShape) // Bordure blanche autour de l'image
            )

            Spacer(modifier = Modifier.width(8.dp))
        }
        Text(
            text = "USA, Maine",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
        IconButton(onClick = { /* Search Action */ }) {
            Icon(imageVector = Icons.Rounded.Search, contentDescription = "Search Isssscon", tint = Color.White, modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                //.background(color = Color.DarkGray, shape = CircleShape)
            )
        }
    }
}
