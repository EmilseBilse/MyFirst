package com.easv.oe.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val mGreetings = Greetings()
    val mNames = Names()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* The following declarations are done by the
        import of kotlinx.android.synthetic.main.activity_main.*/
        //val btnOK = findViewById<Button>(R.id.btnOK)

        btnOK.setOnClickListener { v -> onClickOK() }
        btnOKDK.setOnClickListener{ v -> onClickOKDK() }
    }

    fun onClickOK(){
        greet(mGreetings.get())
        changeColor(etName.text.toString().toLowerCase())
    }

    fun onClickOKDK(){
        greet(mGreetings.getDK())
        changeColor(etName.text.toString().toLowerCase())
    }

    fun greet(greeting: String) {
        val etName = findViewById<EditText>(R.id.etName)
        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val gr = greeting
        val name = etName.text.toString()
        tvHeader.text = "$gr $name"
    }

    fun changeColor(name: String){
        when(mNames.checkForName(name)){
            "Boy" -> llBackground.setBackgroundColor(-16776961)
            "Girl" -> llBackground.setBackgroundColor(-65536)
            "None" -> llBackground.setBackgroundColor(-1)
        }
    }
}
