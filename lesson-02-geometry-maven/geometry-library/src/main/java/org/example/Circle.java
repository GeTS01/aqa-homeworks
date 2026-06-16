package org.example;

public class Circle {

    /**
     * Метод вычисления площади круга по формуле S = πr²
     * @param radius - радиус
     * @return - возвращает площадь круга
     */
    double square(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Метод вычисления периметра круга по формуле P = 2πr
     * @param radius - радиус
     * @return - возвращает радиус круга
     */
    double perimeter(double radius){
        return 2.0 * Math.PI * radius;
    }
}
