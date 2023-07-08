package com.example.moderate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FinalClassTest {
    @InjectMocks
    private FinalClass finalClass;
    @Mock
    private SumService sumService;

    @Test
    void testSummation() {
        when(sumService.addByOne(1)).thenReturn(2);

        int sum = finalClass.sumByOne(1);

        assertEquals(2, sum);
    }
}
