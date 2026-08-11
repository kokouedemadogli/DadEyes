package com.dadeyes.parental.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.annotation.Keep

@Keep
class NotificationService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        // Initialize notification system
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Handle notifications to parent/child
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        // Clean up notification service
    }
}