FROM openjdk:8
EXPOSE 8088
ADD target/msProduct-0.0.1-SNAPSHOT.jar MSPRODUCT.jar
ENTRYPOINT ["java", "-jar" ,"/MSPRODUCT.jar"]
