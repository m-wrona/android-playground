package com.mwrona.playground

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
//        if (BuildConfig.DEBUG) Timber.plant(DebugTree())
    }

}