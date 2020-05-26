FROM openjdk:8-jdk-alpine

RUN apk update
RUN apk add maven
RUN apk add wget
RUN mkdir build
WORKDIR build


# add the src
COPY pom.xml pom.xml
COPY src/ src

# maven is sensitive to man in the middle attacks
RUN mvn install -DskipTests

RUN chgrp -R 0 /build && chmod -R g=u /build
RUN  chmod -R a+rw /build

#RUN  chmod -R a+rw /.javacpp
USER 10000
EXPOSE 8080

CMD java -jar ./minstarter-*.jar