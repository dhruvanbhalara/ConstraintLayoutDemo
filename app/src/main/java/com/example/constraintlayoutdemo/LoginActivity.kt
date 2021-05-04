package com.example.constraintlayoutdemo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val text = "By continuing you agree to Redaa's Terms & Conditions and Privacy Policy";
        val spannableStr = SpannableString(text)
        spannableStr.setSpan(ForegroundColorSpan(Color.BLACK), 35, 53, 0)
        spannableStr.setSpan(ForegroundColorSpan(Color.BLACK), 58, text.length, 0)
        val txtTnC = findViewById<TextView>(R.id.txtTnC)
        txtTnC.text = spannableStr

        val regBtn = findViewById<Button>(R.id.btnReg)
        regBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}