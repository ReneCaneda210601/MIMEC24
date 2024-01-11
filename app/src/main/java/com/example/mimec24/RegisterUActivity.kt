package com.example.mimec24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterUActivity : AppCompatActivity() {
    private lateinit var txtIni: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_uactivity)

        setContentView(R.layout.activity_register_uactivity)

        txtIni = findViewById(R.id.txtIni)
        txtIni.setOnClickListener{Ini()}
    }
    private fun Ini(){
        val reg = Intent (this, LoginUActivity::class.java)
        startActivity(reg)
    }

}