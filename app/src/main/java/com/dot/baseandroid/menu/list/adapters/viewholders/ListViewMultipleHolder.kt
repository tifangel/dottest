package com.dot.baseandroid.menu.list.adapters.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dot.baseandroid.databinding.ItemImageBinding
import com.dot.baseandroid.databinding.ItemListMultipleBinding
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.menu.list.viewmodels.ItemListViewModel

class ListViewMultipleHolder(val binding: ItemListMultipleBinding): RecyclerView.ViewHolder(binding.root)  {

    private lateinit var bindingitem: ItemImageBinding

    fun bind(contentPlaceModel: ContentPlaceModel) {
        binding.itemListMultiple = ItemListViewModel(contentPlaceModel)
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): ListViewMultipleHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding: ItemListMultipleBinding = ItemListMultipleBinding.inflate(layoutInflater, parent, false)
            return ListViewMultipleHolder(binding)
        }
    }
}