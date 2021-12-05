package com.han.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/a19c17f4-66b5-458a-ac63-4bac02b792ec")
    fun getHouseList(): Call<HouseDto>
}