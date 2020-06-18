# cxp-helloworld

## Build this image locally:
docker build --tag=jboss/wildfly-cxp . 

## Run this image locally with AdminConsole: 
docker run -p 8080:8080 -p 9990:9990 -it --rm --name cxp-helloworld jboss/wildfly-cxp /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0

## Call the Rest Service or AdminConsole locally:
http://localhost:8080/api/hello
http://localhost:9990/
http://localhost:9990/health
http://localhost:9990/metrics


