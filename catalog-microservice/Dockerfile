FROM openjdk:17-alpine
ARG JAR_FILE=catalog-microservice/target/*.jar
COPY ${JAR_FILE} catalog-microservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/catalog-microservice.jar"]