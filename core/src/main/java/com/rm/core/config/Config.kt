package com.rm.core.config

import androidx.annotation.Nullable
import java.lang.reflect.Field

/**
 * Created by Rajiv Manivannan  on 11,October,2021
 * Website: https://rajivmanivannan.dev
 */
object Config {
  private const val BUILD_CONFIG = "com.rm.ama"
  val BASE_URL: String = getBuildConfigValue("BASE_URL") as String

  @Nullable
  private fun getBuildConfigValue(fieldName: String): Any? {
    return try {
      val c = Class.forName(BUILD_CONFIG)
      val f: Field = c.getDeclaredField(fieldName)
      f.isAccessible = true
      f.get(null)
    } catch (e: Exception) {
      e.printStackTrace()
      null
    }
  }
}

