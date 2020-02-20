package io.mmcgaha.wordly.service.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

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
    public Response sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return Response.ok("hello " + value).build();
    }


    @GET
    @Timed
    public Response sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return Response.ok("hello " + value).build();
    }
}
