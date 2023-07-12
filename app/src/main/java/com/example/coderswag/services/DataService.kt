package com.example.coderswag.services

import com.example.coderswag.models.Category
import com.example.coderswag.models.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITIAL", "digitalgoodsimage")
    )

    private val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18.00", "hat1"),
        Product("Devslopes Hat Black", "$20.00", "hat2"),
        Product("Devslopes Hat White", "$18.00", "hat3"),
        Product("Devslopes Hat Snapback", "$22.00", "hat4")
    )

    private val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28.00", "hoodie1"),
        Product("Devslopes Hoodie Red", "$3200", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$18.00", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32.00", "hoodie4")
    )

    private val shirts = listOf(
        Product("Devslopes Shirt Black", "$18.00", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20.00", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22.00", "shirt3"),
        Product("Devslopes Hustle", "$22.00", "shirt4"),
        Product("Kickflip Studios", "$18.00", "shirt5")
    )

    private val digitalGoods = listOf<Product>()

    fun getProducts(category: String):List<Product>{

         return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }

    }

}