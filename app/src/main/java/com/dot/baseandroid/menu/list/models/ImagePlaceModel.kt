package com.dot.baseandroid.menu.list.models

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class ImagePlaceModel(
    val image: String,
): Parcelable
