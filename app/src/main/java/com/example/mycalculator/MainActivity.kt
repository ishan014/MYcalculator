package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvinput: TextView?=null
    var lastNumeric : Boolean = false
    var  lastDot : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvinput = findViewById(R.id.tvinput)
    }

    fun ondigit(view: View){
        tvinput?.append((view as Button).text)
        lastNumeric=true
        lastDot=false 
    }

    fun onclear (view: View){
        tvinput?.text= ""
    }

    fun onDecimalPoint(view: View) {

        if (lastNumeric && !lastDot){
            tvinput?.append(".")
            lastNumeric=false
            lastDot=true
        }
    }

}