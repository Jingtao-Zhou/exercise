FROM openjdk:8u151-jdk-slim

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

USER 1001

EXPOSE 8888

CMD ["/app/run.sh"]