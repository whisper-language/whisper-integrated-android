增加本地maven仓库
```
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:4.0.0"

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
}
```
app 增加依赖

```
implementation 'net.crtrpt:whisper:1.0-SNAPSHOT'
```