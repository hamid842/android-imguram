package com.example.libimgur

import com.example.libimgur.converters.EnumConverterFactory
import com.example.libimgur.services.ImgurAPIv3
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ImgurClient {

    const val API_KEY = "e220ec9fda37e39"

    private val httpClient: OkHttpClient by lazy {
        OkHttpClient.Builder().addInterceptor {
            val request =
                it.request().newBuilder().addHeader("Authorization", "Client-ID $API_KEY")
                    .build()
            it.proceed(request)
        }
            .build()
    }

    private val moshi: Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addConverterFactory(EnumConverterFactory())
            .client(httpClient)
            .baseUrl("https://api.imgur.com/3/")
            .build()
    }
    val api :ImgurAPIv3 by lazy {
        retrofit.create(ImgurAPIv3::class.java)
    }
}