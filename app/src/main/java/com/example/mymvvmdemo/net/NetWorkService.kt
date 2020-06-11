package com.example.mymvvmdemo.net

object NetWorkService {
    private const val BASE_URL="https://www.wanandroid.com/"

    val api by lazy { ApiFactory.createService(BASE_URL,ApiService::class.java) }
}