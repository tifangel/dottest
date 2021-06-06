package com.dot.baseandroid.menu.list.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.dot.baseandroid.menu.list.adapters.viewholders.ImageViewHolder
import com.dot.baseandroid.utils.AdapterCallback

class ListMultipleAdapter(private val listImage: ArrayList<String>): ListAdapter<String, ImageViewHolder> (AdapterCallback.DiffListImageCallback) {

    override fun getItemCount(): Int {
        return listImage.size
    }

    override fun getItem(position: Int): String {
        return listImage.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imagePlaceModel = getItem(position)
        holder.bind(imagePlaceModel)
    }
}