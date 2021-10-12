package com.rm.ama.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Rajiv Manivannan  on 11,October,2021
 * Website: https://rajivmanivannan.dev
 */
@HiltAndroidApp
class MainApp : Application() {

  override fun onCreate() {
    super.onCreate()
    instance = this
  }

  companion object {
    var instance: MainApp? = null
  }
}