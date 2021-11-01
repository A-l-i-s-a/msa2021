plugins {
    id("msa2021.java-library-conventions")
}
version = "0.0.1-SNAPSHOT"


dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation(project(":clients"))

    implementation("com.google.cloud:spring-cloud-gcp-starter-data-datastore")
    implementation("com.google.cloud:spring-cloud-gcp-starter-pubsub")
    implementation("org.springdoc:springdoc-openapi-webflux-ui")
    implementation("org.springframework:spring-webflux")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}

tasks.withType<Test> {
    useJUnitPlatform()
}