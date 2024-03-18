# Prepare

```shell
brew install mvn # using to build stray-jar
```

## Build stray jar

```shell
mvn -f stray-jar/pom.xml package
cp stray-jar/target/stray-jar-1.0-SNAPSHOT.jar lib/stray-jar.jar
```

# Run

```shell
sbt run          # success (why...?)
sbt root2_11/run # compile error: com.example.Lib in stray-jar.jar not found.
sbt ss3/run      # compile error: com.example.Lib in stray-jar.jar not found.
```
