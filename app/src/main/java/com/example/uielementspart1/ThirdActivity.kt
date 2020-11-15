package com.example.uielementspart1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

            val intent = intent
            val firstname = intent.getStringExtra("First Name")
            val lastname = intent.getStringExtra("Last Name")
            val emailadd = intent.getStringExtra("Email")
            val ageview = intent.getStringExtra("Age")
            val phonenum = intent.getStringExtra("Phone Number")
            val calendarview = intent.getStringExtra("Birthday")

            val callResult = findViewById<TextView>(R.id.callResult)
            callResult.text =
                "First Name: " + firstname + "\nLast Name: " + lastname + "\nEmail: " + emailadd + "\n" + ageview + "\nPhone Number: " + phonenum + "\nBirthday: " + calendarview
    }
}