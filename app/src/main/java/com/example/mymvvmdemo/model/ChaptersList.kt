package com.example.mymvvmdemo.model

import com.example.mymvvmdemo.base.BaseBean

class ChaptersList : BaseBean() {
    var data = DataBean()
}

class DataBean {
    /**
     * curPage : 1
     * datas : [{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13865,"link":"https://mp.weixin.qq.com/s/I7r8PkZGOUlXpjYhI6VjJg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1591718400000,"selfVisible":0,"shareDate":1591801486000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列：仿饿了么商家详情页，嵌套滚动机制实战篇","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13813,"link":"https://mp.weixin.qq.com/s/jVRTFTiwTtr7P7vyAj8G7A","niceDate":"2020-06-08 00:00","niceShareDate":"2020-06-08 22:37","origin":"","prefix":"","projectLink":"","publishTime":1591545600000,"selfVisible":0,"shareDate":1591627043000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android避坑指南，发现了一个极度不安全的操作","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13812,"link":"https://mp.weixin.qq.com/s/zwQOc0fC7KI5RlRjFBpxvA","niceDate":"2020-06-06 00:00","niceShareDate":"2020-06-08 22:36","origin":"","prefix":"","projectLink":"","publishTime":1591372800000,"selfVisible":0,"shareDate":1591626969000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"ViewBinding 实战，递进优雅的写波代码","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13769,"link":"https://mp.weixin.qq.com/s/wWB5ENo3eQJH03OXvoup8w","niceDate":"2020-06-04 00:00","niceShareDate":"2020-06-04 22:53","origin":"","prefix":"","projectLink":"","publishTime":1591200000000,"selfVisible":0,"shareDate":1591282394000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"新技术 又又又又来了？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13753,"link":"https://mp.weixin.qq.com/s/eU25oon1I3MC-bCoiF9r8Q","niceDate":"2020-06-03 00:00","niceShareDate":"2020-06-03 22:48","origin":"","prefix":"","projectLink":"","publishTime":1591113600000,"selfVisible":0,"shareDate":1591195734000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"插件化技术的演进之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13743,"link":"https://mp.weixin.qq.com/s/ceXsH06fUFa7y4lzi4uXzw","niceDate":"2020-06-02 00:00","niceShareDate":"2020-06-02 23:01","origin":"","prefix":"","projectLink":"","publishTime":1591027200000,"selfVisible":0,"shareDate":1591110106000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"手把手的性能优化文章来了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13720,"link":"https://mp.weixin.qq.com/s/3QhMGVIcR1yW3xweJCa-9Q","niceDate":"2020-06-01 00:00","niceShareDate":"2020-06-01 22:46","origin":"","prefix":"","projectLink":"","publishTime":1590940800000,"selfVisible":0,"shareDate":1591022806000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"面试官: 说一下你做过哪些性能优化?","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13690,"link":"https://mp.weixin.qq.com/s/fy21IxnAMPQwKTXIWEUm_g","niceDate":"2020-05-30 00:00","niceShareDate":"2020-05-30 23:02","origin":"","prefix":"","projectLink":"","publishTime":1590768000000,"selfVisible":0,"shareDate":1590850968000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android Studio 4.0 稳定版发布啦！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13689,"link":"https://mp.weixin.qq.com/s/ubb3AFCfGKwTqpei7OBYIg","niceDate":"2020-05-29 00:00","niceShareDate":"2020-05-30 23:02","origin":"","prefix":"","projectLink":"","publishTime":1590681600000,"selfVisible":0,"shareDate":1590850952000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"推荐一个好用的小工具， 你可能从来没这样用过okhttp 拦截器","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13655,"link":"https://mp.weixin.qq.com/s/ghupyR4z0yYD-Fsd14rgEg","niceDate":"2020-05-27 00:00","niceShareDate":"2020-05-27 23:23","origin":"","prefix":"","projectLink":"","publishTime":1590508800000,"selfVisible":0,"shareDate":1590593037000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android内存优化大盘点","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13638,"link":"https://mp.weixin.qq.com/s/_EYDX7TP09jRjkLO9-aUlQ","niceDate":"2020-05-26 00:00","niceShareDate":"2020-05-26 19:29","origin":"","prefix":"","projectLink":"","publishTime":1590422400000,"selfVisible":0,"shareDate":1590492559000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这个插件因为大家更加强大了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13588,"link":"https://mp.weixin.qq.com/s/N5mCacpoxGIvS_ASDAiQDQ","niceDate":"2020-05-22 00:00","niceShareDate":"2020-05-23 00:03","origin":"","prefix":"","projectLink":"","publishTime":1590076800000,"selfVisible":0,"shareDate":1590163412000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"吹Kotlin协程的，可能吹错了！ 带你真正理解一波","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13543,"link":"https://mp.weixin.qq.com/s/BNDBgVHfPq0WpFs1g_xmoA","niceDate":"2020-05-21 00:00","niceShareDate":"2020-05-21 20:09","origin":"","prefix":"","projectLink":"","publishTime":1589990400000,"selfVisible":0,"shareDate":1590062988000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"吹爆系列：深入探索Android卡顿优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13542,"link":"https://mp.weixin.qq.com/s/3bsmiv78yJ4XKwd8iu-0Ig","niceDate":"2020-05-20 00:00","niceShareDate":"2020-05-21 20:09","origin":"","prefix":"","projectLink":"","publishTime":1589904000000,"selfVisible":0,"shareDate":1590062969000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"推荐一个非常好用的工具","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13541,"link":"https://mp.weixin.qq.com/s/FLsXPBue8jiqC0pfhXCtIw","niceDate":"2020-05-19 00:00","niceShareDate":"2020-05-21 20:09","origin":"","prefix":"","projectLink":"","publishTime":1589817600000,"selfVisible":0,"shareDate":1590062951000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"我们一起看看 jsonchao 是如何学习的吧！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13540,"link":"https://mp.weixin.qq.com/s/rqvjtg4t4SmdJBLl-f-Xlw","niceDate":"2020-05-18 00:00","niceShareDate":"2020-05-21 20:08","origin":"","prefix":"","projectLink":"","publishTime":1589731200000,"selfVisible":0,"shareDate":1590062935000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"RxHttp ，比Retrofit 更优雅的协程体验","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13539,"link":"https://mp.weixin.qq.com/s/CSlQHKZRdhAChbPrXsKLXA","niceDate":"2020-05-16 00:00","niceShareDate":"2020-05-21 20:08","origin":"","prefix":"","projectLink":"","publishTime":1589558400000,"selfVisible":0,"shareDate":1590062916000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"会写「18.dp」只是个入门Kotlin 的扩展函数和属性（Extension Functions/Properties）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13538,"link":"https://mp.weixin.qq.com/s/GdDkzR8AvgHROUiGwYtfOg","niceDate":"2020-05-15 00:00","niceShareDate":"2020-05-21 20:08","origin":"","prefix":"","projectLink":"","publishTime":1589472000000,"selfVisible":0,"shareDate":1590062890000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个牛逼的插件诞生了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13537,"link":"https://mp.weixin.qq.com/s/jnZpgaRFQT5ULk9tHWMAGg","niceDate":"2020-05-14 00:00","niceShareDate":"2020-05-21 20:07","origin":"","prefix":"","projectLink":"","publishTime":1589385600000,"selfVisible":0,"shareDate":1590062875000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"为何大厂APP如微信、支付宝等只适配了armeabi-v7a/armeabi？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":13536,"link":"https://mp.weixin.qq.com/s/sYz0D7rxCOVzVgTIJImXaQ","niceDate":"2020-05-13 00:00","niceShareDate":"2020-05-21 20:07","origin":"","prefix":"","projectLink":"","publishTime":1589299200000,"selfVisible":0,"shareDate":1590062849000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"现在还不清楚Android屏幕刷新原理，那就过分啦！","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 0
     * over : false
     * pageCount : 48
     * size : 20
     * total : 942
     */
    var curPage = 0
    var offset = 0
    var isOver = false
    var pageCount = 0
    var size = 0
    var total = 0
    var datas = arrayListOf<DatasBean>()
}

