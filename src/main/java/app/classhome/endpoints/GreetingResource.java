package app.classhome.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/soma/{n1}/{n2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String soma(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        return "A soma é: " + (n1 + n2);
    }

}