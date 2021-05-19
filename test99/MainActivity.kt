package com.example.test99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val intent= Intent(this, StartActivity::class.java)
        startActivity(intent)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1=findViewById<ImageButton>(R.id.giftbutton)
        var button2=findViewById<ImageButton>(R.id.whereisgift)
        button1.setOnClickListener {
            var intent=Intent(applicationContext, BringtxtActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            var intent=Intent(applicationContext, WheregiftActivity::class.java)
            startActivity(intent)
        }
    }

}