package group.msg.cxp.helloworld;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.util.logging.Logger;

@Path("hello")
public class HelloWorldResource {
	
	private static final Logger logger = Logger.getLogger(HelloWorldResource.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInfos() {
		logger.info("ServerResource called");
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add("Hello", "World");
        return Response.ok(objectBuilder.build()).build();
    }
}
