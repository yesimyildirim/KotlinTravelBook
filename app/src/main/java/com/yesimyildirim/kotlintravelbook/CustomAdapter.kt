package com.yesimyildirim.kotlintravelbook

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.yesimyildirim.kotlintravelbook.Place
import com.yesimyildirim.kotlintravelbook.R
import kotlinx.android.synthetic.main.custom_list_row.view.*

class CustomAdapter(private val placeList : ArrayList<Place>, private val context: Activity) :
    ArrayAdapter<Place>(context,
        R.layout.custom_list_row, placeList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = context.layoutInflater
        val customView = layoutInflater.inflate(R.layout.custom_list_row,null,true)

        customView.listRowTextView.text = placeList.get(position).address

        return customView
    }

}