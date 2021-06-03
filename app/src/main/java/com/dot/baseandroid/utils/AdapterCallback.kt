package com.dot.baseandroid.utils

import androidx.recyclerview.widget.DiffUtil
import com.dot.baseandroid.menu.gallery.models.DataGalleryModel
import com.dot.baseandroid.menu.gallery.models.GalleryModel
import com.dot.baseandroid.menu.list.models.ContentPlaceModel
import com.dot.baseandroid.menu.list.models.ImagePlaceModel
import com.dot.baseandroid.menu.list.models.PlaceModel
import com.dot.baseandroid.menu.profile.models.ProfileModel

//import com.dot.baseandroid.menu.notification.models.NotificationModel

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
        val DiffListImageCallback = object : DiffUtil.ItemCallback<ImagePlaceModel>() {
            override fun areItemsTheSame(oldItem: ImagePlaceModel, newItem: ImagePlaceModel): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ImagePlaceModel, newItem: ImagePlaceModel): Boolean {
                return oldItem.image == newItem.image
            }

        }

    }



}