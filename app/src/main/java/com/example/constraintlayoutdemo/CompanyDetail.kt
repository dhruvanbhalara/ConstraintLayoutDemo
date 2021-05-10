package com.example.constraintlayoutdemo

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.constraintlayoutdemo.adapter.GridAdapter
import com.example.constraintlayoutdemo.databinding.ActivityCompanyDetailBinding


class CompanyDetail : AppCompatActivity() {
    private  lateinit var binding: ActivityCompanyDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_company_detail)*/
        binding= ActivityCompanyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

     /*   val myAdapter = GridAdapter(baseContext)
        binding.gridView.adapter = myAdapter*/
    }
}