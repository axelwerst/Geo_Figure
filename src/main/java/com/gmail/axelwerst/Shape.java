package com.gmail.axelwerst;

    public class Shape {
        public double calculateArea() {
            System.out.println("Площа не визначена для абстрактної фігури.");
            return 0;
        }

        public void displayInfo() {
            System.out.println("Це абстрактна фігура.");
        }
    }
    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public void displayInfo() {
            System.out.println("Тип фігури: Коло");
            System.out.println("Радіус: " + radius);
            System.out.println("Площа: " + calculateArea());
        }
    }
    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public double calculateArea() {
            return width * height;
        }
        @Override
        public void displayInfo() {
            System.out.println("Тип фігури: Прямокутник");
            System.out.println("Ширина: " + width);
            System.out.println("Висота: " + height);
            System.out.println("Площа: " + calculateArea());
        }
    }
    class Square extends Rectangle {

        public Square(double side) {
            super(side, side);
        }
        @Override
        public void displayInfo() {
            System.out.println("Тип фігури: Квадрат");
            System.out.println("Сторона: " + super.calculateArea() / super.calculateArea());
            System.out.println("Площа: " + calculateArea());
        }
    }


