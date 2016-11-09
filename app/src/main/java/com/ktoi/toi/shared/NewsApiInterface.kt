package com.ktoi.toi.shared

import com.ktoi.toi.model.NewsResponse

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface NewsApiInterface {
    @GET("/feeds/newsdefaultfeeds.cms?feedtype=sjson")
    fun getNews(): Observable<NewsResponse>
}