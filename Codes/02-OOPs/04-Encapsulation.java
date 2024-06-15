
// Encapsulation

public class Person {

    // Person Attributes
    private String name;
    private int age;

    // Constructor function
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Set and Get methods 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age should be +ve");
        }
    }

    // Display person data
    public void displayData() {
        System.out.println("The name of this person is " + name + " and age is " + age);
    }

    // Main method
    public static void main(String[] args) {
        Person person1 = new Person("Joseph", 10);

        person1.displayData();

        person1.setName("Rahul");
        person1.setAge(25);

        person1.displayData();
    }

}


/*  

1. Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) in Java. It involves wrapping the data (variables) and the code (methods) acting on the data into a single unit, typically a class, and restricting the access to some of the object's components. This is done to protect the internal state of an object and to achieve a clear separation between the object's abstract properties and its implementation details.

2. The name and age variables in the Person class are declared private. This means they cannot be accessed directly from outside the class.

3. Public methods getName, setName, getAge, and setAge are provided to access and modify the private variables. The setter method for age includes a basic validation to ensure the age is positive

4. 
- The Person object is created with initial values for name and age. 
- The setName and setAge methods are used to modify the private variables.
- The displayPersonDetails method displays the values of the private variables.

*/
