package com.coding.dojo.feature.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coding.dojo.R
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    private fun init() {
        btnIngresar.setOnClickListener {

        }

        btnQuieroRegistrarme.setOnClickListener {

        }
    }
}
