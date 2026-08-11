# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# signingConfig buildTypes.release.signingConfig and
# buildTypes.debug.debuggable settings in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# Kotlin
-keep class kotlin.** { *; }
-keepclassmembers class kotlin.** {
    *;
}

# Room
-keep class * extends androidx.room.RoomDatabase
-keep @interface androidx.room.Entity
-keep @interface androidx.room.Dao

# Hilt
-keep class * extends dagger.hilt.android.lifecycle.HiltViewModel
-keep class dagger.hilt.** { *; }
-keepclasseswithmembers class * {
    @dagger.hilt.** <methods>;
}

# Coroutines
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# Serialization
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.SerializersKt
-keep,includedescriptorclasses class com.dadeyes.**$$serializer { *; }
-keepclassmembers class com.dadeyes.** {
    *** *SerializableCompanion.*;
}