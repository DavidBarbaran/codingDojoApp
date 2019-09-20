package com.coding.dojo.app

import android.app.Application
import com.coding.dojo.feature.login.di.LoginModule
import com.coding.dojo.feature.recuperar.di.recuperarModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CodingDojoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(
                this@CodingDojoApplication
            )
            modules(
                arrayListOf(
                    LoginModule,
                    recuperarModule
                )
            )
        }
    }
}