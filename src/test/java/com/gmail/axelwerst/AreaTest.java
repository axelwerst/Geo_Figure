package com.gmail.axelwerst;

public class AreaTest {

    public static void main(String[] args) {


    Circle circle = new Circle(5);
    double expectedArea = Math.PI * 5 * 5;

         if (circle.calculateArea() == expectedArea) {
        System.out.println(circle.calculateArea()+" = "+ expectedArea );
             System.out.println("Тест пройдено успішно.");
    } else {
        System.out.println("Тест не пройдено.");
        System.out.println("Очікувалося: " + circle.calculateArea());
        System.out.println("Отримано:    " + expectedArea);
    }

    Rectangle rectangle = new Rectangle(4, 5);
    double expectedAreaRectangle = 4 * 5;

        if (rectangle.calculateArea() == expectedAreaRectangle) {
            System.out.println(rectangle.calculateArea()+" = "+ expectedAreaRectangle );
            System.out.println("Тест пройдено успішно.");
        } else {
            System.out.println("Тест не пройдено.");
            System.out.println("Очікувалося: " + rectangle.calculateArea());
            System.out.println("Отримано:    " + expectedAreaRectangle);
        }

    Square square = new Square(4);
    double expectedAreaSuare = 4 * 4;


        if (square.calculateArea() == expectedAreaSuare) {
            System.out.println(square.calculateArea()+" = "+ expectedAreaSuare );
            System.out.println("Тест пройдено успішно.");
        } else {
            System.out.println("Тест не пройдено.");
            System.out.println("Очікувалося: " + square.calculateArea());
            System.out.println("Отримано:    " + expectedAreaSuare);
        }
    }
}
