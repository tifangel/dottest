package com.dot.baseandroid.menu.list.adapters.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dot.baseandroid.databinding.ItemImageDetailBinding

class DetailMultipleViewHolder(val binding: ItemImageDetailBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(imageUrl: String) {
        binding.itemImageDetail = imageUrl
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): DetailMultipleViewHolder {

            val layoutInflater = LayoutInflater.from(parent.context)
            val binding: ItemImageDetailBinding = ItemImageDetailBinding.inflate(layoutInflater, parent, false)
            return DetailMultipleViewHolder(binding)
        }
    }
}