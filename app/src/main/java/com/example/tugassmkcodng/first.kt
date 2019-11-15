package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_activity.*

class first : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        btn_go.setOnClickListener({
            val Intent=Intent(this,loginRegister::class.java)
            startActivity(Intent)
        })
    }
}
