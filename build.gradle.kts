import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "me.cristian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation ("org.assertj:assertj-core:3.24.2")
    testImplementation ("io.kotest:kotest-runner-junit5:5.5.5")
    testImplementation ("io.kotest:kotest-assertions-core:$version") // Assertions Library
    testImplementation ("io.kotest:kotest-property:5.5.5") // Property Test Framework
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

application {
    mainClass.set("MainKt")
}