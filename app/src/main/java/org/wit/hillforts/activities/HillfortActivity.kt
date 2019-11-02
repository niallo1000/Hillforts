package org.wit.hillforts.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.hillfort.models.HillfortModel
import org.wit.hillforts.R



class HillfortActivity : AppCompatActivity(), AnkoLogger {

    //var hillfort = HillfortModel()

    var hillfort = HillfortModel()
    val hillforts = ArrayList<HillfortModel>()

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hillfort)


    btnAdd.setOnClickListener() {
        hillfort.title = hillfortTitle.text.toString()
        hillfort.description = description.text.toString()
        hillfort.location = location.text.toString()
        visited.setOnClickListener() {
            hillfort.visited = true
        }
        if (hillfort.title.isNotEmpty()) {
            hillforts.add(hillfort.copy())

            info("add Button Pressed: ${hillfort}")
            for (i in hillforts.indices) {
                info("Hillfort[$i]:${this.hillforts[i]}")
            }
        } else {
            toast("Please Enter a title")
        }
    }
}

}