class DatasBean {
    /**
     * apkLink :
     * audit : 1
     * author : 鸿洋
     * canEdit : false
     * chapterId : 408
     * chapterName : 鸿洋
     * collect : false
     * courseId : 13
     * desc :
     * descMd :
     * envelopePic :
     * fresh : false
     * id : 13865
     * link : https://mp.weixin.qq.com/s/I7r8PkZGOUlXpjYhI6VjJg
     * niceDate : 2天前
     * niceShareDate : 1天前
     * origin :
     * prefix :
     * projectLink :
     * publishTime : 1591718400000
     * selfVisible : 0
     * shareDate : 1591801486000
     * shareUser :
     * superChapterId : 408
     * superChapterName : 公众号
     * tags : [{"name":"公众号","url":"/wxarticle/list/408/1"}]
     * title : 这交互炸了系列：仿饿了么商家详情页，嵌套滚动机制实战篇
     * type : 0
     * userId : -1
     * visible : 1
     * zan : 0
     */
    var apkLink: String? = null
    var audit = 0
    var author: String? = null
    var isCanEdit = false
    var chapterId = 0
    var chapterName: String? = null
    var isCollect = false
    var courseId = 0
    var desc: String? = null
    var descMd: String? = null
    var envelopePic: String? = null
    var isFresh = false
    var id = 0
    var link: String? = null
    var niceDate: String? = null
    var niceShareDate: String? = null
    var origin: String? = null
    var prefix: String? = null
    var projectLink: String? = null
    var publishTime: Long = 0
    var selfVisible = 0
    var shareDate: Long = 0
    var shareUser: String? = null
    var superChapterId = 0
    var superChapterName: String? = null
    var title: String? = null
    var type = 0
    var userId = 0
    var visible = 0
    var zan = 0
    var tags = arrayListOf<TagsBean>()
}

class TagsBean {
    /**
     * name : 公众号
     * url : /wxarticle/list/408/1
     */
    var name: String? = null
    var url: String? = null

}