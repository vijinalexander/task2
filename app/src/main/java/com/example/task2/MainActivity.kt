package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
        var clickCount=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickCountDisplayView=findViewById<TextView>(R.id.clickCountView)
        val clickMeButton=findViewById<TextView>(R.id.clickButton)
        val usernameTextInputView=findViewById<TextInputLayout>(R.id.nameText)

        val mapValue= mutableMapOf("somebody" to 0)
        var count=0

        clickMeButton.setOnClickListener{
            var userName=usernameTextInputView.editText?.text.toString()
            if (userName.isNullOrEmpty())
            {
                userName="random"
            }
            if(!mapValue.containsKey(userName))
            {
                mapValue.put(userName,1)
            }
            else
            {
                count=mapValue[userName]!!
                count++
                mapValue[userName]=count
            }
            count=mapValue[userName]!!
            clickCountDisplayView.text="$userName clicked $count times"

        }
    }
    }
