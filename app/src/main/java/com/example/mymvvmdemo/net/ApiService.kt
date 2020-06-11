package com.example.mymvvmdemo.net

import com.example.mymvvmdemo.base.BaseBean
import com.example.mymvvmdemo.model.ArticleData
import retrofit2.http.Field
import retrofit2.http.FieldMap
import retrofit2.http.GET
import retrofit2.http.POST

@JvmSuppressWildcards
interface ApiService {

    @POST("wxarticle/chapters")
    suspend fun request(@FieldMap map: Map<String,Any>):BaseBean

    @GET("wxarticle/chapters/json")
    suspend fun getWXArticle():ArticleData
}