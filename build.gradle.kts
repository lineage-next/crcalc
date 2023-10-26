plugins {
    `java`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

sourceSets {
    getByName("main").java.srcDirs("src")
}
