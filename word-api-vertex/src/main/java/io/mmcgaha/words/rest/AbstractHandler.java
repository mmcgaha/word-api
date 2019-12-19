package io.mmcgaha.words.rest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

public abstract class AbstractHandler implements Handler<RoutingContext> {

	 /**
     * Forwards request to actual handler
     * @param routingContext the Vertx routing context
     */
    @Override
    public void handle(RoutingContext routingContext) {

        handleRequest(routingContext);
    }

    /**
     * The handler method that should be implemented
     * 
     * @param ctx Vertx Context
     */
    public abstract void handleRequest(RoutingContext ctx);

    /**
     * Sets up the headers for a HTTP response
     * 
     * @param resp The response being constructed
     * @param statusCode The status code to use in the response
     */
    protected void setUpHeaders(HttpServerResponse resp, int statusCode) {

        resp.setStatusCode(statusCode);

        SimpleDateFormat dateFmt
                = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

        dateFmt.setTimeZone(TimeZone.getTimeZone("GMT"));

        resp.putHeader(HttpHeaders.DATE, dateFmt.format(Calendar.getInstance().getTime()));
        //resp.putHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
    }
}
