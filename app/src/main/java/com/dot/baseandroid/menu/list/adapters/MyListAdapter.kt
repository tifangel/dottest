package com.dot.baseandroid.menu.list.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dot.baseandroid.menu.list.adapters.viewholders.ListViewHolder
import com.dot.baseandroid.menu.list.adapters.viewholders.ListViewMultipleHolder
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.utils.AdapterCallback

class MyListAdapter(val onClick:(ContentPlaceModel) -> Unit): ListAdapter<ContentPlaceModel, RecyclerView.ViewHolder> (AdapterCallback.DiffListCallback) {

    companion object{
        private val type_one: Int = 1
        private val type_two: Int = 2
    }

    override fun getItemViewType(position: Int): Int {
        val contentPlaceModel = getItem(position)
        if(contentPlaceModel.type == "multiple"){
            return type_two
        }
        return type_one
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == type_one){
            return ListViewHolder.from(parent)
        }
        return ListViewMultipleHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contentPlaceModel = getItem(position)
        if(getItemViewType(position) == type_one){
            (holder as ListViewHolder).bind(contentPlaceModel)
        }else{
            (holder as ListViewMultipleHolder).bind(contentPlaceModel)
        }
        holder.itemView.setOnClickListener {
            onClick(contentPlaceModel)
        }
    }
}