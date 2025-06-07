plugins {
	java
	war
	id("org.springframework.boot") version "3.5.0"
	id("io.spring.dependency-management") version "1.1.7"
	
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.spring") version "1.9.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
    // Spring Boot starter
    implementation("org.springframework.boot:spring-boot-starter-web")
    
    // Thymeleaf
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

    // MyBatis Spring Boot Starter
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.4")

    // PostgreSQL JDBC Driver
    runtimeOnly("org.postgresql:postgresql")

    // Kotlin dependencies (if applicable)
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    
    //lombok
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    // Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    
    // webconfig
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    
    //batch
    implementation("org.springframework.boot:spring-boot-starter-batch")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
