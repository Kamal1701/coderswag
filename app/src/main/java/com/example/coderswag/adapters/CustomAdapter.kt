package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.databinding.CategoryListConstraintItemBinding
import com.example.coderswag.models.Category

class CustomAdapter(val context: Context, val catList: List<Category>, val itemClick : (Category)->Unit) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

//    val context = context
//    val category = catList

    inner class ViewHolder(val binding: CategoryListConstraintItemBinding, val itemClick: (Category) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {
        var categoryImage: ImageView = binding.categoryImage
        var categoryName: TextView = binding.categoryName

        fun bindCategory(context: Context, category: Category){
            val resourceId = context.resources.getIdentifier(
                category.image,
                "drawable",
                context.packageName
            )
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title
            binding.categoryImage.setOnClickListener {
                itemClick(category)
            }
            binding.categoryName.setOnClickListener {
                itemClick(category)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CategoryListConstraintItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        println("heavy computing")
        return ViewHolder(binding, itemClick)
    }

    override fun getItemCount(): Int {
        return catList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        with(holder) {
//            with(category[position]) {
//                categoryName.text = category[position].title
//                val resourceId = context.resources.getIdentifier(
//                    category[position].image,
//                    "drawable",
//                    context.packageName
//                )
//                categoryImage.setImageResource(resourceId)
//
//                println(resourceId)
//            }
//        }
        holder.bindCategory(context,catList[position])
    }
}