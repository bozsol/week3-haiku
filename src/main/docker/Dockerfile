FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
ADD maven/${project.artifactId}-${project.version}.jar /opt/app/haiku.jar
CMD ["java", "-jar", "/opt/app/haiku.jar"]
