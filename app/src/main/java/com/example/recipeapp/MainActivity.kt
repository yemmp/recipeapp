package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipeapp.navigation.Navigation
import com.example.recipeapp.ui.theme.RecipeappTheme
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RecipeappTheme {

                Navigation()
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    RecipeappTheme {

        MyApp()
    }
}