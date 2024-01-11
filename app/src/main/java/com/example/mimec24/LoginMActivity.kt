package com.example.mimec24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginMActivity : AppCompatActivity() {
    private lateinit var txtReg2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_mactivity)

        txtReg2 = findViewById(R.id.txtReg2)

        txtReg2.setOnClickListener{Reg2()}
    }
    private fun Reg2(){
        val ini = Intent (this, RegisterMActivity::class.java)
        startActivity(ini)
    }
}