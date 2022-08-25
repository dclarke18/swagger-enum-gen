## Minimal example of micronaut swagger generation ignoring @JsonValue

**Expected behaviour**

Generated `build/classes/java/main/META-INF/swagger/hello-world-0.0.yml` file should contain:
```
schemas:
ResponseEnum:
type: string
enum:
- JsonProperty Greetings
- JsonValue hallo!
- JsonValue hi!
- JsonValue Guten tag
```

**Actual Behaviour**

Generated `build/classes/java/main/META-INF/swagger/hello-world-0.0.yml` file contains:
```
schemas:
ResponseEnum:
type: string
enum:
- GREETINGS
- HELLO
- HI
- GUTEN_TAG
```

**Steps to recreate**

Run `./gradlew clean build` and examine `build/classes/java/main/META-INF/swagger/hello-world-0.0.yml`

## Micronaut 3.6.1 Documentation

- [User Guide](https://docs.micronaut.io/3.6.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.6.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.6.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

---

- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


