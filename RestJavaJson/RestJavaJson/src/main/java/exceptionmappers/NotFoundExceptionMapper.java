package exceptionmappers;

import exceptions.ErrorMapper;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {    

    @Override
    public Response toResponse(NotFoundException exception)
    {
        ErrorMapper error = new ErrorMapper("The requested resource was not found on the server");
        return Response.status(404).entity(error.toString()).type(MediaType.APPLICATION_JSON).build();

    }

}
