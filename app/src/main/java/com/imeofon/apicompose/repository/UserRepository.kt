package com.imeofon.apicompose.repository

import com.imeofon.apicompose.model.UserResponse
import com.imeofon.apicompose.network.ApiInterface
import com.imeofon.apicompose.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class UserRepository @Inject constructor(
    private val apiInterface: ApiInterface
) {

    suspend fun getUserResponse(): Resource<List<UserResponse>> {
        val response = try {
            apiInterface.getUserData()
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred: ${e.localizedMessage}")
        }

        return Resource.Success(response)
    }

}