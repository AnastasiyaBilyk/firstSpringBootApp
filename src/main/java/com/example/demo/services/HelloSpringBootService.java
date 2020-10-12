package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloSpringBootService implements HelloService {

    @Value("${application.name}")
    private String applicationName;

    @Override
    public String sayHello() {
        return sayHello(applicationName);
    }
}
