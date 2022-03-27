package com.stenleone.testcatchcloseappevent

import android.app.Service
import android.content.Intent
import android.widget.Toast

class SomeActionService : Service() {

    override fun onBind(p0: Intent?) = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "Destroyed", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

}