FROM openjdk:8u151-jdk-slim

COPY ./build/libs/*.jar /app/
COPY ./run.sh /app/

RUN useradd new-admin
USER new-admin
#RUN mkdir /home/new-admin/images

EXPOSE 8888

CMD ["/app/run.sh"]