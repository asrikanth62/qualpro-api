FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/qualpro-api-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-XX:+UseContainerSupport","-jar","/app/app.jar"]