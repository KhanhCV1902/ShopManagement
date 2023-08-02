FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/ShopManagement-1.0.jar ShopManagement-1.0.jar
ENTRYPOINT ["java","-jar","/ShopManagement-1.0.jar"]