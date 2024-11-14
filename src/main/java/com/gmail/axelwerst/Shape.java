package com.gmail.axelwerst;

    abstract class Shape {
        public abstract double calculateArea();
        public abstract double calculatePerimeter();

        public abstract String displayInfo();
    }
    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double calculatePerimeter(){
            return Math.PI*2*radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String displayInfo() {
          String  circleInfo = "Тип фігури: Коло "
                    +" Радіус: " + radius
                    +" Площа: " + calculateArea()
                    +" Периметр: " + calculatePerimeter();
          return circleInfo;
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
        public double calculatePerimeter() {
            return width*2+height*2;
        }

        @Override
        public String displayInfo() {
            String rectangleInfo = "Тип фігури: Прямокутник "
            +" Ширина: " + width
            +" Висота: " + height
            +" Площа: " + calculateArea()
            +" Периметр: "+calculatePerimeter();
            return rectangleInfo;
        }
    }
    class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }
        @Override
        public String displayInfo() {
            String squereInfo = "Тип фігури: Квадрат "
                    +" Сторона: " + calculatePerimeter()/4
                    +" Площа: " + calculateArea()
                    +" Периметр: "+ calculatePerimeter();
            return squereInfo;
        }
    }


