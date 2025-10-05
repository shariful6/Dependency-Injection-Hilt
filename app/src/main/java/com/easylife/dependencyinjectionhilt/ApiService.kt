package com.easylife.dependencyinjectionhilt

interface ApiService {
    fun getUserName(): String
}

class FakeApiService : ApiService {
    override fun getUserName() = "👋 Hello, Sanjay Kumar"
}