package com.the43h1.aboutme

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val CreateB = findViewById<Button>(R.id.create_b)

        CreateB.setOnClickListener {
            intent = Intent(this, CreateActivity::class.java)
            startActivity(this.intent)
        }

        val linkedinB = findViewById<Button>(R.id.linkedin_b)

        linkedinB.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/43h1-boi"))
            startActivity(intent)
        }


        val githubB = findViewById<Button>(R.id.github_b)

        githubB.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/43H1-BOI"))
            startActivity(intent)
        }

    }
}