// Main.java

//  ------------ 1. Inheritance ---------------

/* 
- Inheritance is a fundamental concept in object-oriented programming (OOP)
 that allows one class (the subclass or derived class) to inherit fields 
 and methods from another class (the superclass or base class).

- This promotes code reusability and establishes a natural hierarchical relationship between classes.

- Single Inheritance: A class inherits from one superclass.
- Multilevel Inheritance: A class inherits from a superclass, which itself is a subclass of another superclass.
- Hierarchical Inheritance: Multiple classes inherit from a single superclass


Java does not support multiple inheritance (a class inheriting from more than one class) to avoid complexity and ambiguity. 
However, multiple inheritance can be achieved through interfaces.

 */

// Parent class
class Animal {
    public void eat() {
        System.out.println("Animal eats food");        
    }
}

// Child Class
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog bark");        
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();  // Dog class inherit method from Animal class
        dog.sound(); // Method of Dog
    }
}




// ------------  2. USe of super class -------------

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of Animal
        System.out.println("Dog constructor");
    }
    @Override
    void eat() {
        super.eat(); // Calls the eat method of Animal
        System.out.println("The dog eats bones.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
