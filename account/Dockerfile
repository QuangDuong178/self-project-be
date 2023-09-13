#Start with a base image containing Java runtime
FROM openjdk:20 as build

#Information around who maintains the image
MAINTAINER quangdm

#Add the application's jar to the container
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/account-0.0.1-SNAPSHOT.jar"]
