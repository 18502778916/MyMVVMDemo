package com.example.mymvvmdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mymvvmdemo.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

abstract class BaseFragment<VM:ViewModel>:Fragment(),CoroutineScope by MainScope() {
    protected lateinit var mViewModel: VM
    protected abstract fun getLayoutId(): Int
    protected abstract fun providerVMClass(): Class<VM>?
    protected abstract fun initView()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        providerVMClass()?.let { mViewModel = ViewModelProvider(this!!.activity!!)[it] }
        initView()
    }

    override fun onDestroy() {
        cancel()
        super.onDestroy()
    }

    protected open fun showFail(message: String? = null) {
        message?.let { Toast.makeText(activity?.applicationContext, it, Toast.LENGTH_LONG).show() }
    }
}