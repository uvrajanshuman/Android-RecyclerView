package com.example.recyclerview

import kotlin.random.Random

data class Fruit(var name: String, var origin: String, var quantity:Int) {

    companion object{
        @JvmField
        val FRUIT_NAMES = arrayOf(
            "Apple","Mango","Pineapple","Strawberry",
            "Banana","Kiwi","Guava","Grapes"
        )

        @JvmField
        val ORIGIN_PLACE = arrayOf(
            "Srinagar","Lucknow","Nagpur","Patna","Mysore"
        )

        @JvmStatic
        fun getRandomFruits(n:Int):ArrayList<Fruit>{
            var fruitList = ArrayList<Fruit>(n)
            for(i in 1 .. n){
                val fruitName = FRUIT_NAMES[Random.nextInt(8)]
                val originPlace = ORIGIN_PLACE[Random.nextInt(5)]
                val quantity = Random.nextInt(10)*100
                fruitList.add(Fruit(fruitName,originPlace,quantity))
            }
            return fruitList
        }
    }
}