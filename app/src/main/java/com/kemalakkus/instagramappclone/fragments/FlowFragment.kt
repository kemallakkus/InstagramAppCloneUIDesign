package com.kemalakkus.instagramappclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.adapters.FlowPostAdapter
import com.kemalakkus.instagramappclone.adapters.FlowStoryAdapter
import com.kemalakkus.instagramappclone.databinding.FragmentFlowBinding

class FlowFragment : Fragment() {

    private lateinit var binding: FragmentFlowBinding
    private val flowStoryAdapter = FlowStoryAdapter()
    private val flowPostAdapter = FlowPostAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFlowBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvStorySetup()
        rvPostSetup()

    }

    private fun rvStorySetup(){
        binding.rvFlow.adapter = flowStoryAdapter
        binding.rvFlow.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
    }

    private fun rvPostSetup(){
        binding.rvPost.adapter = flowPostAdapter
        binding.rvPost.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
    }




}