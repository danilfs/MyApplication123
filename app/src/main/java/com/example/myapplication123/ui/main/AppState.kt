package com.example.myapplication123.ui.main

import com.example.myapplication123.Weather

sealed class AppState {
    data class Success(val weatherData:Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
