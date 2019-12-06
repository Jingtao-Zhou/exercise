FROM openjdk:8u151-jdk-slim

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

EXPOSE 8080

CMD ["/app/run.sh"]