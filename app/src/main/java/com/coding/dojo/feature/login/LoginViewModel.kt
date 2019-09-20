package com.coding.dojo.feature.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coding.dojo.model.Usuario

class LoginViewModel : ViewModel() {

    val loginObserver = MutableLiveData<Usuario>()
    val loadingObserver = MutableLiveData<Boolean>()


    fun login(correo: String, contrasenia: String) {
        //carga
        loadingObserver.postValue(true)

        // llamada a retrofit

        // successful
        loadingObserver.postValue(false)
        loginObserver.postValue(
            Usuario("", "")
        )

        // error
        loadingObserver.postValue(false)

    }
}