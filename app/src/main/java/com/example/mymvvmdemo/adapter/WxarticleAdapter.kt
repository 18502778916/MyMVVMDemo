package com.example.mymvvmdemo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.module.LoadMoreModule
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.mymvvmdemo.R
import com.example.mymvvmdemo.model.Chapters

class WxarticleAdapter : BaseQuickAdapter<Chapters, BaseViewHolder>(R.layout.item_wxarticle_rv),LoadMoreModule {
    override fun convert(holder: BaseViewHolder, item: Chapters) {
        holder.setText(R.id.tv_wxarticle_rv, item.name)
    }
}