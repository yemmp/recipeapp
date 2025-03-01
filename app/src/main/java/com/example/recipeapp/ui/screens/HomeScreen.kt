package com.example.recipeapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.data.fakeRecipes
import com.example.recipeapp.ui.theme.RecipeappTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier,recipes:List<Recipe>) {
    Surface(modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Recipes", style = MaterialTheme.typography.headlineMedium)
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            content= {
                items(recipes){recipe ->
                    RecipeCard(recipe=recipe)
                }
            }
        )
        }
    }
}

@Composable
fun RecipeCard(modifier: Modifier = Modifier,recipe:Recipe) {
    Card(modifier
        .size(248.dp)
        .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(6.dp)) {
        Column(
            modifier = Modifier.padding(2.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(model = recipe.imgUrl, contentDescription = recipe.imgStr, contentScale = ContentScale.Crop, modifier = Modifier.weight(1f))
            Text(text = recipe.title, style = MaterialTheme.typography.labelLarge, color = Color.Black)
            Spacer(modifier.size(6.dp))
            Text(text = recipe.description, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    RecipeappTheme {
        HomeScreen(recipes = fakeRecipes)
    }

}