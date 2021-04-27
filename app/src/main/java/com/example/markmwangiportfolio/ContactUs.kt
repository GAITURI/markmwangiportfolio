package com.example.markmwangiportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ContactUs : AppCompatActivity() {
    lateinit var btn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
        //identification
        btn =findViewById(R.id.btn2)
        Toast.makeText(this,"My NAME IS Mark Mwangi",Toast.LENGTH_LONG).show()
    }
}