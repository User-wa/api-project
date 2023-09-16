FROM openjdk:8-alpine
COPY ./api-interface-0.0.1-SNAPSHOT.jar /tmp/api-interface-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/tmp/api-interface-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]
