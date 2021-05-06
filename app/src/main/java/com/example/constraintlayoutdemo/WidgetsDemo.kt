package com.example.constraintlayoutdemo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatRadioButton
import com.example.constraintlayoutdemo.databinding.ActivityWidgetsDemoBinding


class WidgetsDemo : AppCompatActivity() {
    private lateinit var binding: ActivityWidgetsDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
         * view binding
         */
        binding = ActivityWidgetsDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter: ArrayAdapter<String> =
            ArrayAdapter(
                baseContext,
                R.layout.simple_spinner_item,
                listOf("Abc", "Abcd", "Abcde", "Abcdef")
            )
        binding.spinner.adapter = adapter

        binding.checkbox.setOnCheckedChangeListener { compoundButton, b ->
            binding.seekBar.isEnabled = b
            binding.pbar.progress = 0
        }

        binding.checkbox.setOnCheckedChangeListener { _, b ->

                binding.seekBar.isEnabled = b
                binding.pbar.progress = 0

        }

        binding.seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(baseContext, "Progress change stop", Toast.LENGTH_SHORT).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(baseContext, "Progress change start", Toast.LENGTH_SHORT).show()
            }

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                //Toast.makeText(applicationContext, progress.toString(), Toast.LENGTH_LONG).show()
                binding.seekvalue.text = progress.toString()
            }
        })

        binding.radiogroup
            .setOnCheckedChangeListener { group, checkedId ->
                Log.d("chk", "id$checkedId")
                val chekd = findViewById<AppCompatRadioButton>(checkedId)
                Toast.makeText(baseContext, chekd.text, Toast.LENGTH_SHORT).show()
                if (checkedId == R.id.radioMale) {
                    //some code
                    binding.pbar.visibility = View.VISIBLE
                } else if (checkedId == R.id.radioFemale) {
                    //some code
                    binding.pbar.visibility = View.GONE
                }
            }
    }
}