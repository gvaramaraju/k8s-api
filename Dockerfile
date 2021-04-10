FROM adoptopenjdk:11
MAINTAINER ramaraju.gva@gmail.com
COPY target/k8s-api.jar .
ENTRYPOINT ["java", "-jar", "k8s-api.jar"]
