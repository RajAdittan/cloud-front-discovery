FROM redhat-openjdk-18/openjdk18-openshift
MAINTAINER rajamohane@gmail.com

RUN mkdir -p /opt/cloud-front-discovery/bin
COPY ./target/cloud-front-discovery*.jar /opt/cloud-front-discovery/bin

EXPOSE 1976

WORKDIR /opt/cloud-front-discovery/bin

ENTRYPOINT ["java", "-jar", "cloud-front-discovery*.jar"]
