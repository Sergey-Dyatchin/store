FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar product-service.jar
EXPOSE 8080
CMD ["java", "-jar", "product-service.jar"]
