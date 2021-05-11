package com.example.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize button and set onclick listener
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            showToast()
        }

    }

    /**
     *     used for showing custom toast
     */
   fun showToast(){
       val layout = layoutInflater.inflate(R.layout.custom_toast,LinearLayout(this))
       val myToast = Toast(applicationContext)
       val text: TextView = layout.findViewById(R.id.text)
       text.text = "This is a custom toast and beautiful flower"
       myToast.duration = Toast.LENGTH_LONG
       myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 400)
       myToast.view = layout//setting the view of custom toast layout
       myToast.show()
   }
}