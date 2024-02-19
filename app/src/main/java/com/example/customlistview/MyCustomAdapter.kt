package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter (var ctx: Context, var ourResource: Int,
                       var items: ArrayList<CustomModel>): ArrayAdapter<CustomModel>(ctx, ourResource, items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        // go to layout and get links to widgets, use view we just created
        val name = view.findViewById<TextView>(R.id.tvName)
        val info = view.findViewById<TextView>(R.id.tvInfo)
        val image = view.findViewById<ImageView>(R.id.img1)

        // asign data
        name.text = items[position].name
        info.text = items[position].info
        image.setImageDrawable(ctx.resources.getDrawable(items[position].image))

        return view
    }

}