package com.github.zermelo101.kotlinapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val receivedIntent : Intent = this.intent
        val name : String? = receivedIntent.getStringExtra("name")
        setContentView(R.layout.activity_greeting)
        val text : TextView = findViewById<EditText>(R.id.GreetingName)
        text.text = "Welcome $name"


    }
}