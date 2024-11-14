package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    //            given
    Circle circle = new Circle(5);
    Square square = new Square(5);
    Rectangle rectangle = new Rectangle(4, 3);
    @Test
    void shouldCalculateArea() {
//        when
        double circleArea = circle.calculateArea();
        double areaExpected = Math.PI*5*5;
//        then
        Assertions.assertEquals(areaExpected,circleArea);
    }
    @Test
    void displayInfo() {
////        when
        String circleInfo = "Тип фігури: Коло "
                +" Радіус: " + 5.0
                +" Площа: " + 78.53981633974483
                +" Периметр: " + 31.41592653589793;
//        then
        Assertions.assertEquals(circleInfo,circle.displayInfo());
    }
    @Test
    void testCalculateArea() {
        double rectangleArea = rectangle.calculateArea();
        double areaExpected = 4.0*3.0;
//        then
        Assertions.assertEquals(areaExpected,rectangleArea);

    }
    @Test
    void calculatePerimeter() {
        double rectanglrPerimetr = rectangle.calculatePerimeter();
        double perimExpected = 4+4+3+3;
//        then
        Assertions.assertEquals(perimExpected,rectanglrPerimetr);
    }
    @Test
    void testDisplayInfo() {

        String squereInfoExpected = "Тип фігури: Квадрат "
                +" Сторона: " + 5.0
                +" Площа: " + 25.0
                +" Периметр: "+ 20.0;
//        then
        Assertions.assertEquals(squereInfoExpected,square.displayInfo());
    }
}