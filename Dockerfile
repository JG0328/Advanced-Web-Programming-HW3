FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8080

COPY /build/libs/docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

# docker build . -t barcamp-image
# docker run -d -p 8080:8080 --name barcamp-image barcamp