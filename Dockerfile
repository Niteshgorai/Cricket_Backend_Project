# Use a base image with Java 17 installed
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/CricketInformer-0.0.1-SNAPSHOT.jar /app/

# Expose the port your application runs on
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "CricketInformer-0.0.1-SNAPSHOT.jar"]
