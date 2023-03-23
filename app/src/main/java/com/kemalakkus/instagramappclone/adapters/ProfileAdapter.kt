package com.kemalakkus.instagramappclone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.databinding.SearchItemBinding

class ProfileAdapter : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    class ViewHolder(val binding: SearchItemBinding) : RecyclerView.ViewHolder(binding.root)

    val photoList = listOf(
        R.drawable.mariecurie,
        R.drawable.curie2,
        R.drawable.curie1
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val resId = photoList[position % photoList.size]

        Glide.with(holder.itemView.context)
            .load(resId)
            .override(500,500)
            .into(holder.binding.imageView)

        //holder.binding.imageView.setImageResource(photoList[position % photoList.size])

    }

    override fun getItemCount(): Int {
        return 3
    }
}