# getting-started Project
This Project:
[![Quality Gate Status](https://ee8-megan-us.ngrok.io/api/project_badges/measure?project=org.acme%3Agetting-started&metric=alert_status&token=90571bae843362c7c377b10529cf3c045feb2e0a)](https://ee8-megan-us.ngrok.io/dashboard?id=org.acme%3Agetting-started)

Badge for jHipsterTest Project Called Myapplication
[![Vulnerabilities](https://ee8-megan-us.ngrok.io/api/project_badges/measure?project=jHipsterTest&metric=vulnerabilities&token=f6f3d015a17efca1e12c3782d3a9e1d322d979ce)](https://ee8-megan-us.ngrok.io/dashboard?id=jHipsterTest)

Badge for Private project: 
[![Quality Gate Status](https://ee8-megan-us.ngrok.io/api/project_badges/measure?project=172856_scanner_basic&metric=alert_status&token=0213ceba5a6aa6e5dc6bda50e2026c90dac5b956)](https://ee8-megan-us.ngrok.io/dashboard?id=172856_scanner_basic)

[![Quality Gate Status](https://sonar.tools.sap/api/project_badges/measure?project=com.sap.columbus.las&metric=alert_status)](https://sonar.tools.sap/dashboard?id=com.sap.columbus.las)

localhost 8.9.1 : [![Quality Gate Status](http://localhost:9000/api/project_badges/measure?project=org.acme%3Agetting-started&metric=alert_status)](http://localhost:9000/dashboard?id=org.acme%3Agetting-started)

localhost 8.9 with ngrok : [![Quality Gate Status](https://ee89-megan-us.ngrok.io/api/project_badges/measure?project=mavenjenk&metric=alert_status)](https://ee89-megan-us.ngrok.io/dashboard?id=mavenjenk) 

Token 0594dc5ae377d7675ef4e01c2d4b7a63e4c19371

"id=org.acme%3Agetting-started&amp;"

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/getting-started-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
