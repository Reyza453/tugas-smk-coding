package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_bis_driver.*

class list_bis_driver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_bis_driver)

        btn_img_info1.setOnClickListener({
            val Intent1=Intent(this,list_showmap_bus_driver::class.java)
            startActivity(Intent1)
        })
        btn_img_info2.setOnClickListener({
            val Intent2=Intent(this,list_showmap_bus_driver::class.java)
            startActivity(Intent2)
        })
        btn_img_info3.setOnClickListener({
            val Intent3=Intent(this,list_showmap_bus_driver::class.java)
            startActivity(Intent3)
        })
        btn_img_info4.setOnClickListener({
            val Intent4=Intent(this,list_showmap_bus_driver::class.java)
            startActivity(Intent4)
        })
        btn_img_kembali_bus.setOnClickListener({
            val Intent5=Intent(this,driver::class.java)
            startActivity(Intent5)
        })
    }
}
