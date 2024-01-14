package com.example.mimec24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginMActivity : AppCompatActivity() {
    private lateinit var txtReg2: TextView
    private lateinit var iniS: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_mactivity)

        txtReg2 = findViewById(R.id.txtReg2)
        txtReg2.setOnClickListener{Reg2()}

        iniS = findViewById(R.id.iniS)
        iniS.setOnClickListener{IniS()}
    }
    private fun Reg2(){
        val ini = Intent (this, RegisterMActivity::class.java)
        startActivity(ini)
    }

    private fun IniS(){
        val ini = Intent (this, inicioM::class.java)
        startActivity(ini)
    }
}