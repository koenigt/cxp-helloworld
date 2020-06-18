# Use base wildfly images preconfigured for sqms projects
FROM jboss/wildfly:19.1.0.Final

# Copy the application war file to wildfly 
ADD target/*.war /opt/jboss/wildfly/standalone/deployments/

#Create a default management/admin user
RUN $JBOSS_HOME/bin/add-user.sh admin admin --silent --role PowerUser

EXPOSE 8080
EXPOSE 9990

# Build this image locally:
# docker build --tag=jboss/wildfly-cxp . 

# Run this image locally: 
# docker run -p 8080:8080 -p 9990:9990 -it --name cxp-helloworld --env-file ./src/main/docker/env-minikube.properties jboss/wildfly-cxp
# docker run -p 8080:8080 -p 9990:9990 -it --rm --name cxp-helloworld jboss/wildfly-cxp /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0
# docker run -it --name cxp-helloworld jboss/wildfly-cxp

