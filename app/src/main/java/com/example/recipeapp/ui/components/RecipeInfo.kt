package com.example.recipeapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.recipeapp.data.Recipe

@Composable
fun RecipeInfo(modifier: Modifier = Modifier, recipe: Recipe,onClick: ()-> Unit) {
    val ingredients = recipe.ingredients
    Card(
        modifier
            .fillMaxSize()
            .offset(y = (-20).dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(5)
    ) {
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
        Spacer(modifier.size(156.dp))

        StyledButton(modifier = Modifier.fillMaxWidth(0.5f).offset(x = 100.dp), onClick = onClick, buttonText = "Close")
    }
}

