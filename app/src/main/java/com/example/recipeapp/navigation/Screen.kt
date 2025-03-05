package com.example.recipeapp.navigation

sealed class Screen(val route: String) {

    object LoginScreen : Screen("login")
    object SignInScreen : Screen("signin")
    object HomeScreen : Screen("home")
    object RecipeScreen : Screen("recipe/{recipeId}"){
        fun createRoute(recipeId:Int)="recipe/$recipeId"
    }

}