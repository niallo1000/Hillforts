package org.wit.hillforts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.hillforts.R


class HillfortActivity : AppCompatActivity(), AnkoLogger {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hillfort)
    info("Hillfort Activity started..")

    btnAdd.setOnClickListener() {
        val hillfortsTitle = hillfortsTitle.text.toString()
        if (hillfortsTitle.isNotEmpty()) {
            info("add Button Pressed: $hillfortsTitle")
        }
        else {
            toast ("Please Enter a title")
        }
    }
}
}
