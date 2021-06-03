package com.dot.baseandroid.menu.list.adapters.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dot.baseandroid.databinding.ItemImageBinding
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.menu.list.models.ImagePlaceModel
import com.dot.baseandroid.menu.list.viewmodels.ImageViewModel

class ImageViewHolder(val binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(imagePlaceModel: ImagePlaceModel) {
        binding.itemImage = ImageViewModel(imagePlaceModel)
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