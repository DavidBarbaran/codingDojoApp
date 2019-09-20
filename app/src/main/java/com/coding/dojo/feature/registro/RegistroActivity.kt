package com.coding.dojo.feature.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.coding.dojo.R
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    private lateinit var model : RegistroViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        model = ViewModelProviders.of(this).get(RegistroViewModel::class.java)

        val nombreObserver = Observer<String> {newNombre ->
            etNombre.setText(newNombre)
        }
        val correoObserver = Observer<String> { newCorreo ->
            etCorreo.setText(newCorreo)
        }
        val contraseniaObserver = Observer<String> {newContrasenia ->
            etConstrasenia.setText(newContrasenia)
        }
        val confirmarContraseniaObserver = Observer<String> {newConfContrasenia ->
            etConfirmarContrasenia.setText(newConfContrasenia)
        }

        model.nombreCompleto.observe(this, nombreObserver)
        model.correo.observe(this, correoObserver)
        model.contrasenia.observe(this, contraseniaObserver)
        model.confirmarContrasena.observe(this, confirmarContraseniaObserver)
    }
}
