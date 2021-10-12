object Dependencies {

  //Gradle Build Tool
  const val buildToolGradle = "com.android.tools.build:gradle:${Versions.buildToolGradleVersion}"

  //Gradle Plugins
  const val hiltAndroidGradlePlugin =
    "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
  const val kotlinGradlePlugin =
    "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
  const val navigationGradlePlugin =
    "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"

  const val kotlinCore = "androidx.core:core-ktx:${Versions.kotlinCoreVersion}"
  const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"

  const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
  const val constraintLayout =
    "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
  const val material = "com.google.android.material:material:${Versions.materialVersion}"
  const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
  const val cardView = "androidx.cardview:cardview:${Versions.cardViewVersion}"

  // Hilt Dependency Injection
  const val hiltCore = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
  const val hiltDaggerAndroidCompiler =
    "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
  const val hiltCommon = "androidx.hilt:hilt-common:${Versions.hiltCommonVersion}"
  const val hiltViewModelLifecycle =
    "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltLifecycleViewModel}"
  const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"

  // Navigation component
  const val navComponentFragment =
    "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
  const val navComponentUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

  // OkHttp
  const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
  const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"

  // Retrofit
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"

  // Gson
  const val gson = "com.google.code.gson:gson:${Versions.gson}"
  const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.convertorGson}"

  // Lifecycle
  const val lifecycleViewModelKtx =
    "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
  const val lifecycleLiveDataKtx =
    "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
  const val lifecycleCommon =
    "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
  const val lifecycleExtension =
    "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"

  //Unit Test
  const val jUnit = "junit:junit:${Versions.jUnitVersion}"
  const val jUnitExt = "androidx.test.ext:junit:${Versions.jUnitExtVersion}"
  const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"

}

object Versions {
  const val compileSdkVersion = 30
  const val buildToolsVersion = "30.0.3"
  const val minSdkVersion = 21
  const val targetSdkVersion = 30

  const val buildToolGradleVersion = "7.0.3"
  const val kotlinVersion = "1.5.31"
  const val hiltVersion = "2.38.1"
  const val hiltCommonVersion = "1.0.0"
  const val hiltLifecycleViewModel = "1.0.0-alpha03"
  const val hiltCompiler = "1.0.0-alpha02"
  const val navigationVersion = "2.3.5"

  const val kotlinCoreVersion = "1.3.2"
  const val appCompatVersion = "1.2.0"
  const val materialVersion = "1.4.0"
  const val constraintLayoutVersion = "2.0.4"
  const val recyclerViewVersion = "1.1.0"
  const val cardViewVersion = "1.0.0"

  const val okHttpVersion = "4.9.0"
  const val retrofit = "2.9.0"
  const val gson = "2.8.8"
  const val convertorGson = "2.8.1"
  const val lifecycleVersion = "2.2.0"

  const val jUnitVersion = "4.13.2"
  const val jUnitExtVersion = "1.1.3"
  const val espressoVersion = "3.4.0"
}

object AppDetail {
  const val applicationId = "com.rm.ama"
  const val appName = "Android Module Architecture"
  const val versionCode = 1
  const val versionName = "1.0.0"
}