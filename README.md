# cxp-helloworld

## Build this image locally:
docker build --tag=jboss/wildfly-cxp . 

## Run this image locally with AdminConsole: 
docker run -p 8080:8080 -p 9990:9990 -it --rm --name cxp-helloworld jboss/wildfly-cxp /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0

## Run this image locally: 
docker run -p 8080:8080 -p 9990:9990 -it --rm --name cxp-helloworld jboss/wildfly-cxp

## Call the Rest Service or AdminConsole locally:
- http://localhost:8080/api/hello
- http://localhost:9990/
- http://localhost:9990/health
- http://localhost:9990/metrics

## Docker infos
docker push docker.at41tools.k8s.aws.msgoat.eu/cxp/wildfly-helloworld:1.0.0-koenigt
REPOSITORY                            TAG                 IMAGE ID            CREATED             SIZE
jboss/wildfly-cxp                     latest              0387e7177b6a        11 hours ago        762MB


