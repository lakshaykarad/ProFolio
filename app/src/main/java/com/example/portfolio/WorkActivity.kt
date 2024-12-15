package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_work)

        val descriptionTextView = findViewById<TextView>(R.id.tv_work)
        // code to display work experience
        val btnWork = findViewById<Button>(R.id.btnWork)
        btnWork.setOnClickListener{
            descriptionTextView.text = "Current Focus:\n" +
                    "\n" +
                    "Personal Projects: Actively working on self-improvement and skill development. Projects include:\n" +
                    "\n" +
                    "Spotify Clone: Developed using HTML, CSS, and JavaScript.\n" +
                    "AI Voice Assistant: Created with Python.\n" +
                    "Portfolio Application: Built using Kotlin for app development.\n" +
                    "Continuous Learning: Enhancing skills in various areas such as programming, web development, and app development."
        }
    }
}