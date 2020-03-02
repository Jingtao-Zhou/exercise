FROM openjdk:8u151-jdk-slim

RUN useradd campaign-admin
RUN usermod -u 1000 campaign-admin
RUN usermod -G staff campaign-admin
USER campaign-admin

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

EXPOSE 8888

CMD ["/app/run.sh"]