package com.example.constraintlayoutdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val text = "By continuing you agree to Redaa's Terms & Conditions and Privacy Policy";
        val spannableStr = SpannableString(text)
        spannableStr.setSpan(ForegroundColorSpan(Color.BLACK), 35, 53, 0)
        spannableStr.setSpan(ForegroundColorSpan(Color.BLACK), 58, text.length, 0)
        val txtTnC = findViewById<TextView>(R.id.txtTnC)
        txtTnC.text = spannableStr
    }
}