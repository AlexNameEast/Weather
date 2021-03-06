package com.example.weather.model.repository

import com.example.weather.model.entites.Weather

class RepositoryImpl: Repository {
    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorage() = Weather()
}