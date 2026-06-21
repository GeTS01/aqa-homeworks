package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"java", "java", "spring", "java", "sql"};
        Map<String, Integer> counts = ElementCounter.countElements(words);
        System.out.println(counts);
    }
}