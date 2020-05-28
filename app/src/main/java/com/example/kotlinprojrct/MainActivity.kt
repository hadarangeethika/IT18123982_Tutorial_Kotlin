package com.example.kotlinprojrct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun onSubmit(view: View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        txtAge.text = "Age : " +(currentYear - inputYear.text.toString().toInt())
    }
}
