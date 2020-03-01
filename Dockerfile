FROM openjdk:8u151-jdk-slim

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

RUN useradd --create-home --no-log-init --shell /bin/bash campaign-admin
USER campaign-admin

EXPOSE 8888

CMD ["/app/run.sh"]