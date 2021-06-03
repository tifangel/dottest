package com.dot.baseandroid.menu.list.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.dot.baseandroid.menu.list.models.ImagePlaceModel

class ImageViewModel(imagePlaceModel: ImagePlaceModel): ViewModel() {
    var imageUrl: ObservableField<String> = ObservableField(imagePlaceModel.image)
}