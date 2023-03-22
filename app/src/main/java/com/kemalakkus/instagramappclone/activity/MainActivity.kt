package com.kemalakkus.instagramappclone.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.kemalakkus.instagramappclone.R
import com.kemalakkus.instagramappclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navController = findNavController(R.id.fragmentContainerView)
        binding.bottomNav.setupWithNavController(navController)



    }
}