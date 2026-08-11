package com.dadeyes.parental.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.dadeyes.parental.R

class UsageStatsService : Service() {
    companion object {
        private const val TAG = "UsageStatsService"
        private const val NOTIFICATION_ID = 1
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "UsageStatsService started")
        startForeground(NOTIFICATION_ID, createNotification())
        return START_STICKY
    }

    private fun createNotification(): NotificationCompat.Notification {
        return NotificationCompat.Builder(this, "monitoring_channel")
            .setContentTitle("DadEyes")
            .setContentText("Monitoring your child's device...")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
