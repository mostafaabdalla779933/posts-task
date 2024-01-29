package com.example.poststask.ui.home.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.poststask.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionNavigationHomeToNavigationSearch(
    public val postID: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_home_to_navigation_search

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("postID", this.postID)
        return result
      }
  }

  public companion object {
    public fun actionNavigationHomeToNavigationSearch(postID: String): NavDirections =
        ActionNavigationHomeToNavigationSearch(postID)
  }
}
