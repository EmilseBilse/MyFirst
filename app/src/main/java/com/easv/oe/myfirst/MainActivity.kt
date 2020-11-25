package com.easv.oe.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val btnOK = findViewById<Button>(R.id.btnOK)
        val etName = findViewById<EditText>(R.id.etName)
        btnOK.setOnClickListener { v -> onClickOK(tvHeader, etName.text.toString()) }
    }

    fun onClickOK(tv: TextView, name: String){
        tv.text = "Hello $name"
    }
}
