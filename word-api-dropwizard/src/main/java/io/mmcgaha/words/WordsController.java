package io.mmcgaha.words;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/words")
@Produces(MediaType.APPLICATION_JSON)
public class WordsController {

	private final Validator validator;
	 
    public WordsController(Validator validator) {
        this.validator = validator;
    }
    
    @GET
    public Response getWords() {
        return null;
    }
}
