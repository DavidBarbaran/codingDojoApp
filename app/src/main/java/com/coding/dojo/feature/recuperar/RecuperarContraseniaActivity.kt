package com.coding.dojo.feature.recuperar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coding.dojo.R
import kotlinx.android.synthetic.main.activity_recuperar_contrasenia.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecuperarContraseniaActivity : AppCompatActivity() {

    private val recuperarViewModel : RecuperarContraseniaViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_contrasenia)

        recuperateButton.setOnClickListener {

        }
    }
}
