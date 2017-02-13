# `ex-paninij-gradle-eclipse-setup`

Integration between Gradle and Eclipse is enabled using three tools:

-  Buildship, an Eclipse plugin for Gradle integration (comparable to m2e).
-  The standard `eclipse` Gradle plugin.
-  [`net.ltgt.apt`](https://github.com/tbroyer/gradle-apt-plugin), a Gradle
   plugin to help manage annotation processors within a Gradle project.

For this configuration, we follow the setup recommended by the `net.ltgt.apt`
README. From this directory, run

```
$ ./gradlew eclipseJdtApt
$ ./gradlew eclipseFactorypath
$ ./gradlew eclipseJdt
```

and then use the Eclipse import dialogue to import this project as a "Gradle
project".
