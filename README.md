## Run with Docker Compose

##### 1. Create a jar image

- ` $ ./gradlew task bootjar `

##### 2. Build and Run containers

- ` $ docker-compose build `
- ` $ docker-compose up `

## Run without Docker Compose (Development - Intellij)

##### 1. Create the DB

- `$ docker container run -d -p "33006:3306" -e MYSQL_USER=root -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=barcamp --mount type=volume,src=data,target=/var/lib/mysql --name mysql-db mysql:5.7.26`

##### 2. Run this project on Intellij using gradle


## Docs
http://localhost:8080/  ( Encuesta )

http://localhost:8080/admin  ( Informacion sobre las respuestas - SOLO ADMINS )
