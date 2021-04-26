FROM adoptopenjdk/openjdk11:alpine-jre
# Refer to Maven build -> all -jar files
ARG JAR_FILE=target/*.jar
# cp demo-0.0.1-SNAPSHOT.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar
# generate -jar package of module
RUN mvnw package -DskipTests
# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
