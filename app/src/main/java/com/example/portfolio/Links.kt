package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Links : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_links)

        // LinkedIn Button
        val btnLinkedin = findViewById<Button>(R.id.btnlinkedin)
        btnLinkedin.setOnClickListener {
            //Enter your linkedin link 
            openUrl("")
        }

        // GitHub Button
        val btnGithub = findViewById<Button>(R.id.btnGithub)
        btnGithub.setOnClickListener {
            //Enter your github link
            openUrl("")
        }

        // LeetCode Button
        val btnLeet = findViewById<Button>(R.id.btnLeetCode)
        btnLeet.setOnClickListener {
            // Enter your extra link
            openUrl("")
        }

        // Upwork Button
        val btnUpwork = findViewById<Button>(R.id.btnUpwork)
        btnUpwork.setOnClickListener {
            // Enter extra link
            openUrl("")
        }

        // Email Button
        val btnEmail: Button = findViewById<Button>(R.id.btnEmail)
        btnEmail.setOnClickListener {
            // Enter your gmail id
            sendEmail("abc@gmail.com")
        }
    }

    // Method to open URLs
    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    // Method to send email
    private fun sendEmail(email: String) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:$email")
        startActivity(intent)
    }
}
