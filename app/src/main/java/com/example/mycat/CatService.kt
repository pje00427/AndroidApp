package com.example.mycat
import com.example.mycat.model.CatModel
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "live_wv3vmHrrHGHroO7i4OL0TNsNLKIhpYnjxyb4rAeTr14o76tft7QeEdy7ZD9R1KrF"

interface CatService {

    @GET("v1/images/search?api_key=$API_KEY")
    suspend fun getImages(
        @Query("limit") num: Int = 1
    ): CatModel

}
