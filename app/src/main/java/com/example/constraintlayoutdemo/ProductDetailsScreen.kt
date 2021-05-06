package com.example.constraintlayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.constraintlayoutdemo.adapter.FeatureListAdapter
import com.example.constraintlayoutdemo.databinding.ActivityProductDetailsScreenBinding
import com.example.constraintlayoutdemo.model.FeatureModel

class ProductDetailsScreen : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailsScreenBinding

    private val featureModel = ArrayList<FeatureModel>()
    private lateinit var featureListAdapter: FeatureListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_product_details_screen)*/

        binding = ActivityProductDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        featureListAdapter = FeatureListAdapter(featureModel)
        val layoutManager = LinearLayoutManager(applicationContext)
        binding.rcvFeature.layoutManager = layoutManager
        binding.rcvFeature.adapter = featureListAdapter
        addDummyData()
    }

    private fun addDummyData() {
        var foo = FeatureModel("Feature Product", "Yes")
        featureModel.add(foo)
        foo = FeatureModel("Designer", "Jeywn")
        featureModel.add(foo)
        foo = FeatureModel("Style", "Casual, Daily")
        featureModel.add(foo)
        foo = FeatureModel("Climate", "Summer")
        featureModel.add(foo)
        foo = FeatureModel("Material", "Silk or Crepe")
        featureModel.add(foo)
        featureListAdapter.notifyDataSetChanged()
    }

}