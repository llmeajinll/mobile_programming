package com.example.test99

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ShowgiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.showgift)

        var back=findViewById<ImageButton>(R.id.back3)

        back.setOnClickListener {
            finish()
        }
    }
}