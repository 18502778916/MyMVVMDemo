package com.example.mymvvmdemo.net

import android.content.Context
import com.example.mymvvmdemo.base.BaseBean
import com.example.mymvvmdemo.model.ArticleData
import com.example.mymvvmdemo.model.ChaptersList

object Repository{
    private suspend fun <T:BaseBean> preprocessData(baseBean:T):T=
        if(baseBean.errorCode==0){
            baseBean
        }else{
            throw ApiException(baseBean.errorCode, baseBean.errorMsg)
        }

    suspend fun getWXArticle():ArticleData=
        NetWorkService.api.getWXArticle().let {
            preprocessData(it)
        }

    suspend fun getWxArticleList(chaptersId:String,chaptersNum:String):ChaptersList=
        NetWorkService.api.getWxArticleList(chaptersId,chaptersNum).let {
            preprocessData(it)
        }
}