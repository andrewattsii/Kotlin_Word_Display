package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_post.*
import org.w3c.dom.Text

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        //grabbing our fields
        var showTitle = findViewById<TextView>(R.id.showTitle)
        var showDesc = findViewById<TextView>(R.id.showDesc)
        //in the main activity intents were set to transfer title and desc, this intent on this class brings the information here and live
        var title = intent.getStringExtra("title")
        var desc = intent.getStringExtra("desc")

        showTitle.text = title
        showDesc.text = desc

        //button id called
        //button creates a path to go back to the main activity
        gobackBTN.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java ))
        }
    }
}
