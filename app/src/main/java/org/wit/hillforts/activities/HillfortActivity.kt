package org.wit.hillforts.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.hillforts.R
import org.wit.hillforts.models.HillfortsModel


class HillfortActivity : AppCompatActivity(), AnkoLogger {

    var hillforts = HillfortsModel()

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hillfort)


    btnAdd.setOnClickListener() {
        hillforts.title = hillfortsTitle.text.toString()
        if (hillforts.title.isNotEmpty()) {
            info("add Button Pressed: $hillforts")
        }
        else {
            toast ("Please Enter a title")
        }
    }
}
}
