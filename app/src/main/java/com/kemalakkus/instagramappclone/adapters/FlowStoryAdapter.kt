package com.kemalakkus.instagramappclone.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.databinding.StoryHomeItemBinding
import com.kemalakkus.instagramappclone.databinding.StoryItemBinding
import com.kemalakkus.instagramappclone.fragments.StoryFragment

class FlowStoryAdapter(): RecyclerView.Adapter<FlowStoryAdapter.FlowStoryViewHolder>() {

    class FlowStoryViewHolder(val binding: StoryHomeItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(name: String, photo: Int) {
            binding.storyName.text = name
            binding.storyPhoto.setImageResource(photo)

            itemView.setOnClickListener {
                // Öğe tıklandığında yapılacak işlemler buraya yazılır
                itemView.findNavController().navigate(R.id.action_flowFragment2_to_storyFragment)
            }
        }

    }

    val photoList = listOf(
        R.drawable.behzat,
        R.drawable.akbaba,
        R.drawable.hayalet,
        R.drawable.harun,
        R.drawable.ercument,
        R.drawable.memduh
    )

    val nameList = listOf("Behzat Ç", "Akbaba", "Hayalet", "Harun", "Ercüment Çözer", "Memduh Başkan")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowStoryViewHolder {
        val binding = StoryHomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlowStoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FlowStoryViewHolder, position: Int) {
        //holder.binding.storyPhoto.setImageResource(photoList[position % photoList.size])
        holder.bind(nameList[position], photoList[position % photoList.size])
        //holder.binding.storyName.setText(nameList[position])
    }

    override fun getItemCount(): Int {
        return 6
    }

}