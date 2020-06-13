package com.example.mymvvmdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.mymvvmdemo.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_first.setOnClickListener { view ->
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}