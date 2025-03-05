package com.example.recipeapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.example.recipeapp.data.fakeRecipes
import com.example.recipeapp.ui.components.RecipeInfo
import com.example.recipeapp.ui.components.StyledButton
import com.example.recipeapp.ui.theme.RecipeappTheme

@Composable
fun RecipeScreen(
    modifier: Modifier = Modifier,
    recipeId: Int,
    navController: NavController
) {
    val recipe = fakeRecipes.find { it.id==recipeId }
   if(recipe!=null){
       Surface(modifier.fillMaxSize()) {
           Column() {
               AsyncImage(
                   model = recipe.imgUrl,
                   contentDescription = recipe.imgStr,
                   contentScale = ContentScale.Crop,
                   modifier = Modifier.fillMaxWidth().height(300.dp)
               )
               RecipeInfo(modifier = modifier, recipe = recipe)

           }
       }
   }
    else{
        EmptyCard()
    }
}

@Composable
fun EmptyCard(modifier: Modifier = Modifier) {
    Surface(modifier.fillMaxSize()) {
        Column {
            Text("Recipe not found")
        }
    }
}


@Preview
@Composable
private fun RecipeScreenPreview() {
    val fakeNavController =  rememberNavController()
    RecipeappTheme {

        RecipeScreen(modifier = Modifier, recipeId = 6, navController = fakeNavController)
    }

}