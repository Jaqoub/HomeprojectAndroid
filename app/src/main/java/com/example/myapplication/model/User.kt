package com.example.myapplication.model
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class User(
    @SerializedName("id")
    var userId: Long?
)
{
}