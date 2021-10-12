plugins {
  `kotlin-dsl`
  `java-gradle-plugin`
}

repositories {
  google()
  mavenCentral()
  maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
}

gradlePlugin {
  plugins {
    create("BuildManager") {
      id = "dependencies"
      implementationClass = "BuildManager"
      version = "1.0.0"
    }
  }
}
