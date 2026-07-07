package com.mycompany.prac2;

// Abstract class
abstract class Shape {

    // Abstract method
    abstract double calculateArea();

    // Concrete method
    void displayArea(String shape, double area) {
        System.out.println(shape + " Area: " + area);
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Square class
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class Prac2 {

    public static void main(String[] args) {

        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(8, 5);
        Shape square = new Square(6);
        Shape triangle = new Triangle(10, 4);

        circle.displayArea("Circle", circle.calculateArea());
        rectangle.displayArea("Rectangle", rectangle.calculateArea());
        square.displayArea("Square", square.calculateArea());
        triangle.displayArea("Triangle", triangle.calculateArea());
    }
}