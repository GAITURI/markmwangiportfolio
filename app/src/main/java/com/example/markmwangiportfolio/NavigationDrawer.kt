package com.example.markmwangiportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import  androidx.appcompat.widget.Toolbar
class NavigationDrawer : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer :DrawerLayout
  private  lateinit var toolbar: Toolbar
    private lateinit var navView:NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
//        val toolbar:Toolbar =findViewById(R.id.toolbar)

        //view identification
        drawer = findViewById(R.id.drawer_layout)
        toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navView =findViewById(R.id.nav_drawer)
        navView.setNavigationItemSelectedListener(this)
    //new instance of the action bar drawer toggleclass so that we can get the hamburger icon
    val toggle:ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        //attach a drawer listener for the toggle
        drawer.addDrawerListener(toggle)
        //sync state
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.abot->{
                val intent1= Intent(this@NavigationDrawer,About::class.java)
                startActivity(intent1)
            }
            R.id.homepage->{
                val intent2= Intent(this@NavigationDrawer,Homepage::class.java)
                startActivity(intent2)
            }
            R.id.contacts->{
                val intent3= Intent(this@NavigationDrawer,ContactUs::class.java)
                startActivity(intent3)
            }
        }

    return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}