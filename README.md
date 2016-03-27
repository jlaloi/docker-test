# Spring Boot Docker Test

mvn install docker:build
docker push tatane/docker-test

docker run -p 9090:9090 -t tatane/docker-test
