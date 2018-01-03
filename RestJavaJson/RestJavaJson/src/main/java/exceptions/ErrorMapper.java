package exceptions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ErrorMapper {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private String error;

    public ErrorMapper(String error)
    {
        this.error = error;
    }

    @Override
    public String toString()
    {
        return GSON.toJson(this);
    }

}
