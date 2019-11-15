package com.example.tugassmkcodng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_bis_driver.*
import kotlinx.android.synthetic.main.activity_list_bis_driver.btn_img_info1
import kotlinx.android.synthetic.main.activity_list_bis_driver.btn_img_info2
import kotlinx.android.synthetic.main.activity_list_bis_driver.btn_img_info3
import kotlinx.android.synthetic.main.activity_list_bis_driver.btn_img_info4
import kotlinx.android.synthetic.main.activity_list_mikrolet_driver.*

class list_mikrolet_driver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_mikrolet_driver)
        btn_img_info1.setOnClickListener({
            val Intent1= Intent(this,show_map_mikrolet_driver::class.java)
            startActivity(Intent1)
        })
        btn_img_info2.setOnClickListener({
            val Intent2=Intent(this,show_map_mikrolet_driver::class.java)
            startActivity(Intent2)
        })
        btn_img_info3.setOnClickListener({
            val Intent3=Intent(this,show_map_mikrolet_driver::class.java)
            startActivity(Intent3)
        })
        btn_img_info4.setOnClickListener({
            val Intent4=Intent(this,show_map_mikrolet_driver::class.java)
            startActivity(Intent4)
        })
        btn_img_kembali.setOnClickListener({
            val Intent5=Intent(this,driver::class.java)
            startActivity(Intent5)
        })
    }
}
