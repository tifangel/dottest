package com.dot.baseandroid.menu.list.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.menu.list.models.PlaceModel

class ItemListViewModel(contentPlaceModel: ContentPlaceModel): ViewModel() {

    var title: ObservableField<String> = ObservableField(contentPlaceModel.title)
    var content: ObservableField<String> = ObservableField(contentPlaceModel.content)
    var imageUrl: ObservableField<String> = ObservableField(contentPlaceModel.image)
    var media: ObservableField<ArrayList<String>> = ObservableField(contentPlaceModel.media)
}