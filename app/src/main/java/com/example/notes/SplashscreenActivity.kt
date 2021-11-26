package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        supportActionBar?.hide() //ini kaya efek gtu

        Handler().postDelayed({
            val intent = Intent(this@SplashscreenActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)

    }
}