package com.example.recipeapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recipeapp.ui.components.AuthFooter
import com.example.recipeapp.ui.components.AuthHeader
import com.example.recipeapp.ui.components.StyledButton
import com.example.recipeapp.ui.components.StyledTextField
import com.example.recipeapp.ui.theme.RecipeappTheme
import com.example.recipeapp.ui.viewmodels.StyledTextViewModel

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val viewModel: StyledTextViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val email = uiState.username
    val password = uiState.password

    Surface(modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp),
        ) {
            AuthHeader(modifier = modifier)
            Text("Login", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text("Enter your email and password", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier.size(18.dp))
            StyledTextField(
                modifier = Modifier,
                value = email,
                label = "Email",
                onValueChange = { uiState.onUsernameChange(it) })



            StyledTextField(
                modifier = Modifier,
                value = password,
                label = "Password",
                onValueChange = { uiState.onPasswordChange(it) })

            TextButton(onClick = {}) {
                Text(
                    "Forgot Password?",
                    style = MaterialTheme.typography.labelLarge
                )
            }

            StyledButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                onClick = {},
                buttonText = "Login"
            )
            AuthFooter(modifier=Modifier, text = "Don't have an account?", buttonText = "Sign in", buttonOnclick = {})


        }
    }
}


@Preview
@Composable
private fun LoginScreenPreview() {
    RecipeappTheme {
        LoginScreen()
    }

}
