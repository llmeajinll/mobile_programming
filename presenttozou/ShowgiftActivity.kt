package com.example.presenttozou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.core.app.ActivityCompat

class ShowgiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ranking)

        var back=findViewById<ImageButton>(R.id.button4)
        var home=findViewById<ImageButton>(R.id.button3)

        back.setOnClickListener {
            finish()
        }
        home.setOnClickListener{
            //메인화면으로 가기
            //ActivityCompat.finishAffinity(this);
        }
    }
}