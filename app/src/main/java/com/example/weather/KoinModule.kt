package com.example.weather

import com.example.weather.model.repository.Repository
import com.example.weather.model.repository.RepositoryImpl
import com.example.weather.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<Repository> { RepositoryImpl() }


    // view modules
    viewModel { MainViewModel(get()) }
}