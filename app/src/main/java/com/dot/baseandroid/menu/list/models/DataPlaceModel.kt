package com.dot.baseandroid.menu.list.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class DataPlaceModel(
    @SerializedName("header") @Expose val header: HeaderPlaceModel,
    @SerializedName("content") @Expose val content: ContentPlaceModel,
): Parcelable
