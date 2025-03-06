package com.hussainmehboob.roundupapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.hussainmehboob.roundupapp.domain.usecase.GetCatImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getCatImagesUseCase: GetCatImagesUseCase
) : ViewModel() {

    fun fetchCatImages() {

    }

}
