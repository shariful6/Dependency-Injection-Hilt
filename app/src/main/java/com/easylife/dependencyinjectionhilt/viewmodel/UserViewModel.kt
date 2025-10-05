package com.easylife.dependencyinjectionhilt.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.easylife.dependencyinjectionhilt.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    val userName = mutableStateOf("")

    fun loadUser(){
        userName.value = userRepository.getUserName()
    }

}