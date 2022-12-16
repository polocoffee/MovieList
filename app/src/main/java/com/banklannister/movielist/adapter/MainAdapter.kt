package com.banklannister.movielist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.banklannister.movielist.R
import com.banklannister.movielist.databinding.ParentItemBinding
import com.banklannister.movielist.model.MainModel

class MainAdapter(private val collections: List<MainModel>) :
    RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            tvGenerateMovie.text = collection.title
            val movieAdapter = MovieAdapter(collection.movieModel)
            rvMovieChild.adapter = movieAdapter
        }
    }

    override fun getItemCount() = collections.size


    inner class CollectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ParentItemBinding.bind(itemView)
    }
}