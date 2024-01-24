package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.textView)
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)

        var counter = 0
        var incrementer = 1

        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()

            counter += incrementer
            textview.text = counter.toString()

            if (counter >= 100 && incrementer == 1) {
                upgradeButton.visibility = View.VISIBLE
            }
        }

        upgradeButton.setOnClickListener {
            incrementer += 1
            upgradeButton.visibility = View.INVISIBLE
            button.setText("ADD 2")
        }
    }
}