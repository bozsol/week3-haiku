FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
COPY target/haiku-1.0-SNAPSHOT.jar /opt/app/haiku.jar
CMD ["java", "-jar", "/opt/app/haiku.jar"]
