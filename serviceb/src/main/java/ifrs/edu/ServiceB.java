package ifrs.edu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/serviceb")
public class ServiceB {

    @GET
    @Path("/sum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int sum(@PathParam("a") int a, @PathParam("b") int b) {
        return a + b;
    }
    
}
