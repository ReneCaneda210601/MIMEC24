package com.example.mimec24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginUActivity : AppCompatActivity() {
    private lateinit var txtRegistro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_uactivity)

        txtRegistro = findViewById<TextView>(R.id.txtRegistro)

        txtRegistro.setOnClickListener{Registro()}

    }
    private fun Registro(){
        val reg = Intent(this, RegisterUActivity::class.java)
        startActivity(reg)
    }
}