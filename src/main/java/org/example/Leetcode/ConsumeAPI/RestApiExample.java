package org.example.Leetcode.ConsumeAPI;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

public class RestApiExample {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Trans trans = new Trans("");
        Gson gson = new Gson();
        String request = gson.toJson(trans);
        System.out.println(request);
        HttpRequest postRequest = HttpRequest.newBuilder().
                uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", Constants.getKey())
                .POST(BodyPublishers.ofString(request))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponse =  httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(postResponse.body());

    }
}
