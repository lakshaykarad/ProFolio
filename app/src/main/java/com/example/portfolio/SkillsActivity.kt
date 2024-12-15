package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        // Find views by their IDs
        val descriptionTextView = findViewById<TextView>(R.id.tv_skill_description)

        val btnCpp = findViewById<Button>(R.id.btn_cpp)
        val btnKotlin = findViewById<Button>(R.id.btn_kotlin)
        val btnAndroid = findViewById<Button>(R.id.btn_android)
        val btnDsa = findViewById<Button>(R.id.btn_dsa)
        val btnHtml = findViewById<Button>(R.id.btn_html)
        val btnPython = findViewById<Button>(R.id.btn_python)

        // Set up click listeners for each button
        btnCpp.setOnClickListener {
            descriptionTextView.text = "C++: Proficient in C++, a powerful language used for system/software development and competitive programming."
        }

        btnKotlin.setOnClickListener {
            descriptionTextView.text = "Kotlin: Skilled in Kotlin, a modern programming language for Android development."
        }

        btnAndroid.setOnClickListener {
            descriptionTextView.text = "Android Development: Capable of building robust mobile applications using Android Studio and components like Activities, Fragments, ViewModels, etc."
        }

        btnDsa.setOnClickListener {
            descriptionTextView.text = "DSA: Proficient in Data Structures and Algorithms for efficient problem-solving."
        }

        btnHtml.setOnClickListener {
            descriptionTextView.text = "HTML, CSS, JS: Knowledgeable in web development, creating dynamic and responsive web pages."
        }

        btnPython.setOnClickListener {
            descriptionTextView.text = "Python: Familiar with Python, used in web development, scripting, and data analysis."
        }
    }
}
