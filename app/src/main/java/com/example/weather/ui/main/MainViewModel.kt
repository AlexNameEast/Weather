package com.example.weather.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.model.AppState
import com.example.weather.model.repository.Repository
import java.lang.Thread.sleep
import kotlin.reflect.KProperty

class MainViewModel(private val repository: Repository) : ViewModel() {
    private val localLiveData = MutableLiveData<AppState>()
    val liveData: LiveData<AppState> get() = localLiveData

    fun getWeather() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        localLiveData.value = AppState.Loading
        Thread {
            sleep(1000)
            localLiveData.postValue(AppState.Success(repository.getWeatherFromLocalStorage()))
        }.start()
    }
}