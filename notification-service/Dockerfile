FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar notification-service.jar
EXPOSE 8080
CMD ["java", "-jar", "notification-service.jar"]
