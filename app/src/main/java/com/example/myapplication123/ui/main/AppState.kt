package com.example.myapplication123.ui.main

sealed class AppState {
    data class Success(val weatherData:Any) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
