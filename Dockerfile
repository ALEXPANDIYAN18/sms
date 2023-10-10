FROM maven:3.8.5-openidk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/Sms2-0.0.1-SNAPSHOT.jar Sms2.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Sms2.jar"]