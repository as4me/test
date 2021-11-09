package com.example.test

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment :  Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView: TextView = view.findViewById(R.id.textView)
        val button: Button = view.findViewById(R.id.button)

        button.setOnClickListener{
            textView.text = "Hello"
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment","onAttached")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"onDestroyView")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"onDetach")
    }
    companion object {


        private const val TAG = "MYFragment"
    }



}