package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var i = 0
    var k = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text)
        val buttonm = findViewById<Button>(R.id.buttonm)
        textView.text = i.toString();
        val buttonp = findViewById<Button>(R.id.buttonp)
        buttonm.setOnClickListener {
            if(i > 0) i--
            else {
                Toast.makeText(applicationContext, "воафлдао", Toast.LENGTH_LONG).show()
            }
            textView.text = i.toString()
        }
        buttonp.setOnClickListener{
            i++
            textView.text = i.toString()
        }
    }
}