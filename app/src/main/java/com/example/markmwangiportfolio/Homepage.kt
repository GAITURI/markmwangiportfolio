package com.example.markmwangiportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Homepage : AppCompatActivity() {
    lateinit var btnhomepage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)



        //reference the button
        btnhomepage=findViewById(R.id.btnhomepage)

        btnhomepage.setOnClickListener(View.OnClickListener{
            val intents = Intent (this,NavigationDrawer::class.java)
            startActivity(intents)
        })

    }
}