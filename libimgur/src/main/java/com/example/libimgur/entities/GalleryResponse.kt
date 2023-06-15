package com.example.libimgur.entities

data class GalleryResponse(
    val `data`: List<Data>,
    val status: Int?,
    val success: Boolean
) {
    data class Data(
        val account_id: Int?,
        val account_url: String?,
        val ad_config: AdConfig,
        val ad_type: Int?,
        val ad_url: String?,
        val comment_count: Int?,
        val cover: String?,
        val cover_height: Int?,
        val cover_width: Int?,
        val datetime: Int?,
        val description: Any?,
        val downs: Int?,
        val favorite: Boolean?,
        val favorite_count: Int?,
        val id: String?,
        val images: List<Image>?,
        val images_count: Int?,
        val in_gallery: Boolean?,
        val in_most_viral: Boolean?,
        val include_album_ads: Boolean?,
        val is_ad: Boolean?,
        val is_album: Boolean?,
        val layout: String?,
        val link: String?,
        val nsfw: Boolean?,
        val points: Int?,
        val privacy: String?,
        val score: Int?,
        val section: String?,
        val tags: List<Tag>,
        val title: String?,
        val topic: Any?,
        val topic_id: Any?,
        val ups: Int?,
        val views: Int?,
        val vote: Any?
    ) {
        data class AdConfig(
            val highRiskFlags: List<Any>,
            val high_risk_flags: List<Any>,
            val nsfw_score: Double,
            val safeFlags: List<String>,
            val safe_flags: List<String>,
            val showAdLevel: Int?,
            val show_ad_level: Int?,
            val show_ads: Boolean?,
            val showsAds: Boolean?,
            val unsafeFlags: List<String>,
            val unsafe_flags: List<String>,
            val wallUnsafeFlags: List<String>,
            val wall_unsafe_flags: List<String>
        )


    }
}