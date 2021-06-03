package com.dot.baseandroid.utils

import androidx.recyclerview.widget.DiffUtil
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.list.models.ContentPlaceModel

class AdapterCallback {

    companion object {

        /**
         * diff callback adapter list
         */
        val DiffListCallback = object : DiffUtil.ItemCallback<ContentPlaceModel>() {
            override fun areContentsTheSame(oldItem: ContentPlaceModel, newItem: ContentPlaceModel): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: ContentPlaceModel, newItem: ContentPlaceModel): Boolean {
                return oldItem.title == newItem.title
            }
        }

        /**
         * diff callback adapter gallery
         */
        val DiffGalleryCallback = object : DiffUtil.ItemCallback<DataGalleryModel>() {
            override fun areContentsTheSame(oldItem: DataGalleryModel, newItem: DataGalleryModel): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: DataGalleryModel, newItem: DataGalleryModel): Boolean {
                return oldItem.caption == newItem.caption
            }
        }

        /**
         * diff callback adapter profile
         */
        val DiffListImageCallback = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

        }

    }



}