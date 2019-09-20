package com.coding.dojo.feature.login.di

import com.coding.dojo.feature.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val LoginModule = module {
    viewModel {
        LoginViewModel()
    }
}