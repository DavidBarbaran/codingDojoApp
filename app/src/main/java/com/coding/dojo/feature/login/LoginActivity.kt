package com.coding.dojo.feature.login

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.coding.dojo.R
import com.coding.dojo.model.Usuario
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    private fun init() {
        loginViewModel.loginObserver.observe(this, loginSuccessful())
        loginViewModel.loadingObserver.observe(this, loading())

        btnIngresar.setOnClickListener {

            loginViewModel.login(edtCorreo?.text.toString(), edtContrasenia?.text.toString())
        }

        btnQuieroRegistrarme.setOnClickListener {

        }
    }

    fun loginSuccessful() = Observer<Usuario> {

    }

    fun loading() = Observer<Boolean> {
        if (it) {
            pbCargando.visibility = View.VISIBLE
            container.visibility = View.GONE
        }
    }
}
