package ifrs.edu;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/servicea")
public class ServiceA {

    @Inject
    @RestClient

    ServiceB service;

    @GET
    @Path("/sum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int sum(@PathParam("a") int a, @PathParam("b") int b){
        return service.sum(a, b);
    }
}
