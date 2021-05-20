package com.ewell.library_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_libraary.*

class LibraaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libraary)
        text1.setOnClickListener {
            Toast.makeText(this,"点击了",Toast.LENGTH_SHORT).show()
        }

    }
}