package com.example.mymvvmdemo.view_model

import androidx.lifecycle.MutableLiveData
import com.example.mymvvmdemo.base.BaseViewModel
import com.example.mymvvmdemo.model.ArticleData
import com.example.mymvvmdemo.model.Chapters
import com.example.mymvvmdemo.model.ChaptersList
import com.example.mymvvmdemo.net.Repository
import com.example.mymvvmdemo.util.launch
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


class MainViewModel : BaseViewModel() {

    //liveData通常和viewModel一起使用
//    private val chapters: MutableLiveData<Chapters>? = null

   val chapters:MutableLiveData<Chapters> by lazy {
       MutableLiveData<Chapters>()
   }

    fun getData() {
        GlobalScope.launch {
            coroutineScope {
                setData()
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

    fun getArticleList(chapterId: String, chapterNum: String){
        GlobalScope.launch {
            coroutineScope {
                setArticleList(chapterId, chapterNum)
            }
        }
    }
    private suspend fun setArticleList(chapterId: String, chapterNum: String) = launch({
        var myData: ChaptersList = Repository.getWxArticleList(chapterId, chapterNum)
        LiveEventBus.get("article_list")
            .post(myData)
    }, {

    })

    fun postDataToSecondFragment(data: Chapters){
        LiveEventBus.get("article_data")
            .post(data)
    }
}