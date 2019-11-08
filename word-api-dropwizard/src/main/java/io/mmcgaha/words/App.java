package io.mmcgaha.words;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<Configuration> {
    private static final Logger log = LogManager.getLogger(App.class);
 
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }
 
    @Override
    public void run(Configuration c, Environment e) throws Exception {
        log.info("Registering REST resources");
        e.jersey().register(new WordsController(e.getValidator()));
    }
 
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}
