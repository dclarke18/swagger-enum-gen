package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.micronaut.core.annotation.Introspected;

@Introspected
public enum ResponseEnum {
    @JsonProperty("JsonProperty Greetings") GREETINGS("greetings!"),
    HELLO("JsonValue hallo!"),
    HI("JsonValue hi!"),
    GUTEN_TAG("JsonValue Guten tag");

    final String displayValue;

    ResponseEnum(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonValue
    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
