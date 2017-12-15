package com.example.bby.hacettepe.oldiesbutgoldies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.content.Intent;
import android.widget.Button
import kotlinx.android.synthetic.main.activity_story.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<View>(R.id.buton) as Button
        myButton.setOnClickListener {
            val intent = Intent(this@MainActivity, story::class.java)
            intent.putExtra("veri", "id")
            startActivity(intent)

        }
    }
}


