FROM gradle:8.10.1-jdk21-alpine as builder
WORKDIR /home/gradle
COPY  . /home/gradle

RUN gradle clean bootJar

FROM eclipse-temurin:23-jdk as runtime

WORKDIR /app

COPY --from=builder /app/application.jar application.jar
EXPOSE 8181

ENTRYPOINT java -jar "application.jar" \
            -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE \