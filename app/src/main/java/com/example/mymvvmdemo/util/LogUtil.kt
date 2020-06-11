package com.example.mymvvmdemo.util

import android.util.Log
import com.example.mymvvmdemo.base.MyApplication

object LogUtil{
    const val TAG = "PetPet"

    /**
     * Verbose: 开发调试过程中一些详细信息，不应该编译进产品中，只在开发阶段使用。
     */
    fun v(msg: String) {
        if (MyApplication.isDebugMode) {
            Log.v(TAG, msg)
        }
    }

    /**
     * Verbose: 开发调试过程中一些详细信息，不应该编译进产品中，只在开发阶段使用。
     */
    fun v(tag: String, msg: String) {
        if (MyApplication.isDebugMode) {
            Log.v(tag, msg)
        }
    }

    /**
     * Info:例如一些运行时的状态信息，这些状态信息在出现问题的时候能提供帮助。
     */
    fun i(tag: String, msg: String) {
        if (MyApplication.isDebugMode) {
            Log.i(tag, msg)
        }
    }

    /**
     * Error: 错误信息
     */
    fun e(msg: String) {
        Log.e(TAG, msg)
    }
}