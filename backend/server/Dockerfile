FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src ./src

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

RUN mv target/*.jar app.jar

CMD ["java", "-jar", "target/app.jar"]
