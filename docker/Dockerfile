FROM anapsix/alpine-java:8
RUN mkdir -p /opt/wave/config 
ADD ./app/*.jar /opt/wave/
ENTRYPOINT [ "sh", "-c", "java -Xms${MAX_JVM_MEMORY}m -Xmx${MIN_JVM_MEMORY}m -Dspring.config.location=classpath:application.yaml,file:///opt/wave/config/application-config-override.yaml, -jar /opt/wave/spring-boot-mongo-test.jar" ]
