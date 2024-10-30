package com.cybersilicon.jetapp.screens.chatScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatTopBar() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Friends", "Area")

    val primaryColor = Color(0xFF9581D0)
    val backgroundColor = Color(0xFF1A1C29)

    Surface(
        color = backgroundColor,
        tonalElevation = 4.dp
    ) {
        Column {
            //TopAppBar(title = { Text("Chat") })
            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = backgroundColor,
                contentColor = primaryColor
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        modifier = Modifier
                            .drawBehind {
                                // Dessine une bordure blanche de 2 dp uniquement en haut
                                drawLine(
                                    color = Color.White,
                                    start = Offset(0f, 0f),
                                    end = Offset(size.width, 0f),
                                    strokeWidth = 1.dp.toPx()
                                )
                            },
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = {
                            Text(
                                modifier = Modifier.padding(8.dp),
                                text = title,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (selectedTab == index) primaryColor else Color.LightGray
                            )
                        }
                    )
                }
            }
        }
    }
}
