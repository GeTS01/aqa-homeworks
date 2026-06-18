package org.example;

public class ArrayMapper {

    public static <T> T[] arrayMapping(T[] array, Function<T> function) {
        T[] result = array.clone();

        for (int i = 0; i < array.length; i++) {
            result[i] = function.apply(array[i]);
        }

        return result;
    }
}