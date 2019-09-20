package com.coding.dojo.feature.recuperar.di

import com.coding.dojo.feature.recuperar.RecuperarContraseniaViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val recuperarModule = module {
    viewModel { RecuperarContraseniaViewModel() }
}