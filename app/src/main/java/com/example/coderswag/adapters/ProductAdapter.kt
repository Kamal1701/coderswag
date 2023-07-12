package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.databinding.ProductListViewBinding
import com.example.coderswag.models.Product

class ProductAdapter(val context: Context, val productList: List<Product>, val prodItemClick : (Product) -> Unit) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(binding: ProductListViewBinding, val prodItemClick : (Product) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {
        var productImage = binding.productImage
        val productName = binding.productText
        val productPrice = binding.productPrice

        fun bindProduct(context: Context, product: Product) {
            val resourceId = context.resources.getIdentifier(
                product.image,
                "drawable",
                context.packageName
            )
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price

            productImage.setOnClickListener {
                prodItemClick(product)
            }
            productName.setOnClickListener {
                prodItemClick(product)
            }
            productPrice.setOnClickListener {
                prodItemClick(product)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =
            ProductListViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding, prodItemClick)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindProduct(context, productList[position])
    }
}