package exceptionmappers;

import exceptions.ErrorMapper;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception)
    {
        ErrorMapper error = new ErrorMapper("Server says no. Not sure why, but it says no.");
        return Response.status(500).entity(error).type(MediaType.APPLICATION_JSON).build();
    }

}
