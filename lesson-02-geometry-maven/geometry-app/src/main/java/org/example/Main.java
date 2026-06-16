package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle();
    Rectangle perimeter = new Rectangle();
    Triangle triangle = new Triangle();

    // Вычисления круга
     double squareCircle = circle.square(5);
     System.out.println(squareCircle);
     double perimeterCircle = circle.perimeter(5);
     System.out.println(perimeterCircle);

    // Вычисления прямоугольника
    double squareRectangle = perimeter.square(5, 6);
    System.out.println(squareRectangle);
    double perimeterRectangle = perimeter.perimeter(5, 5);
    System.out.println(perimeterRectangle);

    // Вычисления треугольника
    double squareTriangle = triangle.square(5, 5);
    System.out.println(squareTriangle);
    double perimeterTriangle = triangle.perimeter(5, 7, 8);
    System.out.println(perimeterTriangle);

    }
}