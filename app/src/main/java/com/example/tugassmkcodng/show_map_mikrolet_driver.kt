package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_map_mikrolet_driver.*

class show_map_mikrolet_driver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_map_mikrolet_driver)

        btn_kembali_showmap_mikrolet.setOnClickListener({
            val Intent= Intent(this,list_mikrolet_driver::class.java)
            startActivity(Intent)
        })
    }
}
