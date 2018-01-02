package exceptionmappers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import exceptions.AmountIsNegativeException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class AmountIsNegativeExceptionMapper implements ExceptionMapper<AmountIsNegativeException> {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public Response toResponse(AmountIsNegativeException exception)
    {
        JsonObject error = new JsonObject();
        JsonObject errorDetail = new JsonObject();
        int statusCode = 400;
        errorDetail.addProperty("code", statusCode);
        errorDetail.addProperty("message", "the Amount cannot be negative");
        error.add("error", errorDetail);
        return Response.status(400).entity(gson.toJson(error)).type(MediaType.APPLICATION_JSON).build();
    }

}
