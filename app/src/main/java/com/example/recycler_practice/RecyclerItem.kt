package com.example.recycler_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycler_practice.databinding.ItemRecyclerBinding

class RecyclerItem : AppCompatActivity() {
    lateinit var binding: ItemRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ItemRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}