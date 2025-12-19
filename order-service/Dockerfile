FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar order-service.jar
EXPOSE 8080
CMD ["java", "-jar", "order-service.jar"]
