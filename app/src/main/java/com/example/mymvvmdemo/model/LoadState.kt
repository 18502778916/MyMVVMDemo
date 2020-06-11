package com.example.mymvvmdemo.model

sealed class LoadState(val msg: String) {
    /**
     * 加载中
     */
    class Loading(msg: String = ""): LoadState(msg)

    /**
     * 成功
     */
    class Success(msg: String = ""): LoadState(msg)

    /**
     * 失败
     */
    class Fail(msg: String = ""): LoadState(msg)
}