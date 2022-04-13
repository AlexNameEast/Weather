package com.example.weather.model.repository

import com.example.weather.model.entites.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}