package com.kemalakkus.instagramappclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.adapters.SearchAdapter
import com.kemalakkus.instagramappclone.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private val profileAdapter =  SearchAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        binding.rvProfil.adapter = profileAdapter
        binding.rvProfil.layoutManager = GridLayoutManager(requireContext(), 3)
    }


}