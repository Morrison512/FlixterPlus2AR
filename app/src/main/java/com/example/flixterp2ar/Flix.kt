package com.example.flixterp2ar

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val results: List<Flix>?
)

class Flix (
    @SerializedName("name")
    var nameTitle: String?,

    @SerializedName("profile_path")
    var profilePath: String?,

    @SerializedName("original_title")
    var knownFor: String?,

    @SerializedName("poster_path")
    var posterPath: String?,

    @SerializedName("overview")
    var flixDescription: String? = null
) : java.io.Serializable
