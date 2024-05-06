FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/second-tech-challenge-1.0.0.jar second-tech-challenge-1.0.0.jar
EXPOSE 9080
CMD ["java", "-jar", "second-tech-challenge-1.0.0.jar"]