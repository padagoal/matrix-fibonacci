FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG APP_NAME="matrix-spring-boot"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} SpringTestAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringTestAPI-0.0.1-SNAPSHOT.jar"]