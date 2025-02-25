package com.the43h1.aboutme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val nameB = findViewById<Button>(R.id.name_b)

        nameB.setOnClickListener {
            addName(it)
        }


        val designationB = findViewById<Button>(R.id.design_b)

        designationB.setOnClickListener {
            addDesignation(it)
        }
    }

    private fun addName(view : View){
        val editName = findViewById<EditText>(R.id.name_edit)
        val viewName = findViewById<TextView>(R.id.target_name)

        // To Change Name
        viewName.text = editName.text

        // To change Visibility of Both
        editName.visibility = View.GONE
        view.visibility = View.GONE
        viewName.visibility = View.VISIBLE
    }

    private fun addDesignation(view : View){
        val editDesignation = findViewById<EditText>(R.id.design_edit)
        val viewDesignation = findViewById<TextView>(R.id.target_designation)

        // To Change Name
        viewDesignation.text = editDesignation.text

        // To change Visibility of Both
        editDesignation.visibility = View.GONE
        view.visibility = View.GONE
        viewDesignation.visibility = View.VISIBLE
    }
}