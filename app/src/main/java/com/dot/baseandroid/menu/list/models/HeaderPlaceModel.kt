package com.dot.baseandroid.menu.list.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Keep
@Parcelize
data class HeaderPlaceModel(
    @SerializedName("title") @Expose val title: String,
    @SerializedName("subtitle") @Expose val subtitle: String
): Parcelable
