package com.dadeyes.parental.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class LockingService : Service() {
    companion object {
        private const val TAG = "LockingService"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "LockingService started")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
