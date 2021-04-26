FROM openjdk:11-jdk-slim
ARG JAR_FILE=out/artifacts/my_consumer_jar/*.jar
# copy out/artifacts/my_consumer_jar/*.jar /usr/local/runme/app.jaR
COPY ${JAR_FILE} app.jar
# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]