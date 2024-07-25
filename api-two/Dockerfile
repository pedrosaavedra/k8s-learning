FROM maven:3.9.8-amazoncorretto-17-debian as builder
COPY src src
COPY pom.xml pom.xml
RUN mvn package -DskipTests
RUN java -Djarmode=layertools -jar target/*.jar extract

FROM openjdk:17-jdk-alpine
COPY --from=builder dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]