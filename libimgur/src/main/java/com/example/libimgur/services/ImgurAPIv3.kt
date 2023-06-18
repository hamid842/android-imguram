package com.example.libimgur.services

import com.example.libimgur.entities.GalleryResponse

import com.example.libimgur.entities.TagsResponse
import com.example.libimgur.params.Section
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ImgurAPIv3 {

    @GET("gallery/{section}")
    suspend fun getGallery(
        @Path("section") section: Section,
        @Query("album_previews") albumPreviews: Boolean? = true
    ) : Response<GalleryResponse>

    @GET("tags")
    suspend fun getTags() : Response<TagsResponse>
}