package com.coding.dojo.data

import com.coding.dojo.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RestApi {

    private const val TIMEOUT = 30L

    private lateinit var retrofit: Retrofit
    private val okHttpClient = OkHttpClient
        .Builder()
        .readTimeout(TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
        .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        .build()

    fun instance(): Service {
        retrofit = Retrofit.Builder()
            .baseUrl("")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(Service::class.java)
    }
}