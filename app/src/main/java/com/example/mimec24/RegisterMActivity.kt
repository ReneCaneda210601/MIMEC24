package com.example.mimec24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterMActivity : AppCompatActivity() {
    private lateinit var txtIni2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_mactivity)

        txtIni2 = findViewById(R.id.txtIni2)

        txtIni2.setOnClickListener{Ini2()}
    }

    private fun Ini2(){
        val ini2 = Intent(this, LoginMActivity::class.java)
        startActivity(ini2)
    }
}