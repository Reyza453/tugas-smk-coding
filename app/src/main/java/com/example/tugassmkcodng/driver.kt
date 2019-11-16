package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_driver.*

class driver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver)

        img_mikrolet.setOnClickListener({
            val Intent= Intent(this,list_mikrolet_driver::class.java)
            startActivity(Intent)
        })
        img_bus.setOnClickListener({
            val Intent1=Intent(this,list_bis_driver::class.java)
            startActivity(Intent1)
        })
    }
}
