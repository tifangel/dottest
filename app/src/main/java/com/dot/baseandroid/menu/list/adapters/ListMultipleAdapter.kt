package com.dot.baseandroid.menu.list.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dot.baseandroid.menu.list.adapters.viewholders.ImageViewHolder
import com.dot.baseandroid.utils.AdapterCallback

class ListMultipleAdapter: ListAdapter<String, ImageViewHolder> (AdapterCallback.DiffListImageCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imagePlaceModel = getItem(position)
        holder.bind(imagePlaceModel)
    }
}