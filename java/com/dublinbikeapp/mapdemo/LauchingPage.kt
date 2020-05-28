package com.dublinbikeapp.mapdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_firstpage.*

class LauchingPage : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

       btnBikeStationsMap.setOnClickListener {

            val intent = Intent (this, MapsActivity::class.java)
            //start maps
            startActivity(intent)
        }
    }
}
