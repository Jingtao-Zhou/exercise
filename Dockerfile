FROM openjdk:8u151-jdk-slim

RUN useradd campaign-admin
RUN mkdir -p /data/image
RUN chown campaign-admin:campaign-admin /data/image

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

EXPOSE 8888

CMD ["/app/run.sh"]