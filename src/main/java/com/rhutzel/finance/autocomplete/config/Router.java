package com.rhutzel.finance.autocomplete.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import com.rhutzel.finance.autocomplete.controller.RecipientHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> recipientRoutes(RecipientHandler handler) {
        return RouterFunctions
                .route(GET("/recipient/context").and(accept(MediaType.APPLICATION_JSON)), handler::getContext);
    }

}
