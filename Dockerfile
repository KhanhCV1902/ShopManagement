FROM openjdk:17-jdk-alpine
COPY target/ShopManagement-1.0.jar ShopManagement-1.0.jar
ENTRYPOINT ["java","-jar","/ShopManagement-1.0.jar"]