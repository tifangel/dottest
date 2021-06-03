package com.dot.baseandroid.utils

import androidx.recyclerview.widget.DiffUtil
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.models.GalleryModel
import com.dot.baseandroid.menu.list.models.PlaceModel
import com.dot.baseandroid.menu.profile.models.ProfileModel

//import com.dot.baseandroid.menu.notification.models.NotificationModel

class AdapterCallback {

    companion object {

        /**
         * diff callback adapter list
         */
        val DiffListCallback = object : DiffUtil.ItemCallback<PlaceModel>() {
            override fun areContentsTheSame(oldItem: PlaceModel, newItem: PlaceModel): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: PlaceModel, newItem: PlaceModel): Boolean {
                return oldItem.name == newItem.name
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
        val DiffProfileCallback = object : DiffUtil.ItemCallback<ProfileModel>() {
            override fun areItemsTheSame(oldItem: ProfileModel, newItem: ProfileModel): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ProfileModel, newItem: ProfileModel): Boolean {
                return oldItem.data == newItem.data
            }

        }

    }



}