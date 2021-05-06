package com.example.constraintlayoutdemo

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.constraintlayoutdemo.databinding.ActivityLoginBinding
import com.example.constraintlayoutdemo.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        * view binding
        */
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*setContentView(R.layout.activity_sign_up)*/

        val text = "By continuing you agree to Redaa's Terms & Conditions and Privacy Policy";
        val spannableStr = SpannableString(text)
        spannableStr.setSpan(ForegroundColorSpan(Color.BLACK), 35, 53, 0)
        spannableStr.setSpan(ForegroundColorSpan(Color.BLACK), 58, text.length, 0)
        val txtTnC = findViewById<TextView>(R.id.txtTnC)
        //txtTnC.text = spannableStr

        /*
        * view binding
        */
        binding.txtTnC.text = spannableStr
    }
}