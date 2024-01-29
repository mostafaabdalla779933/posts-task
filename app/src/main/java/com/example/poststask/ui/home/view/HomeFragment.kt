package com.example.poststask.ui.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.poststask.data.model.PostModel
import com.example.poststask.databinding.FragmentHomeBinding
import com.example.poststask.ui.home.adapters.PostsAdapter
import com.example.poststask.ui.home.state.PostsState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeVM
    private val postsAdapter: PostsAdapter by lazy {
        PostsAdapter {
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToNavigationSearch(it.postId))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[HomeVM::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        lifecycleScope.launch {
            viewModel.state.collect {
                handlePostsState(it)
            }
        }
        viewModel.getPosts()
    }


    private fun handlePostsState(state: PostsState) {
        binding.apply {
            when {
                state.isLoading -> {
                    postsAdapter.submitList((1..5).map { PostModel(isShimmer = true) })
                }

                state.posts.isEmpty() -> {
                    showError(state.error)
                }

                else -> {
                    postsAdapter.submitList(state.posts)
                }
            }
        }
    }


    private fun showError(error: String?) {
        binding.apply {
            errorLayout.root.visibility = View.VISIBLE
            errorLayout.tvErrorMessage.text = error ?: "Something Went Wrong"
        }
    }

    private fun initView() {
        binding.apply {
            rvPosts.adapter = postsAdapter

            srLayout.setOnRefreshListener {
                srLayout.isRefreshing = false
                errorLayout.root.visibility = View.GONE
                viewModel.getPosts(false)
            }
            errorLayout.btnTryAgain.setOnClickListener {
                errorLayout.root.visibility = View.GONE
                viewModel.getPosts(false)
            }
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.onClear()
    }
}