# JDK 17 as image base
FROM openjdk:17-jdk-alpine

RUN apk add --no-cache curl


# Maintainer Info
LABEL maintainer="cesarevc"

# Establish the workdirectory inside the container
WORKDIR /app

# 8080 is the port where Spring Boot app will stay running
EXPOSE 8080

# Add the application's jar to the container
COPY target/cinerank-1.1.1-SNAPSHOT.jar /app/cinerank-1.1.1-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/cinerank-1.1.1-SNAPSHOT.jar"]