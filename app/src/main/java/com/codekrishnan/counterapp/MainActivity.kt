package com.codekrishnan.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codekrishnan.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            buttonIncrement.setOnClickListener {
                count++
                updateCount()
            }
            buttonDecrement.setOnClickListener {
                if (count > 0) {
                    count--
                    updateCount()
                }
            }
        }
    }

    private fun updateCount() {
        binding.textviewCount.text = count.toString()
    }
}