FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar auth-service.jar
EXPOSE 8080
CMD ["java", "-jar", "auth-service.jar"]
