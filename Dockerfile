FROM openjdk:8-alpine

WORKDIR /app

COPY ./api-backend-0.0.1.jar /app
COPY ./api-interface/api-interface-0.0.1-SNAPSHOT.jar /app
COPY ./api-gateway/api-gateway-0.0.1-SNAPSHOT.jar /app
CMD ["java","-jar","*.jar","--spring.profiles.active=prod"]
