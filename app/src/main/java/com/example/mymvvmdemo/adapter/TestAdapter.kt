package com.example.mymvvmdemo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.mymvvmdemo.model.Chapters

class TestAdapter(layoutResId: Int,data: List<Chapters?>?) : BaseQuickAdapter<Chapters, BaseViewHolder>(layoutResId, data as MutableList<Chapters>?) {
    override fun convert(holder: BaseViewHolder, item: Chapters) {

    }
}