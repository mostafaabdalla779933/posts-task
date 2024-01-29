package com.example.poststask.data.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "post")
@Parcelize
data class PostModel(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("userId")
	val userId: Int? = null,
	var isShimmer: Boolean = false
) : Parcelable {
	@PrimaryKey
	var postId: String = ""
		get() = id.toString()
}
