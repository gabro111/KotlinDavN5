package com.example.wtfff.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.wtfff.R

class SettingsFragment: Fragment(R.layout.fragment_settings) {
       private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView2)
        val argument = arguments?.getString("asd")
        textView.text = argument.toString()
    }

}