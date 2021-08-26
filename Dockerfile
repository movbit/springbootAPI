FROM openjdk:11.0.12-jre-slim
ADD build/libs/prueba-0.0.1-SNAPSHOT.jar /usr/share/app.jar
# EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]
