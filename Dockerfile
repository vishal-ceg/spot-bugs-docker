FROM openjdk:11
ADD target/*.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]