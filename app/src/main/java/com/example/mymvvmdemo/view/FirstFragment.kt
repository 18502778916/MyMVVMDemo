package com.example.mymvvmdemo.view

import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.example.mymvvmdemo.R
import com.example.mymvvmdemo.adapter.WxarticleAdapter
import com.example.mymvvmdemo.base.BaseFragment
import com.example.mymvvmdemo.model.ArticleData
import com.example.mymvvmdemo.model.Chapters
import com.example.mymvvmdemo.view_model.MainViewModel
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.android.synthetic.main.fragment_first.rv_main

class FirstFragment : BaseFragment<MainViewModel>() {

    override fun getLayoutId(): Int =R.layout.fragment_first

    override fun providerVMClass(): Class<MainViewModel>? =MainViewModel::class.java

    private var wxarticleAdapter: WxarticleAdapter = WxarticleAdapter()

    override fun initView() {
        initLive()
        rv_main.layoutManager = LinearLayoutManager(activity);
        rv_main.adapter = wxarticleAdapter
        rv_main.addItemDecoration(DividerItemDecoration(activity, DividerItemDecoration.VERTICAL))
        wxarticleAdapter.setOnItemClickListener(onItemClickListener)
        mViewModel.getData()
    }
    private fun initLive(){
        LiveEventBus.get("my_key", ArticleData::class.java)
            .observe(this, Observer {
                wxarticleAdapter?.setList(it.data)
            })
        LiveEventBus.get("title_key")
            .post("第一个Fragment")
    }

    private var onItemClickListener= OnItemClickListener{adapter, view, position ->
        var clickData: Chapters = adapter.data[position] as Chapters
        mViewModel.chapters.value=clickData
        Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
    }
}