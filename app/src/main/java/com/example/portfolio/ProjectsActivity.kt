package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProjectsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        val descriptionTextView = findViewById<TextView>(R.id.tv_project)
        val btnProjects = findViewById<Button>(R.id.btnProjects)
        btnProjects.setOnClickListener{
            descriptionTextView.text = "Worked on a Spotify clone using HTML, CSS, and JavaScript.\n" +
                    "Developed an AI Voice Assistant using Python.\n" +
                    "Built an Android Portfolio Application using Kotlin.\n" +
                    "Completed over 10 web development projects.\n" +
                    "Continuously improving my skills and building personal projects.\n" +
                    "You can find all the projects on my GitHub profile:\n" +
                    "GitHub: [https://github.com/lakshaykarad?tab=repositories]"
        }
    }
}
