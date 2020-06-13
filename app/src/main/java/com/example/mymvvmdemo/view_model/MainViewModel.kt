package com.example.mymvvmdemo.view_model

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymvvmdemo.base.BaseViewModel
import com.example.mymvvmdemo.model.ArticleData
import com.example.mymvvmdemo.model.ChaptersList
import com.example.mymvvmdemo.model.LoadState
import com.example.mymvvmdemo.model.User
import com.example.mymvvmdemo.net.Repository
import com.example.mymvvmdemo.util.launch
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainViewModel : BaseViewModel() {


    fun getData() {
        GlobalScope.launch {
            coroutineScope {
                setData()
            }
        }
    }

    fun getData2(chapterId: String, chapterNum: String){
        GlobalScope.launch {
            coroutineScope {
                setData2(chapterId, chapterNum)
            }
        }
    }

    private suspend fun setData() = launch({
        //        loadState.value = LoadState.Loading()
        var myData: ArticleData = Repository.getWXArticle()
        LiveEventBus.get("my_key")
            .post(myData)
//        loadState.value = LoadState.Success()
    }, {
        //        loadState.value = LoadState.Fail()
    })

    private suspend fun setData2(chapterId: String, chapterNum: String) = launch({
        var myData: ChaptersList = Repository.getWxArticleList(chapterId, chapterNum)
        LiveEventBus.get("my_key2")
            .post(myData)
    }, {

    })
}