FROM amazoncorretto:17-alpine-jdk

COPY target/microservice-eureka-0.0.1-SNAPSHOT.jar eureka.jar

ENTRYPOINT ["java", "-jar", "eureka.jar"]