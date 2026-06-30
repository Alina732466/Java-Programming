package com.mycompany.dsprac1q2;

// Parent Class (Superclass)
class Animal {
    String name;

    // Constructor of Parent Class
    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}

// Child Class (Subclass) demonstrating INHERITANCE using 'extends'
class Dog extends Animal {
    
    // Constructor of Child Class calling the Parent Constructor using 'super'
    Dog(String name) {
        super(name); 
    }

    // Demonstrating METHOD OVERRIDING
    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // An extra method specific only to the Dog class
    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

// Main class explicitly matching your file name: DSprac1Q2.java
public class DSprac1Q2 {
    public static void main(String[] args) {
        System.out.println("--- Inheritance & Method Overriding Demo ---");

        // 1. Creating an instance of the Parent class
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.makeSound(); 

        System.out.println("--------------------------------------------");

        // 2. Creating an instance of the Child class
        Dog myDog = new Dog("Buddy");
        
        myDog.makeSound(); 
        myDog.fetch(); 
    }
}