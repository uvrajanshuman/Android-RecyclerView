package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = Fruit.getRandomFruits(100)
        val recyclerView: RecyclerView = findViewById(R.id.rvFruits)
        recyclerView.adapter = FruitAdapter(fruits)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}