package com.dot.baseandroid.menu.gallery.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.models.GalleryModel

class ItemGalleryViewModel(dataGalleryModel: DataGalleryModel): ViewModel() {

    var thumbnail: ObservableField<String> = ObservableField(dataGalleryModel.thumbnail)

}