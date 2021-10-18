package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var et:EditText
    lateinit var aa:ConstraintLayout
    lateinit var btn:Button
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et = findViewById(R.id.editTextTextPersonName)
        aa = findViewById(R.id.aa)
        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textView)




        var day = DayNight.day
        var night = DayNight.night

        btn.setOnClickListener {
            if(et.text.toString() == day){
                DayNight.changeBG(day,aa)
                et.setTextColor(Color.BLACK)
                tv.setTextColor(Color.BLACK)



            }else if (et.text.toString() == night){
                DayNight.changeBG(night,aa)
                et.setTextColor(Color.WHITE)
                tv.setTextColor(Color.WHITE)
            }
        }


    }
}