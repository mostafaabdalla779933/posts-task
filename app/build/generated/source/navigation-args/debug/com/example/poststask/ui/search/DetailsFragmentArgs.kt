package com.example.poststask.ui.search

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val postID: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("postID", this.postID)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("postID", this.postID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __postID : String?
      if (bundle.containsKey("postID")) {
        __postID = bundle.getString("postID")
        if (__postID == null) {
          throw IllegalArgumentException("Argument \"postID\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"postID\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__postID)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __postID : String?
      if (savedStateHandle.contains("postID")) {
        __postID = savedStateHandle["postID"]
        if (__postID == null) {
          throw IllegalArgumentException("Argument \"postID\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"postID\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__postID)
    }
  }
}
