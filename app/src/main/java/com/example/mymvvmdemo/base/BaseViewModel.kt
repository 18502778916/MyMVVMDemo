package com.example.mymvvmdemo.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymvvmdemo.model.LoadState

abstract class BaseViewModel : ViewModel() {
    // 加载状态
    val loadState = MutableLiveData<LoadState>()
}