FROM openjdk:8-alpine

COPY target/uberjar/mental-health-app.jar /mental-health-app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/mental-health-app/app.jar"]
