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
            openUrl("https://www.linkedin.com/in/lakshay-karad-2286882bb/")
        }

        // GitHub Button
        val btnGithub = findViewById<Button>(R.id.btnGithub)
        btnGithub.setOnClickListener {
            openUrl("https://github.com/lakshaykarad")
        }

        // LeetCode Button
        val btnLeet = findViewById<Button>(R.id.btnLeetCode)
        btnLeet.setOnClickListener {
            openUrl("https://leetcode.com/u/karadlakshay7/")
        }

        // Upwork Button
        val btnUpwork = findViewById<Button>(R.id.btnUpwork)
        btnUpwork.setOnClickListener {
            openUrl("https://www.upwork.com/freelancers/~0180c4dfd5297299a0?mp_source=share")
        }

        // Email Button
        val btnEmail: Button = findViewById<Button>(R.id.btnEmail)
        btnEmail.setOnClickListener {
            sendEmail("harshhers@gmail.com")
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