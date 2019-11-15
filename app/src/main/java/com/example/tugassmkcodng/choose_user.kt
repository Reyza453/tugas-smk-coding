package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class choose_user : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chose_user)
        val btn_user=findViewById<Button>(R.id.btn_daftar_user)
        val btn_driver=findViewById<Button>(R.id.btn_driver)

        btn_driver.setOnClickListener({
            val Intent=Intent(this,driver::class.java)
            startActivity(Intent)
        })


    }
}
