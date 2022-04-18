package com.example.weather.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.model.AppState
import com.example.weather.model.repository.Repository
import java.lang.Thread.sleep

class MainViewModel(private val repository: Repository) : ViewModel() {
    private val localLiveData = MutableLiveData<AppState>()
    val liveData: LiveData<AppState> get() = localLiveData

    fun getWeatherFromLocalStorageRus() = getDataFromLocalSource(isRussian = true)

    fun getWeatherFromLocalStorageWorld() = getDataFromLocalSource(isRussian = false)

    private fun getDataFromLocalSource(isRussian: Boolean) {
        localLiveData.value = AppState.Loading
        Thread {
            sleep(1000)
            if (isRussian)
                localLiveData.postValue(AppState.Success(repository.getWeatherFromLocalStorageRus()))
            else
                localLiveData.postValue((AppState.Success(repository.getWeatherFromLocalStorageWorld())))
        }.start()
    }
}