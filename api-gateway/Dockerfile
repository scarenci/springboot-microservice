FROM openjdk:17-alpine
ARG JAR_FILE=api-gateway/target/*.jar
COPY ${JAR_FILE} api-gateway.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api-gateway.jar"]