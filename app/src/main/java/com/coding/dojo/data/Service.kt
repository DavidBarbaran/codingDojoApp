package com.coding.dojo.data

import retrofit2.http.GET
import retrofit2.http.POST

interface Service {

    @POST("")
    suspend fun login()
}