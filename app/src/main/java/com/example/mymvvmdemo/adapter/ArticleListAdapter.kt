package com.example.mymvvmdemo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.module.LoadMoreModule
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.mymvvmdemo.R
import com.example.mymvvmdemo.model.Chapters
import com.example.mymvvmdemo.model.ChaptersList
import com.example.mymvvmdemo.model.DatasBean

class ArticleListAdapter : BaseQuickAdapter<DatasBean, BaseViewHolder>(R.layout.item_wxarticle_rv),LoadMoreModule {
    override fun convert(holder: BaseViewHolder, item: DatasBean) {
        holder.setText(R.id.tv_wxarticle_rv, item.title)
    }
}