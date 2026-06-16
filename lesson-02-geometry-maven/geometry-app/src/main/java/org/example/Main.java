package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();

    // Вычисления круга
     double squareCircle = circle.square(5);
     System.out.println(squareCircle);
     double perimeterCircle = circle.perimeter(5);
     System.out.println(perimeterCircle);

    // Вычисления прямоугольника
    double squareRectangle = rectangle.square(5, 6);
    System.out.println(squareRectangle);
    double perimeterRectangle = rectangle.perimeter(5, 5);
    System.out.println(perimeterRectangle);

    // Вычисления треугольника
    double squareTriangle = triangle.square(5, 5);
    System.out.println(squareTriangle);
    double perimeterTriangle = triangle.perimeter(5, 7, 8);
    System.out.println(perimeterTriangle);

    System.out.println(GeometryUtils.centimetersToMeters(250));
    System.out.println(GeometryUtils.hasGreaterArea(squareCircle, squareTriangle));

    Cube cube = new Cube(5);
    Sphere sphere = new Sphere(5);

    System.out.println("Объем куба: " + cube.getVolume());
    System.out.println("Площадь поверхности куба: " + cube.getSurfaceArea());

    System.out.println("Объем сферы: " + sphere.getVolume());
    System.out.println("Площадь поверхности сферы: " + sphere.getSurfaceArea());

    }
}