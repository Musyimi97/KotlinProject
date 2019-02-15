package com.protokol.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent=intent
        val received:String=intent.getStringExtra("input")

        textView2.text=received
    }
    fun goBack(view: View){
        val intent=Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)

    }
}
