package io.mmcgaha.words;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import io.mmcgaha.words.dao.BaseWordsDao;
import io.mmcgaha.words.dao.WordsDao;
import io.mmcgaha.words.model.Word;

@Path("/words")
@Produces(MediaType.APPLICATION_JSON)
public class WordsController {

	private final Validator validator;

	private WordsDao dao;

	public WordsController(Validator validator)
	{
		this.validator = validator;
		dao = new BaseWordsDao();
	}

	@GET
	public Response getWords() {
		return Response.ok(dao.getAllWords()).build();
	}

	@GET
	@Path("/{id}")
	public Response getWordsByID(@PathParam("id") String id) {
		Word word = dao.getWord(id);
		return word != null ? Response.ok(word).build() : Response.status(Status.NOT_FOUND).build();
	}

	@POST
	public Response addWord(Word word) throws URISyntaxException {
		// validation
		Set<ConstraintViolation<Word>> violations = validator.validate(word);
		Word w = dao.createWord(word);

		if (violations.size() > 0)
		{
			ArrayList<String> validationMessages = new ArrayList<String>();
			for (ConstraintViolation<Word> violation : violations)
			{
				validationMessages.add(violation.getPropertyPath().toString() + ": " + violation.getMessage());
			}
			return Response.status(Status.BAD_REQUEST).entity(validationMessages).build();
		}

		if (w != null)
		{
			return Response.created(new URI("/words/" + w.getWordID())).build();
		}

		return Response.status(Status.BAD_REQUEST).build();
	}

	@PUT
	@Path("/{id}")
	public Response updateWordById(@PathParam("id") String id, Word word) {
		Word w = dao.getWord(id);
		Set<ConstraintViolation<Word>> violations = validator.validate(word);
		if (violations.size() > 0)
		{
			ArrayList<String> validationMessages = new ArrayList<String>();
			for (ConstraintViolation<Word> violation : violations)
			{
				validationMessages.add(violation.getPropertyPath().toString() + ": " + violation.getMessage());
			}
			return Response.status(Status.BAD_REQUEST).entity(validationMessages).build();
		}

		if (w != null)
		{
			dao.updateWord(w);
			return Response.ok(word).build();
		}

		return Response.status(Status.NOT_FOUND).build();
	}

	@DELETE
	@Path("/{id}")
	public Response removeWordById(@PathParam("id") String id) {
		Word word = dao.getWord(id);
		if (word != null)
		{
			dao.deleteWord(word.getWordID());
			return Response.ok().build();
		}

		return Response.status(Status.NOT_FOUND).build();
	}
}
