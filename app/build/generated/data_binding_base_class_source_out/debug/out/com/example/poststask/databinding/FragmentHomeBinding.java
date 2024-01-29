// Generated by view binder compiler. Do not edit!
package com.example.poststask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.poststask.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final ErrorLayoutBinding errorLayout;

  @NonNull
  public final RecyclerView rvPosts;

  @NonNull
  public final SwipeRefreshLayout srLayout;

  private FragmentHomeBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull ErrorLayoutBinding errorLayout, @NonNull RecyclerView rvPosts,
      @NonNull SwipeRefreshLayout srLayout) {
    this.rootView = rootView;
    this.errorLayout = errorLayout;
    this.rvPosts = rvPosts;
    this.srLayout = srLayout;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errorLayout;
      View errorLayout = ViewBindings.findChildViewById(rootView, id);
      if (errorLayout == null) {
        break missingId;
      }
      ErrorLayoutBinding binding_errorLayout = ErrorLayoutBinding.bind(errorLayout);

      id = R.id.rvPosts;
      RecyclerView rvPosts = ViewBindings.findChildViewById(rootView, id);
      if (rvPosts == null) {
        break missingId;
      }

      SwipeRefreshLayout srLayout = (SwipeRefreshLayout) rootView;

      return new FragmentHomeBinding((SwipeRefreshLayout) rootView, binding_errorLayout, rvPosts,
          srLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}