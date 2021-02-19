package com.example.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnter: Button = findViewById(R.id.btnEnter)

        btnEnter.setOnClickListener(){

            val tfName = findViewById<TextView>(R.id.tfName)

            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("personName", tfName.text.toString()) //pass string to another activity

            startActivity(intent);
        }


    }
}