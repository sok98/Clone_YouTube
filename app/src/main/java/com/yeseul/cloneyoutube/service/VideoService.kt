package com.yeseul.cloneyoutube.service

import com.yeseul.cloneyoutube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/102d1c0c-6c10-4df0-9910-e44e1fb505a3")
    fun listVideos(): Call<VideoDto>
}