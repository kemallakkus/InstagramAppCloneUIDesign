package com.kemalakkus.instagramappclone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.databinding.SearchItemBinding

class SearchAdapter() : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    class ViewHolder(val binding: SearchItemBinding) : RecyclerView.ViewHolder(binding.root)

    val photoList = listOf(
        R.drawable.behzat,
        R.drawable.akbaba,
        R.drawable.hayalet,
        R.drawable.harun,
        R.drawable.ercument,
        R.drawable.memduh
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.imageView.setImageResource(photoList[position % photoList.size])

    }

    override fun getItemCount(): Int {
        return 30
    }
}