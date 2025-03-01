package com.example.recipeapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LunchDining
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recipeapp.ui.components.AuthFooter
import com.example.recipeapp.ui.components.StyledButton
import com.example.recipeapp.ui.components.StyledTextField
import com.example.recipeapp.ui.theme.RecipeappTheme
import com.example.recipeapp.ui.viewmodels.StyledTextViewModel

@Composable
fun SignInScreen(modifier: Modifier = Modifier) {
    val viewModel: StyledTextViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val email = uiState.username
    val password = uiState.password
    val confirmPassword = uiState.confirmPassword
    Surface(modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp),
        ) {
            AuthHeader(modifier = modifier)
            Text("Register", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
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
            StyledTextField(
                modifier = Modifier,
                value = confirmPassword,
                label = "Confirm Password",
                onValueChange = { uiState.onConfirmPasswordChange(it) })



            StyledButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                onClick = {},
                buttonText = "Sign In"
            )
            AuthFooter(
                modifier = Modifier,
                text = "Already have an account?",
                buttonText = "Log in",
                buttonOnclick = {})


        }
    }
}


@Composable
fun AuthHeader(
    modifier: Modifier = Modifier,
//               imageSrc: String, imageTitle: String
) {
//    AsyncImage(modifier = modifier, model = imageSrc, contentDescription = imageTitle)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            Icons.Filled.LunchDining,
            contentDescription = "App Logo Icon",
            Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(15))
                .background(color = MaterialTheme.colorScheme.primary),
            tint = Color.White

        )
        Text("Recipes App")
    }
}

@Preview
@Composable
private fun SignInScreenPreview() {
    RecipeappTheme {
        SignInScreen()
    }

}
