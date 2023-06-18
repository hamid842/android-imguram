package com.example.testnav.data

import com.example.libimgur.ImgurClient
import com.example.libimgur.entities.GalleryResponse
import com.example.libimgur.params.Section

class ImgurRepository {

    private val api = ImgurClient.api

    suspend fun getHotFeeds(): GalleryResponse? {

        return api.getGallery(Section.HOT).body()
    }

    suspend fun getTopFeeds() : GalleryResponse? {
        val response = api.getGallery(Section.TOP)
        return response.body()
    }
}