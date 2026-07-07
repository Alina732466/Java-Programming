package com.mycompany.interfaceproject;

// Define the interface
interface ShapeOperations {
    double area(double side);
    double perimeter(double side);
}

// Implement the interface
class Square implements ShapeOperations {

    @Override
    public double area(double side) {
        return side * side;
    }

    @Override
    public double perimeter(double side) {
        return 4 * side;
    }
}

// Main class
public class InterfaceProject {

    public static void main(String[] args) {

        ShapeOperations square = new Square();

        System.out.println("Area of Square = " + square.area(5));
        System.out.println("Perimeter of Square = " + square.perimeter(5));
    }
}