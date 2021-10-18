package com.example.companionobjectsapp

import androidx.constraintlayout.widget.ConstraintLayout

class DayNight {
    companion object{

        val day = "day"
        val night = "night"

        fun changeBG(va:String,ll:ConstraintLayout){
            when(va){
                day -> ll.setBackgroundResource(R.drawable.day)
                night -> ll.setBackgroundResource(R.drawable.night)
            }

        }


    }
}