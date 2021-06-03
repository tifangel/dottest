package com.dot.baseandroid.menu.gallery.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.models.GalleryModel

class GalleryDetailViewModel(dataGalleryModel: DataGalleryModel) : ViewModel() {

    var imageUrl: ObservableField<String> = ObservableField(dataGalleryModel.image)
    var caption: ObservableField<String> = ObservableField(dataGalleryModel.caption)

}