package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_showmap_bus_driver.*
import kotlinx.android.synthetic.main.activity_show_map_mikrolet_driver.*

class list_showmap_bus_driver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_showmap_bus_driver)
     btn_kembali_showmap_bus.setOnClickListener({
         val Intent= Intent(this,list_bis_driver::class.java)
         startActivity(Intent)
     })
    }
}
