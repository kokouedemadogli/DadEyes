package com.dadeyes.parental

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DadEyesApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}