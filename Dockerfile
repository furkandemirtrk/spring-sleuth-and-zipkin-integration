# Base image
FROM openjdk:14-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file and its dependencies
COPY target/myapp.jar /app
COPY target/lib /app/lib

# Set entrypoint
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]