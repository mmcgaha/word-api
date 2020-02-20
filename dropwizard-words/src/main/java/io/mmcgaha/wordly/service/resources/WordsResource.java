package io.mmcgaha.wordly.service.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.collect.Lists;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import io.mmcgaha.wordly.model.Word;

@Path("/api/v1/words")
@Produces(MediaType.APPLICATION_JSON)
public class WordsResource {

    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public WordsResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    @Path("/hello")
    public Response sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return Response.ok("hello " + value).build();
    }


    @GET
    @Timed
    public List<Word> getWords() {
        List<Word> words = Lists.newArrayList();


        return words;
    }
}
