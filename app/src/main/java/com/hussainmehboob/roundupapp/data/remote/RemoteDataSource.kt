package com.hussainmehboob.roundupapp.data.remote

import com.hussainmehboob.roundupapp.data.model.CatImageResponse
import com.hussainmehboob.roundupapp.domain.repository.CatRepository
import com.hussainmehboob.roundupapp.utils.ApiResult
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: CatApiService
): CatRepository {

    override suspend fun searchImages(limit: Int, breedId: String): ApiResult<List<CatImageResponse>> {
        return try {
            val response = api.searchImages(limit = limit, breedId = breedId)
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return ApiResult.Success(body)
            }
            ApiResult.Error(Exception("response was not successful - ${response.code()}"))
        } catch (e: Exception) {
            ApiResult.Error(e)
        }
    }
}
