package com.example.weather.model.repository

import com.example.weather.model.entites.Weather
import com.example.weather.model.entites.getRussianCities
import com.example.weather.model.entites.getWorldCities

class RepositoryImpl: Repository {
    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}