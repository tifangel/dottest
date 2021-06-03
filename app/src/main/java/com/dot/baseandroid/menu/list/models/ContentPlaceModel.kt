package com.dot.baseandroid.menu.list.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class ContentPlaceModel(
    @SerializedName("title") @Expose val title: String,
    @SerializedName("content") @Expose val content: String,
    @SerializedName("type") @Expose val type: String,
    @SerializedName("image") @Expose val image: String,
    @SerializedName("media") @Expose val media: ArrayList<String>,
): Parcelable
