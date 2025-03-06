package com.hussainmehboob.roundupapp.data.repository

import com.hussainmehboob.roundupapp.data.model.CatImageResponse
import com.hussainmehboob.roundupapp.data.remote.RemoteDataSource
import com.hussainmehboob.roundupapp.domain.repository.CatRepository
import com.hussainmehboob.roundupapp.utils.ApiResult
import javax.inject.Inject

class CatRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : CatRepository {

    override suspend fun searchImages(
        limit: Int,
        breedId: String
    ): ApiResult<List<CatImageResponse>> {
        return when (val result = remoteDataSource.searchImages(limit = limit, breedId = breedId)) {
            is ApiResult.Success -> ApiResult.Success(result.data)
            is ApiResult.Error -> ApiResult.Error(result.exception)
        }
    }
}

