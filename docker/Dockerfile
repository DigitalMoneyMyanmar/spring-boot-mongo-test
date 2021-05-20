FROM anapsix/alpine-java:8
RUN mkdir -p /opt/wave/config 
ADD ./app/*.jar /opt/wave/
ENTRYPOINT [ "sh", "-c", "java -jar /opt/wave/spring-boot-mongo-test.jar" ]
