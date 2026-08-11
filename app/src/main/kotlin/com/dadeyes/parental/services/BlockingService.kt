package com.dadeyes.parental.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class BlockingService : Service() {
    companion object {
        private const val TAG = "BlockingService"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "BlockingService started")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
