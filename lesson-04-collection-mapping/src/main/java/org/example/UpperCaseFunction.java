package org.example;

public class UpperCaseFunction implements Function<String> {

    @Override
    public String apply(String o) {
        return o.toUpperCase();
    }
}