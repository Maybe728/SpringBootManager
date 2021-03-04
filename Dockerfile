FROM java:8
VOLUME /tmp
COPY target/cm.jar cm.jar
RUN bash -c "touch /cm.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","cm.jar"]
