package com.cml.weatherkotlin

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession

class WeatherKotlinApplication : Application() {

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "1t4G5hPlKB4Epfuz"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}