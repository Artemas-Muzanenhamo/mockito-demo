package com.example.simple;

public class SimpleTest {
    private final NameGreetingService nameGreetingService;

    public SimpleTest(NameGreetingService nameGreetingService) {
        this.nameGreetingService = nameGreetingService;
    }

    public String getName(String name) {
        return nameGreetingService.greeting(name);
    }
}
