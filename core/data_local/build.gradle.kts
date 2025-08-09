plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

apply(from = "${rootProject.projectDir}/android-common.gradle")

android {
    namespace = "com.example.core.data_local"
}
dependencies {
    implementation(project(":core:domain"))

    implementation(libs.android.room)
    implementation(libs.android.roomKtx)
    ksp(libs.android.room.compiler)
}