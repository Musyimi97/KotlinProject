package com.protokol.layouts

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences=this.getSharedPreferences("com.protokol.layouts", Context.MODE_PRIVATE)
        var age = 21

       // sharedPreferences.edit().putInt("userAge",age)

        val storedAge=sharedPreferences.getInt("userAge",0)

        println("USER AGE: $storedAge")

        age=31

        sharedPreferences.edit().putInt("userAge",age).apply()

        val storedAge1=sharedPreferences.getInt("userAge",0)
        println("User age after ten years: $storedAge1")

    }




}
