package com.naco3x.geolocation02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGetLocation.setOnClickListener(){v -> updateLocation(v)}
    }

    fun updateLocation(view: View)
    {
        txtCoordinates.text = "Cool way to call the function!!!"
    }
}
