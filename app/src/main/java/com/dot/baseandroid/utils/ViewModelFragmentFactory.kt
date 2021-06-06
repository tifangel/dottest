package com.dot.baseandroid.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.viewmodels.GalleryDetailViewModel
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.menu.list.viewmodels.ItemListViewModel

/** REFERENCES
 * https://stackoverflow.com/a/50374088
 */
class ViewModelFragmentFactory(private val any: Any): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == ItemListViewModel::class.java) {
            return ItemListViewModel(any as ContentPlaceModel) as T
        } else if (modelClass == GalleryDetailViewModel::class.java) {
            return GalleryDetailViewModel(any as DataGalleryModel) as T
        }
        return super.create(modelClass)
    }
}