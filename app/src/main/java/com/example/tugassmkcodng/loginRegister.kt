package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.loginregister.*

class loginRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginregister)

        btn_login.setOnClickListener({
            val Intent= Intent(this,login::class.java)
            startActivity(Intent)
        })
    }
}
