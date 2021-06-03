package com.dot.baseandroid.menu.list.adapters.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dot.baseandroid.databinding.ItemImageBinding

class ImageViewHolder(val binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(imageUrl: String) {
        binding.itemImage = imageUrl
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): ImageViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding: ItemImageBinding = ItemImageBinding.inflate(layoutInflater, parent, false)
            return ImageViewHolder(binding)
        }
    }
}