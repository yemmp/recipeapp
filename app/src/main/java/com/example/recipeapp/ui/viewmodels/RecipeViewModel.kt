package com.example.recipeapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.data.fakeRecipes

class RecipeViewModel:ViewModel(){
    val recipes: List<Recipe> = fakeRecipes
}