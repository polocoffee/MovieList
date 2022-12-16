package com.banklannister.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.banklannister.movielist.adapter.MainAdapter
import com.banklannister.movielist.databinding.ActivityMainBinding
import com.banklannister.movielist.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter = MainAdapter(SampleData.collections)
        }
    }
}