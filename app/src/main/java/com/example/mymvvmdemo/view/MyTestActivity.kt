package com.example.mymvvmdemo.view

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.mymvvmdemo.R
import com.example.mymvvmdemo.base.BaseActivity
import com.example.mymvvmdemo.view_model.MyTestViewModel

class MyTestActivity : BaseActivity<MyTestViewModel>() {
    override var mTitle = "我的新页面"

    override fun getLayoutId(): Int = R.layout.activity_test

    override fun providerVMClass(): Class<MyTestViewModel>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSupportNavigateUp(): Boolean {
        val fragment = supportFragmentManager.findFragmentById(R.id.fm_test) ?: return false
        return NavHostFragment.findNavController(fragment).navigateUp()
    }

}