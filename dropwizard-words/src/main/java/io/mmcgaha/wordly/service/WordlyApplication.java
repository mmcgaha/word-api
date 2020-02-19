package io.mmcgaha.wordly.service;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.mmcgaha.wordly.service.resources.WordsResource;

public class WordlyApplication extends Application<WordlyConfiguration> {

    public static void main(String[] args) throws Exception {
        new WordlyApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<WordlyConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(WordlyConfiguration configuration,
                    Environment environment) {
        final WordsResource resource = new WordsResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }
}
