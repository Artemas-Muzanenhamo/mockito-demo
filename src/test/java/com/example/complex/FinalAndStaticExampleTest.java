package com.example.complex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FinalAndStaticExampleTest {
    @InjectMocks
    private FinalAndStaticExample finalAndStaticExample;

    @Test
    void getEnumPropertyByValue() {
        mockStatic(Properties.class);
        when(Properties.getByValue("some random value")).thenReturn("HOUSE");

        String result = finalAndStaticExample.getPropertyPropertyByValue("some random value");

        assertEquals("HOUSE", result);
    }
}
