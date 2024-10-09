package com.example.fourthapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editTextTextEditText = findViewById<EditText>(R.id.editTextText)
        val editTextText2EditText = findViewById<EditText>(R.id.editTextText2)
        val buttonButton = findViewById<Button>(R.id.button)
        val button2Button = findViewById<Button>(R.id.button2)
        val button3Button = findViewById<Button>(R.id.button3)
        val button4Button = findViewById<Button>(R.id.button4)
        val textViewTextView = findViewById<TextView>(R.id.textView)
        buttonButton.setOnClickListener {
            val num1 = editTextTextEditText.text.toString().toDoubleOrNull()
            val num2 = editTextText2EditText.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val sum = num1 + num2
                textViewTextView.text = "The Addition is :$sum"
            } else {
                textViewTextView.text = "Please Enter Valid Numbers."
            }
        }
        button2Button.setOnClickListener {
            val num1 = editTextTextEditText.text.toString().toDoubleOrNull()
            val num2 = editTextText2EditText.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val sum = num1 - num2
                textViewTextView.text = "The Subtraction is :$sum"
            } else {
                textViewTextView.text = "Please Enter Valid Numbers."
            }
        }
        button3Button.setOnClickListener {
            val num1 = editTextTextEditText.text.toString().toDoubleOrNull()
            val num2 = editTextText2EditText.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val sum = num1 * num2
                textViewTextView.text = "The Multiplication is :$sum"
            } else {
                textViewTextView.text = "Please Enter Valid Numbers."
            }
        }
        button4Button.setOnClickListener {
            val num1 = editTextTextEditText.text.toString().toDoubleOrNull()
            val num2 = editTextText2EditText.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val sum = num1 / num2
                textViewTextView.text = "The Division is :$sum"
            } else {
                textViewTextView.text = "Please Enter Valid Numbers."
            }
        }
    }
}