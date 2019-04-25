package com.rhutzel.finance.autocomplete.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Collections;

@Component
public class RecipientHandler {
    private Logger logger = LogManager.getLogger(RecipientHandler.class);

    public Mono<ServerResponse> getContext(ServerRequest request) {
        if (request.remoteAddress().isPresent()) {
            logger.info(String.format("getContext() %s", request.remoteAddress().get().getHostString()));
        }

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(Collections.EMPTY_MAP));
    }

}
