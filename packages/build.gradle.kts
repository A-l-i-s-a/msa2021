plugins {
    id("msa2021.java-library-conventions")
}

dependencies {
    implementation(project(":common"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.cloud:spring-cloud-gcp-starter-data-datastore")
}