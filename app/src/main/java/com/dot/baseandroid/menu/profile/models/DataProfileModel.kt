package com.dot.baseandroid.menu.profile.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Keep
@Parcelize
data class DataProfileModel(
    @SerializedName("username") @Expose val username: String,
    @SerializedName("fullname") @Expose val fullname: String,
    @SerializedName("email") @Expose val email: String,
    @SerializedName("phone") @Expose val phone: String,
    @SerializedName("avatar") @Expose val avatar: String,
): Parcelable

