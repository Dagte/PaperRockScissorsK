import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.7.0"
    application
}
buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

dependencies {
    implementation("io.github.dagte:RPS-Common:1.0.1")
    implementation("io.github.dagte:RPS-Simulator:1.0.2")
}
//        implementation 'io.github.dagte:RPS-Common:1.0.0'
//        implementation 'io.github.dagte:RPS-Simulator:1.0.0'





repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}