package org.example;


public class GeometryUtils {

    /**
     * Метод перевода сантиметров в метры
     * @param centimeters - значение в сантиметрах
     * @return - возвращает результат в меторах
     */
    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    /**
     * Методе сравнивания двух площадей
     * @param firstArea - площадь первой фигуры
     * @param secondArea - площадь второй фигуры
     * @return - возвращает boolean значение
     */
    public static boolean hasGreaterArea(double firstArea, double secondArea) {
        return firstArea > secondArea;
    }
}
