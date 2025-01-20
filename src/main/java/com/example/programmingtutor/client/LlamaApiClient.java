package com.example.programmingtutor.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LlamaApiClient {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String llamaApiUrl = "http://localhost:8000/api/llama"; // Update with your FastAPI URL

    public String sendRequest(String prompt) {
        return restTemplate.postForObject(llamaApiUrl, prompt, String.class);
    }
}
