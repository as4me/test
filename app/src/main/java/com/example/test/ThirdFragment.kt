package com.example.test

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

public class ThirdFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val counterText: TextView = view.findViewById(R.id.textView3)

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            var counterValue = counterText.text.toString().toInt()
            counterText.text = (++counterValue).toString()
        }

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            var counterValue = counterText.text.toString().toInt()
            if(counterValue > 0 ) counterText.text = (--counterValue).toString()
        }
    }
}