package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    // create array list of class items of type CustomModel
    var stuff = arrayListOf<CustomModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stuff = setUp(stuff)

        var listView = findViewById<ListView>(R.id.lvStuff)

        listView.adapter = MyCustomAdapter(this, R.layout.custom_list_layout, stuff)

    }

    // function to add stuff to stuff, so we pass in stuff, and it adds class items and returns the updated list
    fun setUp (list: ArrayList<CustomModel>): ArrayList<CustomModel>{
        list.add(CustomModel("Daisy", "Alaskan Malamute", R.drawable.alask_mal))
        list.add(CustomModel("Chester", "Australian Shepherd", R.drawable.aus_shep))
        list.add(CustomModel("Bo", "Basset Hound", R.drawable.basset))
        list.add(CustomModel("Lu", "Beagle", R.drawable.beagle))
        list.add(CustomModel("Shakey", "Bichon", R.drawable.bichon))
        list.add(CustomModel("Chunk", "Bulldog", R.drawable.bulldog))
        return list
    }
}