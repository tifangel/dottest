package com.dot.baseandroid.menu.list.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.dot.baseandroid.menu.list.adapters.viewholders.DetailMultipleViewHolder
import com.dot.baseandroid.utils.AdapterCallback

class DetailMultipleAdapter(private val listImage: ArrayList<String>): ListAdapter<String, DetailMultipleViewHolder>(AdapterCallback.DiffListImageCallback)  {

    override fun getItemCount(): Int {
        return listImage.size
    }

    override fun getItem(position: Int): String {
        return listImage[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailMultipleViewHolder {
        return DetailMultipleViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: DetailMultipleViewHolder, position: Int) {
        val imagePlaceModel = getItem(position)
        holder.bind(imagePlaceModel)
    }
}