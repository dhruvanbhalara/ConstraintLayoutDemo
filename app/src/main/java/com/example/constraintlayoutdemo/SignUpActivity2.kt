package com.example.constraintlayoutdemo

import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import com.example.constraintlayoutdemo.databinding.ActivitySignUp2Binding

class SignUpActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_sign_up2)*/
        binding = ActivitySignUp2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = getString(R.string.tnc_new)
        val spannableStr = SpannableString(text)
        spannableStr.setSpan(ForegroundColorSpan(getColor(R.color.grey_dark)), 27, 47, 0)
        spannableStr.setSpan(ForegroundColorSpan(getColor(R.color.grey_dark)), 52, text.length, 0)


        /*
         * view binding
         */
        binding.txtTnC.text = spannableStr
    }
}