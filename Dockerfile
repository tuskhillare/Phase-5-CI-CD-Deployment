FROM openjdk:8
EXPOSE 8087
ADD target/CICDDeploymennt-0.0.1-SNAPSHOT.war CICDDeploymennt-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/CICDDeploymennt-0.0.1-SNAPSHOT.war"]