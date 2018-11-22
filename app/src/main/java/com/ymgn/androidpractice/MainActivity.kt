package com.ymgn.androidpractice

import android.icu.util.GregorianCalendar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var sheepCount =0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var greeting = "こんにちは"
        var trialTime = Date()
        val calender = GregorianCalendar()
        calender.time = trialTime

        val hour = calender.get(Calendar.HOUR_OF_DAY)
        print(hour)
        if (hour in 1..11) {
            greeting = "おはよう"
        } else if (15 < hour) {
            greeting = "こんばんは"
        }
//        val sheepNum = 10
//        for (i in 1..sheepNum) {
//            greeting += "。。。ひつじが" + i + "匹"
//        }

        greeting += "ねむれませんか？"

        textView.text = greeting

        rootLayout.setOnClickListener {
            sheepCount++
            val sheepText = "ひつじが$sheepCount 匹"
            textView.text = sheepText
        }
    }
}
