package com.hussainmehboob.roundupapp.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hussainmehboob.roundupapp.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
