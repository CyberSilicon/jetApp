package com.cybersilicon.jetapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun ExploreScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF5F5F5))) {
        // Carte interactive
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Gray)) {
            // Afficher la carte ici (utiliser une bibliothèque de cartes comme Google Maps ou Mapbox)
            Text("Carte des événements", color = Color.White, modifier = Modifier.align(Alignment.Center))
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Section Exploration Hors Périmetres
        Text(
            text = "UpComming France Events!",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp)
        )

        // Liste horizontale des événements
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            EventCard(title = "Concert a Nancy", date = "21 Oct", popularity = "Hot!")
            EventCard(title = "Conférence Tech à Paris", date = "15 Nov", popularity = "Trending")
            EventCard(title = "Cérémonie de Noel", date = "15 Nov", popularity = "Trending")
            // Ajouter plus d'événements ici
        }

        Spacer(modifier = Modifier.height(16.dp))
        // Section suggestions
        Text(
            text = "Recommandés pour vous",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            modifier = Modifier.padding(start = 16.dp)
        )
        // Liste d'événements recommandés (affichage vertical)
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            EventCard(title = "Festival au Japon", date = "5 Dec", popularity = "New")
            EventCard(title = "Exposition à Berlin", date = "30 Nov", popularity = "Popular")
            // Ajouter plus de recommandations ici
        }
    }
}

@Composable
fun EventCard(title: String, date: String, popularity: String) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(180.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = title, fontWeight = FontWeight.Bold, color = Color.Black)
            Text(text = date, style = MaterialTheme.typography.bodyMedium)
            Text(text = popularity, style = MaterialTheme.typography.bodySmall, color = Color.Red)
        }
    }
}
