package io.mmcgaha.wordly.jobs;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DictionaryReader {

    public static void main(String[] args) {
        HttpClient client =  HttpClient.newBuilder()
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://wordsapiv1.p.rapidapi.com/words/hatchback/typeOf"))
                .GET()
                .header("x-rapidapi-host", "wordsapiv1.p.rapidapi.com")
                .header("x-rapidapi-key", "21e9297d2emsh2cb6d2d674121dap196d26jsn0d1a08301cf0")
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);


    }
}
