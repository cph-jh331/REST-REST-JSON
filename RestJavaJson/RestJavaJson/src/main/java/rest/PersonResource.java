/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import generators.Generator;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("data")
public class PersonResource {

    private Generator gen;

    public PersonResource()
    {
        this.gen = new Generator();
    }

    @GET
    @Path("{amount}/{startId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getData(@PathParam("amount") int amount, @PathParam("startId") int startId)
    {
        String json = this.gen.generate(amount, startId);
        return Response.status(Response.Status.CREATED).entity(json).build();
    }

}
