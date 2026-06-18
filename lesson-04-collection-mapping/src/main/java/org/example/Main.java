package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"java", "maven", "collection"};
        String[] result = ArrayMapper.arrayMapping(words, new UpperCaseFunction());
        System.out.println(Arrays.toString(result));
    }
}