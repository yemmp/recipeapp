package com.example.recipeapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.data.fakeRecipes
import com.example.recipeapp.ui.components.RecipeInfo
import com.example.recipeapp.ui.theme.RecipeappTheme

@Composable
fun RecipeScreen(
    modifier: Modifier = Modifier,
    recipe: Recipe
) {
    Surface(modifier.fillMaxSize()) {
        Column {
            AsyncImage(
                model = recipe.imgUrl,
                contentDescription = recipe.imgStr
            )
            RecipeInfo(modifier = modifier, recipe = recipe)
        }
    }
}



@Preview
@Composable
private fun RecipeScreenPreview() {
    RecipeappTheme {

        RecipeScreen(modifier = Modifier, recipe = fakeRecipes.component2())
    }

}