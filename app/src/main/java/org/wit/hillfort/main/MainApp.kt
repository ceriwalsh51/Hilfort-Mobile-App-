package org.wit.hillfort.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.hillfort.models.HillfortMemStore
import org.wit.hillfort.models.HillfortModel

class MainApp : Application(), AnkoLogger {

    var hillforts = HillfortMemStore()

    override fun onCreate() {
        super.onCreate()
        info("Hillfort started")
    }
}