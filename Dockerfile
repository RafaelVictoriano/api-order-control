FROM openjdk:19-oracle
ADD target/api-order-control-*.jar app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app"]