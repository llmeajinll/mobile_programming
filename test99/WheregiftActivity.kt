package com.example.test99

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WheregiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.whereisgift)

        var back=findViewById<ImageButton>(R.id.back1)

        back.setOnClickListener {
            finish()
        }

    }

}