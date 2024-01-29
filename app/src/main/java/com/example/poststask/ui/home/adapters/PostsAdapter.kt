package com.example.poststask.ui.home.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.poststask.data.model.PostModel
import com.example.poststask.databinding.ItemPostBinding
import com.example.poststask.databinding.ItemPostShimmerBinding


class PostsAdapter(val onClick:(PostModel)->Unit): ListAdapter<PostModel, RecyclerView.ViewHolder>(UserDiffCallback()){


    inner class PostsViewHolder(private val rowView: ItemPostBinding) :
        RecyclerView.ViewHolder(rowView.root) {
        fun onBind(item: PostModel, position: Int) {
            rowView.apply {
                tvTitle.text = item.title ?: ""
                tvBody.text = item.body ?: ""
                root.setOnClickListener {
                    onClick(item)
                }
            }
        }
    }

    inner class ShimmerViewHolder(private val rowView: ItemPostShimmerBinding) :
        RecyclerView.ViewHolder(rowView.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE -> {
                PostsViewHolder(
                    ItemPostBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else -> {
                ShimmerViewHolder(
                    ItemPostShimmerBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PostsViewHolder -> {
                currentList[position]?.let { holder.onBind(it, position) }
            }
            is ShimmerViewHolder -> {

            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (currentList.getOrNull(position)?.isShimmer == true) {
            SHIMMER_TYPE
        } else {
            VIEW_TYPE
        }
    }

    companion object {
        const val SHIMMER_TYPE = 1
        const val VIEW_TYPE = 2
    }

    class UserDiffCallback : DiffUtil.ItemCallback<PostModel>() {
        override fun areItemsTheSame(oldItem: PostModel, newItem: PostModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: PostModel, newItem: PostModel): Boolean {
            return oldItem == newItem
        }
    }

}



