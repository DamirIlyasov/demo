FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JA VA_OPTS -Djava.security.egd=file:/dev/./uradondom -jar /app.jar" ]
