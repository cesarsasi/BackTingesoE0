FROM openjdk:11
ADD target/demoitcero.jar demoitcero.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demoitcero.jar"]