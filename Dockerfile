FROM openjdk:17-alpine
WORKDIR /myapp
ADD target/my-docker-app-1.0-SNAPSHOT.jar ./my-docker-app-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","my-docker-app-1.0-SNAPSHOT.jar"]