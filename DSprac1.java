package com.mycompany.dsprac1;

public class DSprac1 {
    // Default constructor (renamed to match the class)
    DSprac1() {
        System.out.println("Default constructor");
    }
    
    // Constructor with 1 parameter
    DSprac1(String name) {
        System.out.println("\nConstructor with 1 parameter");
        System.out.println("name :" + name);
    }
    
    // Constructor with 2 parameters
    DSprac1(String name, int age) {
        System.out.println("\nConstructor with 2 parameter");
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
    }
    
    int sub(int a, int b) {
        System.out.println("\nMethod with Two variable of same datatypes");
        return a - b;
    }
    
    int sub(String a, int b) {
        System.out.println("\nMethod with Two variable of different datatypes");
        System.out.println("Name :" + a);
        return b;
    }
    
    int sub(int a, int b, int c) {
        System.out.println("\nMethod with three variable of same datatypes");
        return a - b - c;
    }

    public static void main(String[] args) {
        // Updated object creation to use the new class name
        DSprac1 D = new DSprac1();
        new DSprac1("Alina");
        new DSprac1("Alina", 19);
        
        System.out.println(D.sub(90, 10));
        System.out.println(D.sub("Alina", 18));
        System.out.println(D.sub(90, 10, 10));
    }
}