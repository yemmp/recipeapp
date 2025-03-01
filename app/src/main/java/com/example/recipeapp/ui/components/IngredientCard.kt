package com.example.recipeapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.recipeapp.data.Ingredient

@Composable
fun IngredientCard(modifier: Modifier = Modifier, ingredient: Ingredient) {
    Card(modifier
        .size(124.dp)
        .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(9.dp)) {
        Column(
            modifier = Modifier.padding(2.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(model = ingredient.imgUrl, contentDescription = ingredient.imgStr, contentScale = ContentScale.Crop, modifier = Modifier.weight(1f))
            Text(text = ingredient.name, style = MaterialTheme.typography.labelMedium, color = Color.Black)
        }
    }

}