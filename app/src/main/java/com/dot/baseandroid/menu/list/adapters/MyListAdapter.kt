package com.dot.baseandroid.menu.list.adapters

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.get
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.dot.baseandroid.databinding.ItemImageBinding
import com.dot.baseandroid.menu.list.adapters.viewholders.ListViewHolder
import com.dot.baseandroid.menu.list.adapters.viewholders.ListViewMultipleHolder
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.utils.AdapterCallback

class MyListAdapter(val onClick: (ContentPlaceModel) -> Unit): ListAdapter<ContentPlaceModel, RecyclerView.ViewHolder>(AdapterCallback.DiffListCallback) {

    companion object{
        private val type_one: Int = 1
        private val type_two: Int = 2
    }

    private val viewPool = RecycledViewPool()

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

    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contentPlaceModel = getItem(position)
        if(getItemViewType(position) == type_one){
            (holder as ListViewHolder).bind(contentPlaceModel)
        }else{
            var adapterImage = ListMultipleAdapter(contentPlaceModel.media)
            val childLayoutManager = LinearLayoutManager(holder.itemView.rootView.context, LinearLayout.HORIZONTAL, false)
            (holder as ListViewMultipleHolder).bind(contentPlaceModel)
            holder.binding.recyclerViewListImage.layoutManager = childLayoutManager
            holder.binding.recyclerViewListImage.adapter = adapterImage
            holder.binding.recyclerViewListImage.setRecycledViewPool(viewPool)
//            holder.binding.recyclerViewListImage.context.
//            val itemBinding = holder.binding as ItemImageBinding
//            itemBinding.itemImage =
        }
        holder.itemView.setOnClickListener {
            onClick(contentPlaceModel)
        }
    }

//    @BindingAdapter(value = ["setItemImages"])
//    fun RecyclerView.setItemImages(itemImages: ArrayList<String>) {
//        if(itemImages.isNotEmpty()){`
//            val listMultipleAdapter = ListMultipleAdapter()
//            listMultipleAdapter.submitList(itemImages)
//
//            adapter = listMultipleAdapter
//        }
//    }
}