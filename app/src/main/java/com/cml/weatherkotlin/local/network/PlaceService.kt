package com.cml.weatherkotlin.local.network

import com.cml.weatherkotlin.WeatherKotlinApplication
import com.cml.weatherkotlin.local.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("V2/place?token=${WeatherKotlinApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String) : Call<PlaceResponse>

}