package com.example.constraintlayoutdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.constraintlayoutdemo.R
import com.example.constraintlayoutdemo.model.FeatureModel

class FeatureListAdapter(private val dataSet: ArrayList<FeatureModel>) :
    RecyclerView.Adapter<FeatureListAdapter.FeatureList>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FeatureList {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.product_feature_item, viewGroup, false)
        return FeatureList(view)
    }

    override fun onBindViewHolder(viewHolder: FeatureList, position: Int) {
        viewHolder.txtf1t.text = dataSet[position].title
        viewHolder.txtf1d.text = dataSet[position].desc
    }

    override fun getItemCount() = dataSet.size

    class FeatureList(view: View) : RecyclerView.ViewHolder(view) {
        val txtf1t: TextView = view.findViewById(R.id.txtf1t)
        val txtf1d: TextView = view.findViewById(R.id.txtf1d)
    }

}
