FROM openjdk:latest
COPY target/*.jar springboot_awsfargate.jar
#FOR AWS
ENTRYPOINT  ["java","-jar","/springboot_awsfargate.jar"]
EXPOSE 8080