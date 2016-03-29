# Spring Boot Docker Test

### BUILD and PUSH

mvn package docker:build

docker push tatane/docker-test

### RUN

~~docker run -p 9090:9090 -t tatane/docker-test~~

cd src/main/docker

docker-compose up / docker-compose stop
