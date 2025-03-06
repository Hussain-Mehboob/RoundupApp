package com.hussainmehboob.roundupapp.data.remote.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeaderInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        request.addHeader("x-api-key", "INSERT_API_KEY_HERE") // https://thecatapi.com/signup
        return chain.proceed(request.build())
    }
}
