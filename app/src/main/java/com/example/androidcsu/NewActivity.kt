package com.example.androidcsu

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val data: String = intent.getStringExtra("key")!!
        val view = findViewById<TextView>(R.id.new_activity_text)
        view.text = data
    }
}