package com.example.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SimpleTestTest {
    @InjectMocks
    private SimpleTest simpleTest;
    @Mock
    private NameGreetingService nameGreetingService;

    @Test
    @DisplayName("Return a greeting with the given name")
    void returnsGreeting() {
        when(nameGreetingService.greeting("Artemas")).thenReturn("Hello, Artemas");

        String greetingWithName = simpleTest.getName("Artemas");

        Assertions.assertEquals("Hello, Artemas", greetingWithName);
    }
}
