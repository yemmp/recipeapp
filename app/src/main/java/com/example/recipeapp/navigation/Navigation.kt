package com.example.recipeapp.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recipeapp.ui.screens.HomeScreen
import com.example.recipeapp.ui.screens.LoginScreen
import com.example.recipeapp.ui.screens.RecipeScreen
import com.example.recipeapp.ui.screens.SignInScreen
import com.example.recipeapp.ui.viewmodels.RecipeViewModel

@Composable
fun Navigation(recipeViewModel:RecipeViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController= navController, startDestination = Screen.LoginScreen.route) {
        composable( route = Screen.LoginScreen.route){
            LoginScreen(navController=navController)
        }
        composable( route = Screen.SignInScreen.route){
            SignInScreen(navController=navController)
        }
         composable( route = Screen.HomeScreen.route){
            HomeScreen(navController=navController, recipes = recipeViewModel.recipes)
        }
        composable( route = Screen.RecipeScreen.route){ backStackEntry ->
            val recipeId = backStackEntry.arguments?.getString("recipeId")?.toIntOrNull()
            RecipeScreen(navController=navController, recipeId = recipeId?:0)
        }

    }

}