FROM openjdk:8-jdk-alpine

ENV NOMBRE_APP = 'barcamp'
# forma estandar para cambiar la configuracion
ENV spring.datasource.url='jdbc:mysql://mysql-db:3306/barcamp'
ENV spring.datasource.username='root'
ENV spring.datasource.password='123456'

VOLUME /tmp

EXPOSE 8080

COPY /build/libs/docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

# docker build . -t barcamp-image
# docker run -d -p 8080:8080 --name barcamp barcamp-image