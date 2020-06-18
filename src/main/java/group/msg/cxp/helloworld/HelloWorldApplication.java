package group.msg.cxp.helloworld;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@ApplicationPath("api")
public class HelloWorldApplication extends Application {

    private static final Logger logger = Logger.getLogger(HelloWorldApplication.class.getName());

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(HelloWorldResource.class);
        return classes;
    }
}
