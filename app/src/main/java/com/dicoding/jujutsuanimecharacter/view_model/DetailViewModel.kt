package com.dicoding.jujutsuanimecharacter.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.jujutsuanimecharacter.model.DataCharacter
import com.dicoding.jujutsuanimecharacter.model.UiState
import com.dicoding.jujutsuanimecharacter.repository.CharacterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: CharacterRepository
) : ViewModel() {

    private val _uiState: MutableStateFlow<UiState<DataCharacter>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<DataCharacter>>
        get() = _uiState

    fun getDetail(id: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getDetail(id))
        }
    }
}