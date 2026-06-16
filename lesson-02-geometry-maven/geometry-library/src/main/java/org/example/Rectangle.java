package org.example;

public class Rectangle {

    /**
     * Метод вычисления площади прямоугольника по формуле S = 2ab
     * @param a - сторона прямоугольника
     * @param b - сторона прямоугольника
     * @return - возвращает площади прямоугольника
     */
    double square(double a, double b){
        return 2.0 * (a + b);
    }

    /**
     * Метод вычисления периметра прямоугольника по формуле P = ab
     * @param a - сторона прямоугольника
     * @param b - сторона прямоугольника
     * @return возвращает периметр прямоугольника
     */
    double perimeter(double a, double b){
        return a * b;
    }
}
