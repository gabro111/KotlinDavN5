package com.example.wtfff.fragments

import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.wtfff.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text = DashboardFragmentArgs.fromBundle(requireArguments()).testArg1.toString()
    }
}