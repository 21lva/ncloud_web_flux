package com.example.demo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {
    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        Mono<String> helloWorld = Mono.just("hello world");
        return ServerResponse.ok().body(helloWorld, String.class);
    }
}
