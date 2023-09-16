FROM openjdk:8-alpine
COPY ./api-backend-0.0.1.jar /tmp/api-backend-0.0.1.jar
CMD ["java","-jar","/tmp/api-backend-0.0.1.jar","--spring.profiles.active=prod"]
