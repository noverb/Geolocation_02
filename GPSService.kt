package com.naco3x.geolocation02

import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Toast

class GPSService {
    var m_context: Context? = null
    var m_location: Location? = null
    var m_locationManager: LocationManager? = null
    var m_provider: String = LocationManager.GPS_PROVIDER


    fun GPSService(context: Context)
    {
        val m_context = context
        val m_locationManager = m_context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

        // Check for if permissions are not granted
        if (
                (ContextCompat.checkSelfPermission(m_context,
                        android.Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) ||
                (ContextCompat.checkSelfPermission(m_context,
                        android.Manifest.permission.ACCESS_FINE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED)
           )
        {
            Toast.makeText(m_context,"Report badass error", Toast.LENGTH_LONG)
            return
        }

        // If permissions check out fine, continue
//        m_locationManager.requestLocationUpdates(m_provider,60*10,50, LocationListener)
//        {
//
//        }
    }

}