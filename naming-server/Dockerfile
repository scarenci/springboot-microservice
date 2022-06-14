FROM openjdk:17-alpine
ARG JAR_FILE=naming-server/target/*.jar
COPY ${JAR_FILE} naming-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/naming-server.jar"]