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

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18.00", "hat01"),
        Product("Devslopes Hat Black", "$20.00", "hat02"),
        Product("Devslopes Hat White", "$18.00", "hat03"),
        Product("Devslopes Hat Snapback", "$22.00", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodies Gray", "$28.00", "hoodie01"),
        Product("Devslopes Hoodie Red", "$3200", "hoodie02"),
        Product("Devslopes Gray Hoodie", "$18.00", "hoodie03"),
        Product("Devslopes Black Hoodie", "$32.00", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18.00", "shirt01"),
        Product("Devslopes Badge Light Gray", "$20.00", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$22.00", "shirt03"),
        Product("Devslopes Hustle", "$22.00", "shirt04"),
        Product("Kickflip Studios", "$18.00", "shirt05")
    )

}