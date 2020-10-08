package com.example.demo.services;

public interface HelloService {

    String sayHello();

    default String sayHello(String addressee) {
        return addressee == null || addressee.isEmpty() ? "Hello world!" : "Hello " + addressee + "!";
    }
}
