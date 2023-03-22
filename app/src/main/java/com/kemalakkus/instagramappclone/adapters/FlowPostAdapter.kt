package com.kemalakkus.instagramappclone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.databinding.PostItemBinding

class FlowPostAdapter(): RecyclerView.Adapter<FlowPostAdapter.FlowPostViewHolder>() {
    class FlowPostViewHolder(val binding: PostItemBinding): RecyclerView.ViewHolder(binding.root)

    val photoList = listOf(
        R.drawable.behzat,
        R.drawable.akbaba,
        R.drawable.hayalet,
        R.drawable.harun,
        R.drawable.ercument,
        R.drawable.memduh
    )

    val nameList = listOf("Behzat Ç", "Akbaba", "Hayalet", "Harun", "Ercüment Çözer", "Memduh Başkan")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowPostViewHolder {
        val binding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlowPostViewHolder(binding)

    }

    override fun onBindViewHolder(holder: FlowPostViewHolder, position: Int) {
        holder.binding.profilePhoto.setImageResource(photoList[position % photoList.size])
        holder.binding.commentPhoto.setImageResource(photoList[position % photoList.size])
        holder.binding.post.setImageResource(photoList[position % photoList.size])

        holder.binding.profileName.setText(nameList[position])
        holder.binding.profileName2.setText(nameList[position])




    }

    override fun getItemCount(): Int {
        return 6
    }


}