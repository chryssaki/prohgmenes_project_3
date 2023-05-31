FROM adoptopenjdk/openjdk13-openj9:latest 
MAINTAINER ece.upatras.gr 
COPY deploy/rest.app-0.0.1-SNAPSHOT-exec.jar /opt/rest.app/ 
WORKDIR /opt/rest.app/
CMD ["java", "-jar", "/opt/rest.app/rest.app-0.0.1-SNAPSHOT-exec.jar"] 
EXPOSE 8888