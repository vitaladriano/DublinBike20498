package com.dublinbikeapp.mapdemo.model

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

class ApiInterface {
    interface ApiInterface {
        @POST("/simulate")
        fun getBikeStationJsonData(@Body LatLng: RequestBody): Call<String>
    }
}