package com.example.wtfff.fragments

import android.app.NotificationManager
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.NavGraph
import androidx.navigation.Navigation
import com.example.wtfff.R

class HomeFragment:Fragment(R.layout.fragment_home) {
    private lateinit var button: Button;
    private lateinit var textView: EditText;
    private lateinit var button2: Button;
    private lateinit var textView2: EditText;
    private lateinit var navController: NavController;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.actionToDashboard)
        textView = view.findViewById(R.id.argumentTextView)

        button2 = view.findViewById(R.id.actionToSettings)
        textView2 = view.findViewById(R.id.argumentToSettings)
        navController = Navigation.findNavController(view)


        button2.setOnClickListener{

            val asd = Bundle()
            asd.putString("asd","lol")

            val pendingIntent = context?.let { it1 ->
                NavDeepLinkBuilder(it1)
                    .setGraph(R.navigation.nav_graph)
                    .setDestination(R.id.settingsFragment)
                    .setArguments(asd)
                    .createPendingIntent()
            }

           pendingIntent?.send()



            var deepLinkArg = -1
            if(textView2.text.toString().isNotEmpty()){
                deepLinkArg = textView2.text.toString().toInt()
            }






        }



        button.setOnClickListener{
            var amount = -1
            if(textView.text.toString().isNotEmpty()){
                amount = textView.text.toString().toInt()
            }

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)
            navController.navigate(action)
        }
    }
}