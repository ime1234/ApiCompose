package com.imeofon.apicompose.network

import com.imeofon.apicompose.model.UserResponse
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface ApiInterface {

    @GET("todos")
    suspend fun getUserData(): List<UserResponse>
}