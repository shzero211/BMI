package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener{
            startActivity(Intent(this@MainActivity,BmiJavaActivity::class.java))
        }
        button2.setOnClickListener{
            startActivity(Intent(this@MainActivity,BmiKotlinActivity::class.java))
        }
    }
}