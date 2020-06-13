package com.example.mymvvmdemo.view

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.mymvvmdemo.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    override fun onSupportNavigateUp(): Boolean {
        val fragment =
            supportFragmentManager.findFragmentById(R.id.fm_test)
        return NavHostFragment.findNavController(fragment!!).navigateUp()
    }
}