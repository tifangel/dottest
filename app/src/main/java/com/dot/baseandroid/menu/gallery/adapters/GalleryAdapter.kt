package com.dot.baseandroid.menu.gallery.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.dot.baseandroid.menu.gallery.adapters.viewholders.GalleryViewHolder
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.models.GalleryModel
import com.dot.baseandroid.utils.AdapterCallback

class GalleryAdapter(val onClick:(DataGalleryModel) -> Unit): ListAdapter<DataGalleryModel, GalleryViewHolder> (AdapterCallback.DiffGalleryCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val dataGalleryModel = getItem(position)
        holder.bind(dataGalleryModel)
        holder.itemView.setOnClickListener {
            onClick(dataGalleryModel)
        }
    }

}