package com.example.recipeapp.ui.screens

import android.util.Log
import android.widget.Toast
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
import com.example.recipeapp.ui.viewmodels.AuthViewModel
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun SignInScreen(modifier: Modifier = Modifier, navController: NavController) {
    val viewModel: AuthViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val auth = Firebase.auth
    val email = uiState.username
    val password = uiState.password
    val confirmPassword = uiState.confirmPassword
    val context = LocalContext.current
    val btnEnabled = email.isNotBlank() && password.isNotBlank() && confirmPassword.isNotBlank()

    fun handleSignUp(
        username: String,
        password: String,
        passwordConfirmation: String,

        ) {
        if (password != passwordConfirmation) {
            Toast.makeText(context, "Passwords Doesn't Match", Toast.LENGTH_SHORT).show()
            return
        } else {
            auth.createUserWithEmailAndPassword(username, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    navController.navigate(Screen.HomeScreen.route)
                    Log.i("SignIn", "create user: sucessful")
                } else {
                    Log.i("SignIn", "create user: failure", task.exception)
                    Toast.makeText(
                        context,
                        "User creation error: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }
    }


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
                    onValueChange = { viewModel.onUsernameChange(it) },
                    leadingIcon = Icons.Default.AccountCircle
                )



                StyledTextField(
                    modifier = Modifier,
                    value = password,
                    label = "Password",
                    onValueChange = { viewModel.onPasswordChange(it) },
                    leadingIcon = Icons.Default.Lock,
                    visualTransformation = PasswordVisualTransformation()
                )
                StyledTextField(
                    modifier = Modifier,
                    value = confirmPassword,
                    label = "Confirm Password",
                    onValueChange = { viewModel.onConfirmPasswordChange(it) },
                    leadingIcon = Icons.Default.Lock,
                    visualTransformation = PasswordVisualTransformation()
                )



                StyledButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    onClick = {
                        handleSignUp(
                            username = email,
                            password = password,
                            passwordConfirmation = confirmPassword,
                        )
                    },
                    buttonText = "Sign Up",
                    enabled = btnEnabled
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
