package com.dot.baseandroid.menu.gallery.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.models.GalleryModel
import com.dot.baseandroid.networks.repositories.GalleryRepository

class GalleryViewModel: ViewModel() {

    private val repository = GalleryRepository(viewModelScope)

    var liveDataListGallery: MutableLiveData<MutableList<DataGalleryModel>> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    fun getListGallery() {
        isLoading.postValue(true)
        repository.getListGallery({
            isLoading.postValue(false)
            liveDataListGallery.postValue(it?.data)
        }, {
            isLoading.postValue(false)
        })
    }

}