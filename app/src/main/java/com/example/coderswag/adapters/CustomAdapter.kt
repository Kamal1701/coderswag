package com.example.coderswag.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.databinding.CategoryListItemBinding
import com.example.coderswag.models.Category

class CustomAdapter(val catList : List<Category>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    inner class ViewHolder(val binding:CategoryListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CategoryListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  catList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(catList[position]){
                binding.categoryName.text = this.title
            }
        }
    }


}