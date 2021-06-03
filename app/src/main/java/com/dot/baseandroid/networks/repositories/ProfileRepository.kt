package com.dot.baseandroid.networks.repositories

import android.util.Log
import com.dot.baseandroid.menu.profile.models.ProfileModel
import com.dot.baseandroid.networks.SafeApiRequest
import com.dot.baseandroid.networks.ServiceFactory
import com.dot.baseandroid.networks.rests.RestApiProfile
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class ProfileRepository(private val scope: CoroutineScope): SafeApiRequest() {

    private val restApi = ServiceFactory.getApiService(RestApiProfile::class.java)

    fun getProfile(onSuccess: (ProfileModel?) -> Unit, onError:(Exception) -> Unit) {
        scope.launch {
            try {
                val result = apiRequest { restApi.getProfile() }
                onSuccess(result)
            } catch (e: Exception) {
                if (e !is CancellationException) {
                    onError(e)
                }
            }
        }
    }

}