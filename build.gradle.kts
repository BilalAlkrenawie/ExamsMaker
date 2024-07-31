buildscript {
    dependencies {
        classpath ("com.android.tools.build:gradle:8.0.0")
        classpath ("com.google.gms:google-services:4.4.2")
    }
}
plugins {
    id("com.android.application") version "8.0.0" apply false
    id("com.android.library") version "8.0.0" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}