FROM openjdk:11

EXPOSE 8080

RUN mkdir ./app

COPY ./funnyBucks1.0.jar ./app

CMD java -jar ./app/funnyBucks1.0.jar