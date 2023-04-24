package com.example.prac10_thread

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ed = findViewById<View>(R.id.editText) as EditText
        var b = findViewById<View>(R.id.button) as Button
        var tv = findViewById<View>(R.id.txtView) as TextView
        val msg1 = "Thread"
        var msg2 = ""
        b.setOnClickListener(){
            msg2=ed.text.toString()
            tv.setTextSize(32f)
            tv.setTextColor(Color.RED)
            Thread(Runnable {
                while (true) {

                    runOnUiThread{ tv.text = msg1 }
                    Thread.sleep(1000)
                    runOnUiThread{ tv.text = msg2 }

                    Thread.sleep(1000)
                }
            }).start()

        }

    }
}