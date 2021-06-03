package com.dot.baseandroid.networks.rests

import com.dot.baseandroid.menu.profile.models.ProfileModel
import retrofit2.Response
import retrofit2.http.GET

interface RestApiProfile {

    @GET("user.json")
    suspend fun getProfile(): Response<ProfileModel>

}