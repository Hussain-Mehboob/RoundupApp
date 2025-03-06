package com.hussainmehboob.roundupapp.domain.repository

import com.hussainmehboob.roundupapp.data.model.CatImageResponse
import com.hussainmehboob.roundupapp.utils.ApiResult

interface CatRepository {
    suspend fun searchImages(limit: Int, breedId: String): ApiResult<List<CatImageResponse>>
}
