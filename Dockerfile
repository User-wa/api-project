FROM openjdk:8-alpine

WORKDIR /app

COPY ./api-backend-0.0.1.jar /app
CMD ["java","-jar","api-backend-0.0.1.jar","--spring.profiles.active=prod"]
