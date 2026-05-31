package org.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class FallbackController {

    @GetMapping("/fallback/notifications")
    public Mono<Map<String, String>> notificationServiceFallback() {
        return Mono.just(Map.of(
                "error", "Notification Service временно недоступен",
                "status", "CIRCUIT_OPEN",
                "timestamp", String.valueOf(System.currentTimeMillis())
        ));
    }

    @GetMapping("/fallback/users")
    public Mono<Map<String, String>> userServiceFallback() {
        return Mono.just(Map.of(
                "error", "User Service временно недоступен",
                "status", "CIRCUIT_OPEN",
                "timestamp", String.valueOf(System.currentTimeMillis())
        ));
    }
}