package com.example.mymvvmdemo.util

import android.widget.Toast
import com.example.mymvvmdemo.base.MyApplication

object ToastUtils {

    fun showShort(msg: String){
        Toast.makeText(MyApplication.instance,msg,Toast.LENGTH_SHORT).show()
    }
}