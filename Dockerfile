FROM eclipse-temurin:17-jdk-alpine

LABEL authors="Ibrahim"

WORKDIR /app

COPY target/produit.jar ./produit.jar

EXPOSE 8081

CMD ["java", "-jar", "produit.jar"]