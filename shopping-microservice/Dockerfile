FROM openjdk:17-alpine
ARG JAR_FILE=shopping-microservice/target/*.jar
COPY ${JAR_FILE} shopping-microservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/shopping-microservice.jar"]