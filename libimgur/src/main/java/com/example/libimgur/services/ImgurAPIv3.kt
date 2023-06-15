package com.example.libimgur.services

import com.example.libimgur.entities.GalleryResponse
import com.example.libimgur.entities.TagsResponse
import com.example.libimgur.params.Section
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ImgurAPIv3 {

    @GET("gallery/{section}")
    fun getGallery(
        @Path("section") section: Section,
        @Query("album_previews") albumPreviews: Boolean? = true
    ) : Call<GalleryResponse>

    @GET("tags")
    fun getTags() : Call<TagsResponse>
}