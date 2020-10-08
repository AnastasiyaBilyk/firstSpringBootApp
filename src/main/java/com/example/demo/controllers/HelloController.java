package com.example.demo.controllers;

import com.example.demo.services.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "HelloController")
@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @ApiOperation(value = "Returns greeting for running application.")
    @GetMapping("/hello")
    public String hello() {
        return service.sayHello();
    }
}
