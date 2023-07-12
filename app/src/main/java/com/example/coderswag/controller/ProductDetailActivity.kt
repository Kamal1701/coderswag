package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.databinding.ActivityProductDetailBinding
import com.example.coderswag.models.Product
import com.example.coderswag.utilities.EXTRA_PRODUCT

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        val prodDetailView = binding.root
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)!!
        val resourceId = resources.getIdentifier(product.image,"drawable",packageName)
        binding.prodDetailImage.setImageResource(resourceId)
        binding.prodDetailTitle.text = product.title
        binding.prodDetailPrice.text = product.price
        setContentView(prodDetailView)
    }
}