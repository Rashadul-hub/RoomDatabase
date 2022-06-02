# RoomDatabase
RoomDatabase Demo


#
plugins {

    id 'kotlin-kapt'

}
#
#
 Gradle

Add dependencies (you can also add other modules that you need):

dependencies {


 // for room database
    
    def roomVersion = "2.4.2"
    implementation("androidx.room:room-runtime:$roomVersion")
    annotationProcessor("androidx.room:room-compiler:$roomVersion")

    kapt("androidx.room:room-compiler:$roomVersion")

 // kotlin Extensions and Coroutines support for Room
    
    implementation("androidx.room:room-ktx:$roomVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    
    
 // Add kotlinx-coroutines-android module as a dependency when using kotlinx.coroutines on Android:
    
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.2")

}

And make sure that you use the latest Kotlin version:
#


