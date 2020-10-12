# firstSpringBootApp
1. For externalized configuration put application.yaml file into any directory on your computer.
```json
server:
    port: 8083.0
application:
    name: Spring Boot
```
2. Use ```spring.config.location``` environment property as an OS environment variable, a system property, or a command-line argument to specify config file location, e.g.:
```spring.config.location = file:\path\to\my\config\application.yaml ```
