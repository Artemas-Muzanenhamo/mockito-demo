package com.example.complex;

import java.util.Arrays;

public enum Property {
    HOUSE("house"),
    APARTMENT("apartment"),
    FLAT("flat");

    private final String propertyValue;

    Property(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    static String getByValue(String value) {
        return Arrays.stream(Property.values())
                .filter(property -> property.propertyValue.equals(value))
                .findFirst()
                .map(Enum::toString)
                .orElse("I could not find the string you looking for!");
    }
}
