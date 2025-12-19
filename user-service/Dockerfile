FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar user-service.jar
EXPOSE 8080
CMD ["java", "-jar", "user-service.jar"]
