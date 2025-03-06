package com.hussainmehboob.roundupapp.domain.usecase
import com.hussainmehboob.roundupapp.data.model.CatImageResponse
import com.hussainmehboob.roundupapp.domain.repository.CatRepository
import com.hussainmehboob.roundupapp.utils.ApiResult
import javax.inject.Inject

class GetCatImagesUseCase @Inject constructor(
    private val repository: CatRepository
) {
    suspend operator fun invoke(limit: Int, breedId: String): ApiResult<List<CatImageResponse>> {
        return repository.searchImages(limit, breedId)
    }
}
