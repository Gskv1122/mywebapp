FROM eclipse-temurin:17
COPY target/MyWebApp.jar mywebapp.jar
CMD ["java","-jar","mywebapp.jar"]