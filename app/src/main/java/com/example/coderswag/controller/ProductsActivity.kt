package com.example.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.adapters.ProductAdapter
import com.example.coderswag.databinding.ActivityProductsBinding
import com.example.coderswag.services.DataService
import com.example.coderswag.utilities.EXTRA_CATEGORY
import com.example.coderswag.utilities.EXTRA_PRODUCT

class ProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding
    lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_products)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY).toString()
        adapter = ProductAdapter(this, DataService.getProducts(categoryType)){product ->
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT,product)
            startActivity(productDetailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation== Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize>720){
            spanCount = 3
        }

        val gridLayoutManager = GridLayoutManager(this, spanCount)
        binding.productsRecycleViewList.layoutManager = gridLayoutManager
        binding.productsRecycleViewList.adapter = adapter
    }
}