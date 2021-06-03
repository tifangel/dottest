package com.dot.baseandroid.menu.list.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.dot.baseandroid.menu.list.models.ContentPlaceModel

class ItemListMultipleViewModel(contentPlaceModel: ContentPlaceModel): ViewModel() {
    var title: ObservableField<String> = ObservableField(contentPlaceModel.title)
    var content: ObservableField<String> = ObservableField(contentPlaceModel.content)
    var imageUrl: ObservableField<String> = ObservableField(contentPlaceModel.media[0])
    var media: ObservableField<ArrayList<String>> = ObservableField(contentPlaceModel.media)
}