package com.example.mymvvmdemo.net

class ApiException(val errorCode: Int,val msg: String): Throwable(msg)