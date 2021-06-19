# Java streams vs Vavr

[Vavr](https://www.vavr.io/) is a functional library for Java. It provides immutable data structures and functions to use them.

This repository provides a [minimal example](./src/main/java/hercerm/example/streamsvsvavr/App.java) of Java streams vs Vavr for a list manipulation.

## Run the example

Use your Gradle installation, or a provided wrapper; e.g., in macOS use:

```
./gradlew run
```

Expected output:

```txt
Using Java 8+ streams
Martha
Julio
Dana

Using Vavr
Martha
Julio
Dana
```