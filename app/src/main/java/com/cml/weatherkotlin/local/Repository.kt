package com.cml.weatherkotlin.local

import androidx.lifecycle.liveData
import com.cml.weatherkotlin.local.model.Place
import com.cml.weatherkotlin.local.network.WeatherKotlinNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

object Repository {

    fun searchPlaces(query:String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = WeatherKotlinNetwork.searchPlace(query)
            if(placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("reponse status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }

}