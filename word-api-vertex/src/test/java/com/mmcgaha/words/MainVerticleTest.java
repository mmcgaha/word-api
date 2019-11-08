package com.mmcgaha.words;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.mmcgaha.words.MainVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.RequestOptions;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;

@RunWith(VertxUnitRunner.class)
public class MainVerticleTest {

    private Vertx vertx;

    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    @Before
    public void setUp(TestContext tc) {

        vertx = Vertx.vertx();
        vertx.deployVerticle(MainVerticle.class.getName(), tc.asyncAssertSuccess());
    }

    @After
    public void tearDown(TestContext tc) {

        vertx.close(tc.asyncAssertSuccess());
    }

    @Test
    public void testThatTheServerIsStarted(TestContext tc) {

        Async async = tc.async();
        vertx.createHttpClient().getNow(8080, "localhost", "/", response -> {
            tc.assertEquals(response.statusCode(), 200);
            response.bodyHandler(body -> {
                tc.assertTrue(body.length() > 0);
                async.complete();
            });
        });
    }

    @Test
    public void testServerResponse(TestContext tc) {

        Async async = tc.async();

        HttpClient request = vertx.createHttpClient();

        RequestOptions options = new RequestOptions();

        options.setPort(PORT).setHost(HOST).setURI("/");

        request.post(options);

    }

}
