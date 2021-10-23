plugins {
    kotlin("jvm") version "1.5.31"

    kotlin("plugin.spring") version "1.5.31"

    id("org.springframework.boot") version "2.5.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "io.github.bespaltovyj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("org.springdoc:springdoc-openapi-ui:1.5.12")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.5.12")

    implementation("ch.qos.logback:logback-core:1.2.6")
    implementation("ch.qos.logback:logback-classic:1.2.6")
    implementation("ch.qos.logback:logback-access:1.2.6")
    implementation("net.logstash.logback:logstash-logback-encoder:6.6")
}
