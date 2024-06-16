// Main.java


// Polymorphism

/* 

Polymorphism is one of the four fundamental principles of Object-Oriented Programming (OOP) in Java. 
Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. 
There are two main types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.

Compile-time polymorphism is achieved through method overloading. 
Method overloading occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both).

Runtime polymorphism is achieved through method overriding. 
Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. 
In Java, this is usually done using inheritance and interfaces.

*/

// 1. Compile time polymorphism (Method Overloading)

class CompileTimePolymorphism {

    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
   
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}



// 2. Run time polymorphism (Method Overriding)

class Animal {
    public void sound() {
        System.out.println("Animal Makes sound");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}



// Main 

public class Main {

    public static void main(String[] args) {

        // compile time polymorphism 
        CompileTimePolymorphism ctp = new CompileTimePolymorphism();
        int a = ctp.add(2,3);
        int b = ctp.add(2,3,4);
        double c = ctp.add(2.0, 3.0, 4.0);

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    
    
        // Run time polymorphism 
        Animal animal = new Animal();
        Cat cat = new Cat();
        Animal catAnimal = new Cat();

        animal.sound(); // animal sound
        cat.sound();    // cat sound 
        catAnimal.sound();  // cat sound overrides animal parent sound
    }
}
