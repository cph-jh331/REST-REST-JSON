package exceptionmappers;

import exceptions.AmountIsNegativeException;
import exceptions.ErrorMapper;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AmountIsNegativeExceptionMapper implements ExceptionMapper<AmountIsNegativeException> {

    @Override
    public Response toResponse(AmountIsNegativeException exception)
    {
        ErrorMapper error = new ErrorMapper("Amount cannot be negative.");
        return Response.status(400).entity(error.toString()).type(MediaType.APPLICATION_JSON).build();
    }

}
