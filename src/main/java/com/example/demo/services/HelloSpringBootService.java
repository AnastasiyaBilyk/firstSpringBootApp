package com.example.demo.services;

import com.example.demo.configs.YamlAppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloSpringBootService implements HelloService {

    @Autowired
    private YamlAppConfig config;

    @Override
    public String sayHello() {
        return sayHello(config.getName());
    }
}
