package org.example;

public class Triangle {


    /**
     * Метод вычисления площади треугольника по формуле S = 1/2 * a * h
     * @param a - сторона треугольника
     * @param h - высота треугольника
     * @return - возвращает площадь треугольника
     */
    double square(double a, double h){
        return 0.5 * a * h;
    }

    /**
     * Метод вычисления периметра треугольника по формуле P = a + b + c
     * @param a - сторона треугольника
     * @param b - сторона треугольника
     * @param c - сторона треугольника
     * @return - возвращает периметр треугольника
     */
    double perimeter(double a, double b, double c){
        return a + b + c;
    }


}
