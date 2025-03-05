package com.example.recipeapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.recipeapp.navigation.Screen
import com.example.recipeapp.ui.components.AuthFooter
import com.example.recipeapp.ui.components.AuthHeader
import com.example.recipeapp.ui.components.StyledButton
import com.example.recipeapp.ui.components.StyledTextField
import com.example.recipeapp.ui.theme.RecipeappTheme
import com.example.recipeapp.ui.viewmodels.StyledTextViewModel

@Composable
fun SignInScreen(modifier: Modifier = Modifier, navController: NavController) {
    val viewModel: StyledTextViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val email = uiState.username
    val password = uiState.password
    val confirmPassword = uiState.confirmPassword
    Surface(modifier.fillMaxSize()) {
        AuthHeader(modifier = modifier)

        Column(
            modifier = Modifier
                .padding(24.dp)
                .wrapContentSize()
                .offset(y = 100.dp)
                .clip(
                    RoundedCornerShape(5)
                )
                .background(color = MaterialTheme.colorScheme.background.copy(alpha = 0.8f))

        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                Text(
                    "Register",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Text("Enter your email and password", style = MaterialTheme.typography.labelMedium)
                Spacer(modifier.size(18.dp))
                StyledTextField(
                    modifier = Modifier,
                    value = email,
                    label = "Email",
                    onValueChange = { uiState.onUsernameChange(it) },
                    leadingIcon = Icons.Default.AccountCircle
                )



                StyledTextField(
                    modifier = Modifier,
                    value = password,
                    label = "Password",
                    onValueChange = { uiState.onPasswordChange(it) },
                    leadingIcon = Icons.Default.Lock
                )
                StyledTextField(
                    modifier = Modifier,
                    value = confirmPassword,
                    label = "Confirm Password",
                    onValueChange = { uiState.onConfirmPasswordChange(it) },
                    leadingIcon = Icons.Default.Lock
                )



                StyledButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    onClick = { navController.navigate(Screen.HomeScreen.route) },
                    buttonText = "Sign In"
                )
                AuthFooter(
                    modifier = Modifier,
                    text = "Already have an account?",
                    buttonText = "Log in",
                    buttonOnclick = { navController.navigate(Screen.LoginScreen.route) })


            }
        }
    }
}


@Preview
@Composable
private fun SignInScreenPreview() {
    val fakeNavController = rememberNavController()
    RecipeappTheme {
        SignInScreen(navController = fakeNavController)
    }

}
