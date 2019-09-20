package com.coding.dojo.feature.registro

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class RegistroViewModel(application: Application) : AndroidViewModel(application) {

    val nombreCompleto = MutableLiveData<String> ()

    val correo = MutableLiveData<String> ()

    val contrasenia = MutableLiveData<String> ()

    val confirmarContrasena = MutableLiveData<String> ()
}