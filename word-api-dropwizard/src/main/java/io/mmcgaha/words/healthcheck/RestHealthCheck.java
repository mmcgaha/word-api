package io.mmcgaha.words.healthcheck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.http.client.HttpClient;
import org.eclipse.jetty.http.HttpContent;

import com.codahale.metrics.health.HealthCheck;

import io.mmcgaha.words.WordsController;

public class RestHealthCheck extends HealthCheck {

	
	 HttpClient http;
	
	 
	@Override
	protected Result check() throws Exception {
		
		final URL url = new URL(dropwizard.baseUri() + "/ping");
        final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
		return null;
	}

}
