package com.kemalakkus.instagramappclone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.databinding.StoryItemBinding

class MyPagerAdapter(private val imageResIds: List<Int>) :
    RecyclerView.Adapter<MyPagerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.story_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(imageResIds[position])
    }

    override fun getItemCount(): Int {
        return imageResIds.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = StoryItemBinding.bind(itemView)

        fun bind(imageResId: Int) {
            binding.imgHome.setImageResource(imageResId)
        }
    }
}