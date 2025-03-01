package com.example.recipeapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipeapp.data.Recipe

@Composable
fun RecipeInfo(modifier: Modifier = Modifier, recipe: Recipe) {
    val ingredients = recipe.ingredients
    Card(modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(recipe.title, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier.size(12.dp))
            Text("About", style = MaterialTheme.typography.titleSmall)
            Spacer(modifier.size(6.dp))
            Text(recipe.description, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier.size(12.dp))
            Text("Instructions", style = MaterialTheme.typography.titleSmall)
            Spacer(modifier.size(6.dp))
            Text(recipe.instructions, style = MaterialTheme.typography.bodyMedium)


        }
        LazyRow {
            items(ingredients) { ingredient ->
                IngredientCard(ingredient = ingredient)
            }

        }
    }
}

