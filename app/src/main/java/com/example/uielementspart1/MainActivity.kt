package com.example.uielementspart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstName = findViewById<EditText>(R.id.firstName)
        val lastName = findViewById<EditText>(R.id.lastName)
        val emailAdd = findViewById<EditText>(R.id.emailAdd)
        val phoneNum = findViewById<EditText>(R.id.phoneNum)
        val button1 = findViewById<Button>(R.id.button1)
        findViewById<Switch>(R.id.switch1).setOnClickListener { phoneSwitch() }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                ageView.text = "Age : " + progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        button1.setOnClickListener {

            var firstname = firstName.text.toString()
            var lastname = lastName.text.toString()
            var emailadd = emailAdd.text.toString()
            var ageview = ageView.text.toString()
            var phonenum = phoneNum.text.toString()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("First Name", firstname)
            intent.putExtra("Last Name", lastname)
            intent.putExtra("Email", emailadd)
            intent.putExtra("Age", ageview)
            intent.putExtra("Phone Number", phonenum)
            startActivity(intent)
        }
    }
    private fun phoneSwitch() {
        val viewGroup = findViewById<Switch>(R.id.switch1)
        val numberFormatException = findViewById<TextView>(R.id.phoneNum)

        viewGroup.setOnClickListener {
            numberFormatException.visibility = if (viewGroup.visibility == View.VISIBLE) {
                View.VISIBLE
            } else {
                View.INVISIBLE
            }
        }
    }
}