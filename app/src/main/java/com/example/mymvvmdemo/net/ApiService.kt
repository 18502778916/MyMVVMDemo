package com.example.mymvvmdemo.net

import com.example.mymvvmdemo.base.BaseBean
import com.example.mymvvmdemo.model.ArticleData
import com.example.mymvvmdemo.model.ChaptersList
import retrofit2.http.*

@JvmSuppressWildcards
interface ApiService {

    @POST("wxarticle/chapters")
    suspend fun request(@FieldMap map: Map<String, Any>): BaseBean

    @GET("wxarticle/chapters/json")
    suspend fun getWXArticle(): ArticleData

    @GET("wxarticle/list/{chaptersId}/{chaptersNum}/json")
    suspend fun getWxArticleList(@Path("chaptersId") chaptersId: String, @Path("chaptersNum") chaptersNum: String): ChaptersList
}