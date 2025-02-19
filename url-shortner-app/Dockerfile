# Use a Maven image with Java 17 to build the Spring Boot app
FROM eclipse-temurin:17-jdk AS build

# Set the working directory
WORKDIR /app

# Copy Maven Wrapper files
COPY mvnw mvnw.cmd ./
COPY .mvn .mvn

# Give execution permissions to Maven Wrapper
RUN chmod +x mvnw

# Copy pom.xml and install dependencies
COPY pom.xml ./
RUN ./mvnw dependency:go-offline

# Copy source code and build the application
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Use a Java 17 runtime image to run the application
FROM eclipse-temurin:17-jre

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Command to run the application
CMD ["java", "-jar", "app.jar"]

