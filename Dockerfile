FROM openjdk:21-jdk-alpine
VOLUME /tmp
COPY --from=build /app/target/grocery-booking-app.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]