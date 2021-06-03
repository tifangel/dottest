package com.dot.baseandroid.menu.profile.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dot.baseandroid.menu.profile.models.DataProfileModel
import com.dot.baseandroid.menu.profile.models.ProfileModel
import com.dot.baseandroid.networks.repositories.ProfileRepository

class ProfileViewModel: ViewModel(){

    private val repository = ProfileRepository(viewModelScope)

    var liveDataProfile: MutableLiveData<DataProfileModel> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    fun getProfile() {
        isLoading.postValue(true)
        repository.getProfile({
            isLoading.postValue(false)
            liveDataProfile.postValue(it?.data)
        }, {
            isLoading.postValue(false)
        })
    }

}