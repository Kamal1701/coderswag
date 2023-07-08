package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.R
import com.example.coderswag.databinding.ActivityMainBinding
import com.example.coderswag.models.Category
import com.example.coderswag.services.DataService

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    lateinit var adapter : ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        binding.categoryListView.adapter = adapter
    }
}