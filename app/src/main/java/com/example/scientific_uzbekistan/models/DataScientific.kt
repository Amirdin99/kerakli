package com.example.scientificuzbekistan.models

data class Birinchi(
    val image: Int,
    val date: String,
    val price: String


): ItemData{
    override fun getType()=1
}

data class Ikkinchi(

    val rasm: Int,
    val sana: String,
    val narx: String,


):ItemData{
    override fun getType()=2
}

interface ItemData{
    fun getType():Int

}