package com.example.constraintlayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.constraintlayoutdemo.databinding.ActivityLogin2Binding

class LoginActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_login2)*/
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}