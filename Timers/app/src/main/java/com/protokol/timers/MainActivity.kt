  package com.protokol.timers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

  class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object :CountDownTimer(10000,1000){
            override fun onFinish() {
                Toast.makeText(applicationContext,"Times UP",Toast.LENGTH_LONG).show()
                textView.text="Left: 0"
            }

            override fun onTick(millisUntilFinished: Long) {
                textView.text = "Left: "+millisUntilFinished/1000

            }

        }.start()
        
        
    }
}
