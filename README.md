
$ Clone the project
$ cd spot-bugs-docker
$ ./mvnw package 
$  docker build -f Dockerfile -t spring-boot-docker .
$  docker run -p 8080:8080 spring-boot-docker
$ Check url in browser: http://localhost:8080/api/v1/msg
