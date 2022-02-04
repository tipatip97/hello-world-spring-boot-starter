package com.tipatip.helloworldspringbootstarter.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getMessage() {
        return "Hello world!";
    }
}
