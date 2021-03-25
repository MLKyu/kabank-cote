package com.alansoft.kacote.data

import com.alansoft.kacote.data.api.KakaoSearchApi
import com.alansoft.kacote.data.utils.BaseDataSource
import javax.inject.Inject

/**
 * Created by LEE MIN KYU on 2021/03/25
 * Copyright © 2021 Dreamus Company. All rights reserved.
 */
class KakaoSearchManager @Inject constructor(
    private val kakaoSearchApi: KakaoSearchApi
) : BaseDataSource() {

    suspend fun getSearchImg(query: String, sort: String, page: Int, size: Int) =
        getResult { kakaoSearchApi.getSearchImg(query, sort, page, size) }

    suspend fun getSearchVideo(query: String, sort: String, page: Int, size: Int) =
        getResult { kakaoSearchApi.getSearchVideo(query, sort, page, size) }
}