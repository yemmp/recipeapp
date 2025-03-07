package com.example.recipeapp.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun StyledButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    buttonText: String,
    enabled:Boolean = true
) {
    Button(modifier = modifier ,onClick= onClick, enabled = enabled) {
        Text(buttonText)
    }
}