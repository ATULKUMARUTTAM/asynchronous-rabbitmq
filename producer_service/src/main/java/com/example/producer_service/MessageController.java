package com.example.producer_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageProducer messageProducer;

    @GetMapping("/send")
    public String sendMessage(
            @RequestParam String message) {

        messageProducer.sendMessage(message);

        return "Message sent successfully!!!";
    }
}