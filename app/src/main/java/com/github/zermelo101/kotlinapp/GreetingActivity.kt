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
        setContentView(R.layout.activity_greeting)

        val greet = findViewById<TextView>(R.id.GreetingName)
        val name = intent.getStringExtra("name")

        greet.text = "Welcome $name"


    }
}