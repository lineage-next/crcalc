group = "com.hp"
version = "1.0"

plugins {
    `java`
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

sourceSets {
    getByName("main").java.srcDirs("src")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set(rootProject.name)
                url.set("https://github.com/lineage-next/crcalc")

                licenses {
                    license {
                        name.set("The Apache Software License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        name.set("The Android Open Source Project")
                        url.set("https://android.com")
                    }

                    developer {
                        name.set("Silicon Graphics, Inc.")
                        url.set("https://sgi.com")
                    }

                    developer {
                        name.set("Hewlett-Packard Company")
                        url.set("https://hp.com")
                    }
                }
            }
        }
    }
}
