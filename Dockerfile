FROM openjdk:8u151-jdk-slim

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

RUN useradd campaign-admin
RUN usermod -G staff campaign-admin
USER campaign-admin

EXPOSE 8888

CMD ["/app/run.sh"]