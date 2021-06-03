package com.dot.baseandroid.menu.profile.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Keep
@Parcelize
data class ProfileModel(
    @SerializedName("data") @Expose val data: DataProfileModel,
): Parcelable
