FROM openjdk:17-alpine
ARG JAR_FILE=configuration-server/target/*.jar
COPY ${JAR_FILE} configuration-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/configuration-server.jar"]