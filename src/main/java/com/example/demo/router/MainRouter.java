package com.example.demo.router;

import com.example.demo.handler.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class MainRouter {
    private final HelloHandler helloHandler;

    @Autowired
    public MainRouter(HelloHandler helloHandler){
        this.helloHandler = helloHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> routerFunctionA(){
        return RouterFunctions.route()
                .GET("/hello", helloHandler::helloWorld)
                .build();
    }
}
