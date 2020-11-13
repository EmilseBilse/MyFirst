package com.easv.oe.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvHeader: TextView? = null
    private var etName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHeader = findViewById(R.id.tvHeader)
        val btnOK = findViewById<Button>(R.id.btnOK)
        etName = findViewById(R.id.etName)
        btnOK.setOnClickListener { v -> onClickOK() }
    }

    fun onClickOK(){
        val name = etName?.text
        tvHeader?.text = "Hello $name"
    }
}
