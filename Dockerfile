FROM maven:3.8.4-openjdk-11-slim as build
WORKDIR usr/src/app
COPY src ./
COPY pom.xml ./
#RUN  mvn -f /app/pom.xml clean package -DskipTests
RUN  mvn clean package -DskipTests

FROM openjdk:11-jre-slim
WORKDIR /usr/src/app
#COPY /app/target/microservice2-0.0.1-SNAPSHOT.jar /microservice2.jar
COPY --from=build /usr/src/app/target/microservices2-0.0.1-SNAPSHOT.jar ./microservices2.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","./microservices2.jar"]