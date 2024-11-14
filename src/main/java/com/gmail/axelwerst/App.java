package com.gmail.axelwerst;

public class App {
    public static void main(String[] args) {

        System.out.println();
        Circle circle = new Circle(5);
        System.out.println(circle.displayInfo());
        System.out.println();

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.displayInfo());
        System.out.println();

        Square square = new Square(5);
        System.out.println(square.displayInfo());
        System.out.println();
    }

}


