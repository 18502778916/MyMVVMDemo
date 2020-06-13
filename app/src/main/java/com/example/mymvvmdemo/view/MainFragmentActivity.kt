package com.example.mymvvmdemo.view

import androidx.lifecycle.Observer
import androidx.navigation.fragment.NavHostFragment
import com.example.mymvvmdemo.R
import com.example.mymvvmdemo.base.BaseActivity
import com.example.mymvvmdemo.view_model.MainViewModel
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.android.synthetic.main.include_base_title.*

class MainFragmentActivity : BaseActivity<MainViewModel>() {
    override var mTitle: String = "主页"

    override fun getLayoutId(): Int = R.layout.activity_test

    override fun providerVMClass(): Class<MainViewModel>? =
        MainViewModel::class.java

    override fun initView() {
        initLive()
    }

    private fun initLive() {
        LiveEventBus.get("title_key", String::class.java)
            .observe(this, Observer {
                tv_title_include.text = it
            })
    }

    override fun onSupportNavigateUp(): Boolean {
        val fragment =
            supportFragmentManager.findFragmentById(R.id.fm_test) ?: return false
        return NavHostFragment.findNavController(fragment).navigateUp()
    }

}