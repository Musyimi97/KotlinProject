package com.protokol.practice1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val name = null
    val job = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun helloKotlin(view: View){
        textView.text="Hello Kotlin"
    }
    fun describeCollins(view: View){
        val name = nameText.toString()
        val job = jobText.toString()

        val simpson =Collins(job,name)


        textView.text = " Job: " + simpson.job + " Name: " + simpson.name
    }
}
