# Springboot w/ Kotlin

## Run

````
mvn clean install
mvn spring-boot:run

curl -iS localhost:8080/hello
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 11
Date: Sat, 23 Jun 2018 21:16:55 GMT

hello world
````

## Run with Docker

````
mvn clean install -Pdocker
...
[INFO] Building tar: D:\workspaces\playground\kotlin-ws\target\docker\playground\kotlin-ws\0.1.0-SNAPSHOT\tmp\docker-build.tar
[INFO] DOCKER> [playground/kotlin-ws:0.1.0-SNAPSHOT]: Created docker-build.tar in 238 milliseconds
[INFO] DOCKER> Step 1/2 : FROM fabric8/java-jboss-openjdk8-jdk:latest
[INFO] DOCKER>
[INFO] DOCKER> ---> d267af27f713
[INFO] DOCKER> Step 2/2 : COPY kotlin-ws-0.1.0-SNAPSHOT-sb.jar /deployments/
[INFO] DOCKER>
[INFO] DOCKER> ---> 31d0ed219dd1
[INFO] DOCKER> Successfully built 31d0ed219dd1
[INFO] DOCKER> Successfully tagged playground/kotlin-ws:0.1.0-SNAPSHOT
[INFO] DOCKER> [playground/kotlin-ws:0.1.0-SNAPSHOT]: Built image sha256:31d0e
[INFO] DOCKER> [playground/kotlin-ws:0.1.0-SNAPSHOT]: Tag with latest,0.1.0-SNAPSHOT
...

# now run a container of this image
docker run --rm -it -p 8080:8080 playground/kotlin-ws:latest
...
2018-07-10 21:55:13.481  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2018-07-10 21:55:13.494  INFO 1 --- [           main] com.playground.examples.ApplicationKt    : Started ApplicationKt in 4.547 seconds (JVM running for 5.32)

# test
$ curl -iS localhost:8080/hello
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 12
Date: Tue, 10 Jul 2018 21:56:02 GMT

hello world!
````

## Reference documentation

* Using instructions in https://github.com/fabric8io-images/run-java-sh
