package com.example.recipeapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class StyledTextUiState(
    val username: String = "",
    val password: String = "",
    val search: String = "",
    val confirmPassword: String = "",
    val onUsernameChange: (String) -> Unit = {},
    val onPasswordChange: (String) -> Unit = {},
    val onConfirmPasswordChange: (String) -> Unit = {},
    val onSearchChange: (String) -> Unit = {}

)

class StyledTextViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(StyledTextUiState())
    val uiState = _uiState.asStateFlow()

    init {
        _uiState.update { currentState ->
            currentState.copy(
                onUsernameChange = { newUsername ->
                    _uiState.value = _uiState.value.copy(username = newUsername)
                },
                onPasswordChange = { newPassword ->
                    _uiState.value = _uiState.value.copy(password = newPassword)
                },
                onConfirmPasswordChange = { confirmPassword ->
                    _uiState.value = _uiState.value.copy(confirmPassword = confirmPassword)
                },
                onSearchChange = { newSearch ->
                    _uiState.value = _uiState.value.copy(search = newSearch)
                },

                )
        }
    }
}


