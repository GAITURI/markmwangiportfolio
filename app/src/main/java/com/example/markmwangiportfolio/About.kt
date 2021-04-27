package com.example.markmwangiportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class About : AppCompatActivity() {
    //declare
  private  lateinit var listview:ListView
   private lateinit var listview2: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //view identification
        listview =findViewById(R.id.list1)
        //reference to our items
        val items1:Array<String> =resources.getStringArray(R.array.hobbies)

        //reference  to the arrray adapter class which will enable us to set up our items on a list dispaly\
        val listAdapter1 = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items1)

           //map items to listview
            listview.adapter =listAdapter1

        //view identification
        listview2=findViewById(R.id.list2)
        //reference to our items
        val items:Array<String> =resources.getStringArray(R.array.skills)

        //reference  to the arrray adapter class which will enable us to set up our items on a list display
        val listAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,items)

        //map items to listview
        listview.adapter =listAdapter
        //
    }
}