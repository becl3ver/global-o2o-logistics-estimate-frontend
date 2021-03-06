package com.example.logisticsestimate.data

import com.google.gson.annotations.SerializedName

data class BoardResponseDto(
    @SerializedName("category") var category: Int,
    @SerializedName("boards") var boards: ArrayList<BoardData>,
    )