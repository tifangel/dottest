package com.dot.baseandroid.menu.list.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.menu.list.models.DataPlaceModel
import com.dot.baseandroid.menu.list.models.HeaderPlaceModel
import com.dot.baseandroid.menu.list.models.PlaceModel
import com.dot.baseandroid.networks.repositories.ListRepository

class ListViewModel : ViewModel() {

    private val repository = ListRepository(viewModelScope)

    var liveDataList: MutableLiveData<MutableList<ContentPlaceModel>> = MutableLiveData()
    var headerDataList: MutableLiveData<HeaderPlaceModel> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()

    fun getList() {
        isLoading.postValue(true)
        repository.getListPlace({
            isLoading.postValue(false)
            liveDataList.postValue(it?.data?.content)
            headerDataList.postValue(it?.data?.header)
        }, {
            isLoading.postValue(false)
        })
    }

}