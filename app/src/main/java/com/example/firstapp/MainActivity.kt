package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //here we are creating a variable that finds the view from our design activity, recognize that is is a EditText, path to id is r.id."whatever id we need"
        var userTitle= findViewById<EditText>(R.id.userTitle)
        var userDesc = findViewById<EditText>(R.id.userDesc)
        var submit = findViewById<Button>(R.id.submitBtn)


        //all action that happens when submit button is clicked
        submit.setOnClickListener{
            //taking the user-title and information that was entered and taking the text and storing it into title. same below as well
            var title = userTitle.text.toString()
            var desc = userDesc.text.toString()
            //the method intent allows us to transfer context. taking these variables title and desc, and transferring them to postactivity class
            var intent = Intent(this ,PostActivity::class.java)
            //this then is the code to push the data
            intent.putExtra("title" , title)
            intent.putExtra("desc", desc)
            //function starts our transfer process
            startActivity(intent)
        }
    }
}
