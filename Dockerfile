FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/SpringProject-1.0.jar SpringProject-1.0.jar
ENTRYPOINT ["java","-jar","/SpringProject-1.0.jar"]