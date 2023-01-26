package com.example.clickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter_value = 0
        var counter_add_value = 1
        var hundreds = 100
        val button = findViewById<ImageButton>(R.id.add_button)
        val counter_text = findViewById<TextView>(R.id.counter)
        val update_button = findViewById<ImageButton>(R.id.update_button)


        button.setOnClickListener{
            counter_value = counter_value + counter_add_value
            counter_text.text = counter_value.toString()
            if (counter_value >= hundreds){
                hundreds += 100
                update_button.visibility = View.VISIBLE
            }
        }

        update_button.setOnClickListener{
            update_button.visibility = View.INVISIBLE
            counter_add_value = counter_add_value + 1
        }



    }
}