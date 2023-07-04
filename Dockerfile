
from openjdk:latest
WORKDIR /app

copy target/mascotas-0.0.1-SNAPSHOT.jar mascotas.jar
EXPOSE 8080

entrypoint ["java","-jar","mascotas.jar"]
