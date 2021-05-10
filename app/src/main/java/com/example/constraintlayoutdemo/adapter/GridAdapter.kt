package com.example.constraintlayoutdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.constraintlayoutdemo.R


class GridAdapter(applicationContext: Context) :
    BaseAdapter() {
    var context: Context = applicationContext
    var inflter: LayoutInflater = LayoutInflater.from(applicationContext)
    override fun getCount(): Int {
        return 10
    }

    override fun getItem(i: Int): Any? {
        return null
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View, viewGroup: ViewGroup): View {
        var view = view
        view = inflter.inflate(R.layout.product_item, null) // inflate the layout
        return view
    }

}