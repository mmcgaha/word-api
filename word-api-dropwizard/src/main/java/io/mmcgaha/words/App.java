package io.mmcgaha.words;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<Configuration> {
	
	private static final Logger log = LoggerFactory.getLogger(App.class);
			
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }
 
    @Override
    public void run(Configuration c, Environment e) throws Exception {
        log.info("Registering REST resources");
        e.jersey().register(new WordsController(e.getValidator()));
    }
 
    public static void main(String[] args) throws Exception {
    	log.info("Starting application.");
        new App().run(args);
    }
}
