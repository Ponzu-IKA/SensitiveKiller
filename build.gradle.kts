plugins {
    kotlin("jvm") version "1.9.23"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "ponzu_ika.sensitive_killer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    uri("https://www.atilika.org/nexus/content/repositories/atilika")
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("com.atilika.kuromoji", "kuromoji-ipadic", "0.9.0")
    implementation("net.dv8tion","JDA","5.0.0-beta.24")
    implementation("org.jsoup","jsoup","1.17.2")
    implementation("com.ibm.icu","icu4j","75.1")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("ponzu_ika.sensitive_killer.MainKt")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(16)
}
