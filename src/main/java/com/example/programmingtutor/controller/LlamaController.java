package com.example.programmingtutor.controller;

import com.example.programmingtutor.client.LlamaApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/llama")
public class LlamaController {
    @Autowired
    private LlamaApiClient llamaApiClient;

    @PostMapping("/send")
    public String sendPrompt(@RequestBody String prompt) {
        return llamaApiClient.sendRequest(prompt);
    }
}
