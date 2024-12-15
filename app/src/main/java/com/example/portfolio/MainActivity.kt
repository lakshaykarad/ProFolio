package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // code for skill activity
        val btnSkills = findViewById<Button>(R.id.btnSkills)
        btnSkills.setOnClickListener{
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        // Code for Work Activity
        val btnWork = findViewById<Button>(R.id.btnWork)
        btnWork.setOnClickListener(){
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }

        // code for project activity
        val btnProjects = findViewById<Button>(R.id.btnProjects)
        btnProjects.setOnClickListener(){
            intent = Intent(this,ProjectsActivity::class.java)
            startActivity(intent)
        }

        // Code for Achievement Activity
        val btnAchievements = findViewById<Button>(R.id.btnAchievements)
        btnAchievements.setOnClickListener(){
            val intent = Intent(this, AchievementActivity::class.java)
            startActivity(intent)
        }

        // Code for Links Activity
        val btnLinks = findViewById<Button>(R.id.btnLinks)
        btnLinks.setOnClickListener(){
            val intent = Intent(this,Links::class.java)
            startActivity(intent)
        }
    }
}