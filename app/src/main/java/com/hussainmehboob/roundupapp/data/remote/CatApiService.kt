package com.hussainmehboob.roundupapp.data.remote

import com.hussainmehboob.roundupapp.data.model.CatImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApiService {
    @GET("images/search")
    suspend fun searchImages(
        @Query("limit") limit: Int,
        @Query("breed_ids") breedId: String,
        @Query("has_breeds") hasBreeds: Boolean = true
    ): Response<List<CatImageResponse>>
}
