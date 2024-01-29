package com.example.poststask.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.poststask.common.showMessage
import com.example.poststask.databinding.FragmentDetailsBinding
import com.example.poststask.ui.search.state.DetailsState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private lateinit var viewModel: DetailsVM
    private val args : DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[DetailsVM::class.java]
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            viewModel.state.collect {
                handleState(it)
            }
        }
        viewModel.getDetails(args.postID)
    }

    private fun handleState(state: DetailsState) {
        binding.apply {
            if (state.isLoading) {
                layoutLoading.visibility = View.VISIBLE
                layoutView.visibility = View.GONE
            } else if (state.error != null) {
                findNavController().popBackStack()
                showMessage(state.error)
            } else {
                layoutLoading.visibility = View.GONE
                layoutView.visibility = View.VISIBLE
                tvBody.text = state.post?.body ?: ""
                tvTitle.text = state.post?.title ?: ""
            }
        }
    }

}