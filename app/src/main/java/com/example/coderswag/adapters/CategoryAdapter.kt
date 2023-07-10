package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.coderswag.databinding.CategoryListItemBinding
import com.example.coderswag.models.Category

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories
//    private lateinit var  binding : CategoryListItemBinding
    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
//        categoryView = LayoutInflater.from(context).inflate()
        return categoryView
    }


}