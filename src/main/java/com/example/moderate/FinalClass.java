package com.example.moderate;

public final class FinalClass {
    private final SumService sumService;

    public FinalClass(SumService sumService) {
        this.sumService = sumService;
    }

    public int sumByOne(int number) {
        return sumService.addByOne(number);
    }
}
