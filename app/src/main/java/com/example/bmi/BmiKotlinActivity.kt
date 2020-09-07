package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_view_binding.*

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)
        bmibutton.setOnClickListener{
            val tallval=tall.text.toString().toDouble();
            val weightval=weight.text.toString().toDouble();

            val bmi=weightval/Math.pow(tallval/100.0,2.0)
            result.text="키:${tall.text},체중:${weight.text},BMI:$bmi"
        }
    }
}