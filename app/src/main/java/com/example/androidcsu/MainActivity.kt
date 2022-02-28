package com.example.androidcsu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<Button>(R.id.button)
        view.setOnClickListener {
            openSecondActivity()
        }
    }

    private fun openSecondActivity() {
        val sendIntent = Intent(this, NewActivity::class.java).apply {
            putExtra("key", "test")
        }
        startActivity(sendIntent)
    }
}