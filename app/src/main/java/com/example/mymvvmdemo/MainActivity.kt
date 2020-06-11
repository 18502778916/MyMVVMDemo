package com.example.mymvvmdemo

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymvvmdemo.adapter.WxarticleAdapter
import com.example.mymvvmdemo.base.BaseActivity
import com.example.mymvvmdemo.model.ArticleData
import com.example.mymvvmdemo.view_model.MainViewModel
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    override var mTitle: String = "公众号列表"

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun providerVMClass(): Class<MainViewModel>? = MainViewModel::class.java

    private var wxarticleAdapter: WxarticleAdapter = WxarticleAdapter()

    override fun initView() {
        initLive()
        rv_main.layoutManager = LinearLayoutManager(this);
        rv_main.adapter = wxarticleAdapter
        rv_main.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        mViewModel.getData()
    }

    private fun initLive() {
        LiveEventBus.get("my_key", ArticleData::class.java)
            .observe(this, Observer {
                wxarticleAdapter?.setList(it.data)
            })
    }
}
