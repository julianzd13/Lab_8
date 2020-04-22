package com.example.labinten.model


import com.google.gson.annotations.SerializedName

data class CategoryArray(
    @SerializedName("Electronics and Gadgets")
    val electronicsAndGadgets: List<String>,
    @SerializedName("Entertainment")
    val entertainment: List<String>,
    @SerializedName("Fashion")
    val fashion: List<String>,
    @SerializedName("Food and Beverages")
    val foodAndBeverages: List<String>,
    @SerializedName("Gift Items")
    val giftItems: List<Any>,
    @SerializedName("Grocery")
    val grocery: List<Any>,
    @SerializedName("Health and Beauty")
    val healthAndBeauty: List<String>,
    @SerializedName("Home and Living")
    val homeAndLiving: List<String>,
    @SerializedName("Kids and Toddlers")
    val kidsAndToddlers: List<String>,
    @SerializedName("Stationary")
    val stationary: List<String>,
    @SerializedName("Travel")
    val travel: List<String>
)