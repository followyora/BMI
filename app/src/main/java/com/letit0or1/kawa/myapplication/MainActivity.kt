package com.letit0or1.kawa.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.RuntimeException
import java.util.*
import kotlin.math.abs
import kotlin.math.min
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var heightpicker: NumberPicker
    lateinit var weightpicker: NumberPicker
    lateinit var outputresults: TextView
    lateinit var resultButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heightpicker = findViewById(R.id.heightnp)
        weightpicker = findViewById(R.id.weightnp)
        outputresults = findViewById(R.id.textView)
        resultButton = findViewById(R.id.button3)

        heightpicker.minValue = 130
        heightpicker.maxValue = 220
        heightpicker.value = 150

        weightpicker.minValue = 40
        weightpicker.maxValue = 150
        weightpicker.value = 60

        resultButton.setOnClickListener {
            val height = heightpicker.value
            val weight = weightpicker.value
            val bmi = weight / Math.pow(height.toDouble() / 100, 2.0)
            val bmitext = String.format("%.1f", bmi)
            outputresults.text = bmitext.toString()

        }

    }

}