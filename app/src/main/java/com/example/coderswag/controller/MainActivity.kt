package com.example.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.adapters.CustomAdapter
import com.example.coderswag.databinding.ActivityMainBinding
import com.example.coderswag.models.Category
import com.example.coderswag.services.DataService
import com.example.coderswag.utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {
    private  var  _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!
//    lateinit var adapter : ArrayAdapter<Category>

    private lateinit var customAdapter: CustomAdapter
//    private lateinit var category: Category
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
//        binding.categoryListView.adapter = adapter
        val linearLayoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.categoryRecycleViewList.layoutManager = linearLayoutManager
        customAdapter = CustomAdapter(this,DataService.categories){ category ->
            val productIntent = Intent(this, ProductsActivity:: class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        binding.categoryRecycleViewList.adapter = customAdapter
        binding.categoryRecycleViewList.setHasFixedSize(true)
    }
}