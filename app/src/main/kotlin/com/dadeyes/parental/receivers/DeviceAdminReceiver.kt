package com.dadeyes.parental.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.app.admin.DevicePolicyManager
import androidx.annotation.Keep

@Keep
class DeviceAdminReceiver : android.app.admin.DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        // Called when device admin is activated
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        // Called when device admin is deactivated
    }

    override fun onPasswordChanged(context: Context, intent: Intent) {
        super.onPasswordChanged(context, intent)
        // Called when password is changed
    }

    override fun onPasswordFailed(context: Context, intent: Intent) {
        super.onPasswordFailed(context, intent)
        // Called when password entry attempt fails
    }

    override fun onPasswordSucceeded(context: Context, intent: Intent) {
        super.onPasswordSucceeded(context, intent)
        // Called when password entry attempt succeeds
    }
}