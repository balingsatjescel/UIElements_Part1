package com.example.uielementspart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val calendarView = findViewById<CalendarView>(R.id.calendarView) as CalendarView

        var firstname = getIntent().getStringExtra("First Name")
        var lastname = getIntent().getStringExtra("Last Name")
        var emailadd = getIntent().getStringExtra("Email")
        var ageview = getIntent().getStringExtra("Age")
        var phonenum = getIntent().getStringExtra("Phone Number")

        button2.setOnClickListener {

            val calendarView = findViewById<CalendarView>(R.id.calendarView).date.toString()

            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            intent.putExtra("First Name", firstname)
            intent.putExtra("Last Name", lastname)
            intent.putExtra("Email", emailadd)
            intent.putExtra("Age", ageview)
            intent.putExtra("Phone Number", phonenum)
            intent.putExtra("Birthday", calendarView)
            startActivity(intent)
        }
    }
}



