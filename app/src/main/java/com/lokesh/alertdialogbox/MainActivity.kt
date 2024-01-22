package com.lokesh.alertdialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonalert)

        button.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Alert")
            alert.setMessage("You have clicked button")
            alert.setPositiveButton("Yes"){ dialoginterface, which ->
                Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_LONG).show()
            }
            alert.setNegativeButton("No"){dialoginterface, which ->
                Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_LONG).show()
            }

            alert.setNeutralButton("Okay"){dialoginterface, which ->
                Toast.makeText(applicationContext,"Clicked Okay",Toast.LENGTH_LONG).show()
            }

            alert.show()
        }
    }
}