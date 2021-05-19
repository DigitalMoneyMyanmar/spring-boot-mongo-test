JVM Memory Config
----------------------
    java -Xms1024m -Xmx1024m -XX:NewRatio=3 -XX:SurvivorRatio=6 -Dspring.config.location=classpath:application-config.yaml,classpath:application-secret.yaml -jar wmt-spring-memcached-sys.jar 
    
Create Env Variable for memcached host
--------------------------------------------
    NODE_NAME=localhost
