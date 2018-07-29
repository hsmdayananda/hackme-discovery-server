from java:8
expose 8080
add /target/polixia-discovery-0.0.1-SNAPSHOT.jar /opt/polixia-discovery-0.0.1-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","polixia-discovery-0.0.1-SNAPSHOT.jar"]
