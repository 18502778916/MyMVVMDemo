package com.example.mymvvmdemo.view

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymvvmdemo.R
import com.example.mymvvmdemo.adapter.ArticleListAdapter
import com.example.mymvvmdemo.base.BaseFragment
import com.example.mymvvmdemo.model.Chapters
import com.example.mymvvmdemo.model.ChaptersList
import com.example.mymvvmdemo.view_model.MainViewModel
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : BaseFragment<MainViewModel>() {
    override fun getLayoutId(): Int = R.layout.fragment_second

    override fun providerVMClass(): Class<MainViewModel>? = MainViewModel::class.java

    private var articleListAdapter: ArticleListAdapter = ArticleListAdapter()

    private var pageNum: Int = 1

    override fun initView() {
        initLive()
        rv_article_list.layoutManager = LinearLayoutManager(activity);
        rv_article_list.adapter = articleListAdapter
        rv_article_list.addItemDecoration(
            DividerItemDecoration(
                activity,
                DividerItemDecoration.VERTICAL
            )
        )
//        articleListAdapter.setOnItemClickListener(onItemClickListener)

    }

    private fun initLive() {
        LiveEventBus.get("article_list", ChaptersList::class.java)
            .observe(this, Observer {
                articleListAdapter?.setList(it.data.datas)
            })

        LiveEventBus.get("title_key")
            .post("第二个Fragment")

        val chapters = Observer<Chapters> {
            mViewModel.getArticleList(it.id, pageNum.toString())
        }
        mViewModel.chapters.observe(this,chapters)
    }
}