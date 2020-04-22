package com.example.labinten.model


import com.google.gson.annotations.SerializedName

data class Offer(
    @SerializedName("categories")
    val categories: String,
    @SerializedName("category_array")
    val categoryArray: CategoryArray,
    @SerializedName("code")
    val code: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("featured")
    val featured: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("lmd_id")
    val lmdId: String,
    @SerializedName("offer")
    val offer: String,
    @SerializedName("offer_text")
    val offerText: String,
    @SerializedName("offer_value")
    val offerValue: String,
    @SerializedName("smartLink")
    val smartLink: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("store")
    val store: String,
    @SerializedName("terms_and_conditions")
    val termsAndConditions: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)