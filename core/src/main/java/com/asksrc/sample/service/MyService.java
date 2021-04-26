package com.asksrc.sample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("application-core.properties")
public class MyService {

    @Value("${core.message}")
    private String message;

    public String getMessage() {
        return message;
    }

}
