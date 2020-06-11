package com.example.mymvvmdemo.model

import com.example.mymvvmdemo.base.BaseBean

class ArticleData:BaseBean() {
    var data= arrayListOf<Chapters>()
}

class Chapters{
    var courseId=""
    var id=""
    var name=""
    var order=""
}