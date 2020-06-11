package com.example.mymvvmdemo.base

import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.include_base_title.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

abstract class BaseActivity<VM : ViewModel> : AppCompatActivity(), CoroutineScope by MainScope() {
    protected lateinit var mViewModel: VM
    protected abstract var mTitle: String
    protected abstract fun getLayoutId(): Int
    protected abstract fun providerVMClass(): Class<VM>?
    protected abstract fun initView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        providerVMClass()?.let { mViewModel = ViewModelProvider(this)[it] }
        tv_title_include.text = mTitle
        initView()
    }

    override fun onDestroy() {
        cancel()
        super.onDestroy()
    }

    protected open fun showFail(message: String? = null) {
        message?.let { Toast.makeText(this, it, Toast.LENGTH_LONG).show() }
    }
}