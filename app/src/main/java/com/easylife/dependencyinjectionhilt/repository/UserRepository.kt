package com.easylife.dependencyinjectionhilt.repository

import com.easylife.dependencyinjectionhilt.ApiService
import jakarta.inject.Inject


class UserRepository @Inject constructor(
    private val apiService: ApiService
) {
    fun getUserName() = apiService.getUserName()
}