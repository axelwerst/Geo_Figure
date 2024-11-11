package com.gmail.axelwerst;

public class App {
    public static void main(String[] args) {

        System.out.println();
        Circle circle = new Circle(0);
//        System.out.println(circle.calculateArea());
        circle.displayInfo();
        System.out.println();

        Rectangle rectangle = new Rectangle(7, 12);
//        System.out.println(rectangle.calculateArea());
        rectangle.displayInfo();
        System.out.println();

        Square square = new Square(5);
//        System.out.println(square.calculateArea());
        square.displayInfo();
        System.out.println();
    }

}


