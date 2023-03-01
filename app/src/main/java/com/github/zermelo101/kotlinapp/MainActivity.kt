package com.github.zermelo101.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateGreetingActivity(view: View) {
        val intent = Intent(this, GreetingActivity::class.java)
        val editText : EditText = findViewById<EditText>(R.id.mainText)
        intent.putExtra("name", editText.text.toString())
        this.startActivity(intent)


    }
}