FROM amazoncorretto:17-alpine-jdk

COPY target/microservice-gateway-0.0.1-SNAPSHOT.jar gateway.jar

ENTRYPOINT ["java", "-jar", "gateway.jar"]