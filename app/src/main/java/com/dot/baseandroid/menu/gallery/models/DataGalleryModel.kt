package com.dot.baseandroid.menu.gallery.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class DataGalleryModel(
    @SerializedName("caption") @Expose val caption: String,
    @SerializedName("thumbnail") @Expose val thumbnail: String,
    @SerializedName("image") @Expose val image: String
): Parcelable
