package com.stenleone.testcatchcloseappevent

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

class SomeActionService : Service() {

    override fun onCreate() {
        super.onCreate()

        application.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
            override fun onActivityCreated(p0: Activity, p1: Bundle?) {

            }

            override fun onActivityStarted(p0: Activity) {

            }

            override fun onActivityResumed(p0: Activity) {

            }

            override fun onActivityPaused(p0: Activity) {

            }

            override fun onActivityStopped(p0: Activity) {

            }

            override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {

            }

            override fun onActivityDestroyed(p0: Activity) {
                Toast.makeText(applicationContext, "Destroyed", Toast.LENGTH_SHORT).show()
                stopSelf()
            }

        })
    }

    override fun onBind(p0: Intent?) = null

}