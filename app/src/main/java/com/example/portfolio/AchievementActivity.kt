package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AchievementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievement)

        val descriptionTextView = findViewById<TextView>(R.id.tvAchievements)
        val btnAchievements = findViewById<Button>(R.id.btnAchievements)
        btnAchievements.setOnClickListener{
            descriptionTextView.text ="Created a Spotify clone using HTML, CSS, and JavaScript.\n" +
                    "Developed an AI Voice Assistant with Python.\n" +
                    "Built an Android Portfolio App using Kotlin.\n" +
                    "Participated in real-world hackathons, collaborating with teams to build practical and innovative solutions.\n" +
                    "Worked on 10+ web development projects.\n" +
                    "Continuously learning and improving skills through personal projects.\n"
        }
    }
}