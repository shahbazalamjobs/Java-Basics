
# Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle Corporation) in 1995. It is designed to be platform-independent, meaning that code written in Java can run on any device that has a Java Virtual Machine (JVM).

### Basics of Java

1. **Syntax**: Java syntax is similar to C++ but is simpler and eliminates many complex features. The basic structure of a Java program includes:
   - **Classes and Objects**: Java is an object-oriented language, and everything is encapsulated in classes and objects.
   - **Methods**: Functions in Java are called methods and are defined inside classes.
   - **Variables**: Java has various types of variables including instance variables, local variables, and class variables.

2. **Platform Independence**: Java achieves platform independence through the JVM. Java code is compiled into bytecode, which can be executed on any device with a JVM.

3. **Automatic Memory Management**: Java has an automatic garbage collection mechanism that handles memory allocation and deallocation, reducing the risk of memory leaks.

4. **Rich Standard Library**: Java has a comprehensive standard library that provides many useful tools and APIs for tasks like data structures, networking, database connectivity, and more.


### Features of Java

1. **Object-Oriented**: Java follows the principles of object-oriented programming, such as inheritance, encapsulation, polymorphism, and abstraction, which make code reusable, modular, and easy to maintain.

2. **Simple**: Java is designed to be easy to learn and use. Its syntax is clean and easy to understand.

3. **Platform-Independent**: Java’s "write once, run anywhere" philosophy means that Java code can run on any system with a JVM, making it highly portable.

4. **Secure**: Java has built-in security features, including a security manager that defines access rules for applications, and bytecode verification to ensure code integrity.

5. **Multithreaded**: Java supports multithreading, allowing concurrent execution of two or more threads for maximum utilization of CPU.

6. **Robust**: Java emphasizes checking for possible errors during compile-time and runtime, making it a robust language. It also has strong memory management features.

7. **Dynamic**: Java is designed to adapt to an evolving environment. It supports dynamic memory allocation and dynamic linking of new class libraries, methods, and objects.

### Drawbacks of Java

1. **Performance**: Java is generally slower than languages like C and C++ because it is an interpreted language that runs on the JVM. Although Just-In-Time (JIT) compilers have significantly improved Java's performance, it still lags behind natively compiled languages.

2. **Memory Consumption**: Java applications can consume more memory than applications written in languages like C or C++ because of its high-level features and garbage collection mechanism.

3. **Verbose Syntax**: Java's syntax requires more lines of code to accomplish the same tasks.

5. **Learning Curve**: While simpler than C++, Java can still have a steep learning curve for beginners due to its extensive libraries and APIs.

---

## How Java Code Runs

Java code runs through a series of steps involving compilation, class loading, execution by the Java Virtual Machine (JVM), and runtime management. Here’s a detailed explanation:

1. **Compilation**:
   - **Java Source Code**: Developers write Java programs in plain text files with a `.java` extension.
   - **Compilation Process**: The Java compiler (`javac`) translates these source files into bytecode. Bytecode is a low-level platform-independent representation of the source code.

2. **Bytecode Generation**:
   - **Output**: Compilation produces `.class` files containing bytecode. These files contain instructions understandable by the JVM.
   - **Platform Independence**: Bytecode is portable across different platforms and architectures, allowing Java programs to run on any device with a compatible JVM.

3. **Class Loading**:
   - **Loading Classes**: The JVM loads bytecode classes dynamically as they are referenced during program execution.
   - **Verification**: Classes are verified by the JVM to ensure they adhere to Java language rules, enhancing security and stability.

4. **Execution**:
   - **Interpretation vs. Compilation**: Initially, bytecode may be interpreted directly by the JVM. This interpretation allows for immediate execution but can be slower.
   - **Just-In-Time (JIT) Compilation**: To improve performance, the JVM may use JIT compilation. This process translates frequently executed bytecode into native machine code for faster execution.

5. **Runtime Environment**:
   - **Java Runtime Environment (JRE)**: Provides a runtime environment for Java applications.
   - **Execution Support**: Manages memory, handles exceptions, supports multithreading, and provides access to Java's standard libraries (e.g., `java.lang`, `java.util`).

6. **Garbage Collection**:
   - **Automatic Memory Management**: The JVM includes a garbage collector that automatically manages memory allocation and deallocation.
   - **Object Cleanup**: Identifies and releases memory occupied by objects that are no longer referenced by the program, preventing memory leaks and improving application stability.

7. **Platform Independence**:
   - **Write Once, Run Anywhere (WORA)**: Java's platform independence is facilitated by the JVM, which interprets bytecode and executes it on any device with a JVM implementation.
   - **Cross-Platform Compatibility**: Ensures that Java applications can run consistently across diverse environments, reducing development and deployment complexities.

In summary, Java code undergoes compilation into bytecode, which is then executed by the JVM. This process ensures platform independence, efficient memory management through garbage collection, and robust runtime support through the JRE, making Java a versatile and widely-used programming language.


---

Certainly! Here's a basic overview of variables, data types, and typecasting in Java:

### Variables

1. **Definition**:
   - Variables are named storage locations in computer memory used to hold data that can be modified during program execution.

2. **Declaration and Initialization**:
   - **Declaration**: Defines the variable's name and type.
     ```java
     int age; // Declaration of an integer variable named 'age'
     ```
   - **Initialization**: Assigns an initial value to the variable.
     ```java
     age = 30; // Initialization of 'age' with the value 30
     ```

3. **Naming Rules**:
   - Must start with a letter, underscore (`_`), or dollar sign (`$`).
   - Can include letters, digits, underscores, and dollar signs.
   - Case-sensitive (`age` is different from `Age`).

4. **Types of Variables**:
   - **Instance Variables**: Belong to an instance of a class.
   - **Class Variables (static variables)**: Belong to the class itself.
   - **Local Variables**: Defined within methods, constructors, or blocks.

### Data Types

1. **Primitive Data Types**:
   - **Integer Types**: `byte`, `short`, `int`, `long`
   - **Floating-Point Types**: `float`, `double`
   - **Boolean Type**: `boolean` (`true` or `false`)
   - **Character Type**: `char` (single 16-bit Unicode character)

2. **Example Declarations**:
   ```java
   int count = 10;
   double pi = 3.14;
   boolean isJavaFun = true;
   char initial = 'A';
   ```

3. **Default Values**:
   - Primitive types have default values (`0` for numeric types, `false` for `boolean`, `\u0000` for `char`) if not explicitly initialized.

### Typecasting (Type Conversion)

1. **Implicit Type Conversion**:
   - Automatically handled by the compiler when a smaller data type is converted to a larger data type.
   ```java
   int num = 100;
   long bigNum = num; // Implicit conversion of int to long
   ```

2. **Explicit Type Conversion (Typecasting)**:
   - Manually converting a larger data type to a smaller one, or when converting between different data types.
   - Syntax: `targetType variableName = (targetType) expression;`
   ```java
   double price = 19.99;
   int totalPrice = (int) price; // Explicit conversion of double to int
   ```

3. **Type Promotion Rules**:
   - Implicit conversion rules ensure no loss of precision when converting between numeric types.

4. **Cautions**:
   - Typecasting can lead to data loss or unexpected results if the target type cannot accommodate the value from the source type.

Understanding variables, data types, and typecasting is fundamental to effective Java programming, enabling developers to manage and manipulate data appropriately within their applications.


---


```java
public class Main {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        int sum = a + b;        // Sum: 15
        int difference = a - b; // Difference: 5
        int product = a * b;    // Product: 50
        int quotient = a / b;   // Quotient: 2
        int remainder = a % b;  // Remainder: 0
        
        // Relational Operators
        boolean isEqual = (a == b);     // Is Equal: false
        boolean isNotEqual = (a != b);  // Is Not Equal: true
        boolean isGreaterThan = (a > b);// Is Greater Than: true
        boolean isLessThan = (a < b);   // Is Less Than: false
        boolean isGreaterOrEqual = (a >= b);  // Is Greater Than or Equal: true
        boolean isLessOrEqual = (a <= b);     // Is Less Than or Equal: false
        
        // Logical Operators
        boolean resultAND = (a > 0 && b < 10); // Logical AND Result: true
        boolean resultOR = (a > 0 || b < 10);  // Logical OR Result: true
        boolean resultNOT = !(a > 0);          // Logical NOT Result: false
        
        // Assignment Operators
        int x = 10;
        x += 5;  // Value of x after compound assignment: 15
        
        // Increment and Decrement Operators
        a++;  // Incremented value of a: 11
        b--;  // Decremented value of b: 4
        
        // Bitwise Operators
        int resultANDBitwise = a & b;  // Bitwise AND Result: 0
        int resultORBitwise = a | b;   // Bitwise OR Result: 15
        int resultXORBitwise = a ^ b;  // Bitwise XOR Result: 15
        int resultComplement = ~a;     // Bitwise Complement Result: -11
        int shiftedLeft = a << 2;      // Left Shift Result: 44
        int shiftedRight = b >> 1;     // Right Shift Result: 2
        
        // Displaying some results
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        System.out.println("\nRelational Operations:");
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("Is Less Than: " + isLessThan);
        System.out.println("Is Greater Than or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less Than or Equal: " + isLessOrEqual);
        
        System.out.println("\nLogical Operations:");
        System.out.println("Logical AND Result: " + resultAND);
        System.out.println("Logical OR Result: " + resultOR);
        System.out.println("Logical NOT Result: " + resultNOT);
        
        System.out.println("\nAssignment Operations:");
        System.out.println("Value of x after compound assignment: " + x);
        
        System.out.println("\nIncrement and Decrement Operations:");
        System.out.println("Incremented value of a: " + a);
        System.out.println("Decremented value of b: " + b);
        
        System.out.println("\nBitwise Operations:");
        System.out.println("Bitwise AND Result: " + resultANDBitwise);
        System.out.println("Bitwise OR Result: " + resultORBitwise);
        System.out.println("Bitwise XOR Result: " + resultXORBitwise);
        System.out.println("Bitwise Complement Result: " + resultComplement);
        System.out.println("Left Shift Result: " + shiftedLeft);
        System.out.println("Right Shift Result: " + shiftedRight);
    }
}

```

---


```java
public class Main {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        String str1 = "Hello, World!"; // Using string literal
        String str2 = new String("Java Programming"); // Using new keyword
        
        // 2. Concatenation
        String concatStr = str1 + " " + str2; // Concatenating strings
        System.out.println("Concatenated String: " + concatStr);
        
        // 3. Length
        int lengthStr1 = str1.length(); // Length of str1
        System.out.println("Length of str1: " + lengthStr1);
        
        // 4. Comparison
        boolean isEqual = str1.equals("hello, world!"); // Case-sensitive comparison
        System.out.println("str1 is equal to \"hello, world!\": " + isEqual);
        
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!"); // Case-insensitive comparison
        System.out.println("str1 is equal to \"hello, world!\" (ignore case): " + isEqualIgnoreCase);
        
        // 5. Substring
        String substringStr2 = str2.substring(5); // Substring from index 5 to end
        System.out.println("Substring of str2 from index 5: " + substringStr2);
        
        String substringStr1 = str1.substring(7, 12); // Substring from index 7 to 12 (exclusive)
        System.out.println("Substring of str1 from index 7 to 12: " + substringStr1);
        
        // 6. IndexOf
        int indexOfStr2 = str2.indexOf("mm"); // Index of substring "mm"
        System.out.println("Index of \"mm\" in str2: " + indexOfStr2);
        
        // 7. Replace
        String replacedStr1 = str1.replace('o', '0'); // Replace 'o' with '0'
        System.out.println("str1 after replacement: " + replacedStr1);
        
        // 8. Conversion to Upper/Lower Case
        String upperCaseStr2 = str2.toUpperCase(); // Convert str2 to upper case
        System.out.println("str2 in uppercase: " + upperCaseStr2);
        
        String lowerCaseStr1 = str1.toLowerCase(); // Convert str1 to lower case
        System.out.println("str1 in lowercase: " + lowerCaseStr1);
        
        // 9. Trim
        String strWithSpaces = "   Trim me!   ";
        String trimmedStr = strWithSpaces.trim(); // Remove leading and trailing spaces
        System.out.println("Original string with spaces: \"" + strWithSpaces + "\"");
        System.out.println("Trimmed string: \"" + trimmedStr + "\"");
        
        // 10. Checking if Empty or Null
        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty(); // Check if empty
        System.out.println("Is emptyStr empty?: " + isEmpty);
        
        String nullStr = null;
        boolean isNull = (nullStr == null); // Check if null
        System.out.println("Is nullStr null?: " + isNull);
    }
}

```

```Java
Concatenated String: Hello, World! Java Programming
Length of str1: 13
str1 is equal to "hello, world!": false
str1 is equal to "hello, world!" (ignore case): true
Substring of str2 from index 5: Programming
Substring of str1 from index 7 to 12: World
Index of "mm" in str2: 5
str1 after replacement: Hell0, W0rld!
str2 in uppercase: JAVA PROGRAMMING
str1 in lowercase: hello, world!
Original string with spaces: "   Trim me!   "
Trimmed string: "Trim me!"
Is emptyStr empty?: true
Is nullStr null?: true
Concatenated String: Hello, World! Java Programming
Length of str1: 13
str1 is equal to "hello, world!": false
str1 is equal to "hello, world!" (ignore case): true
Substring of str2 from index 5: Programming
Substring of str1 from index 7 to 12: World
Index of "mm" in str2: 5
str1 after replacement: Hell0, W0rld!
str2 in uppercase: JAVA PROGRAMMING
str1 in lowercase: hello, world!
Original string with spaces: "   Trim me!   "
Trimmed string: "Trim me!"
Is emptyStr empty?: true
Is nullStr null?: true
```

---

Sure! Here's a single Java program that covers the basics of Java Math, Booleans, If...Else, Switch, While Loop, For Loop, and Break/Continue:

```java
public class Main {
    public static void main(String[] args) {
        // Java Math
        double num1 = 25.0;
        double num2 = 9.0;
        
        double sqrt = Math.sqrt(num1); // Square root
        double power = Math.pow(num1, 2); // Power
        double max = Math.max(num1, num2); // Maximum
        double min = Math.min(num1, num2); // Minimum
        double random = Math.random(); // Random number between 0.0 and 1.0
        
        System.out.println("Square root of " + num1 + ": " + sqrt);
        System.out.println(num1 + " to the power of 2: " + power);
        System.out.println("Maximum of " + num1 + " and " + num2 + ": " + max);
        System.out.println("Minimum of " + num1 + " and " + num2 + ": " + min);
        System.out.println("Random number: " + random);
        
        // Java Booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        
        // Java If...Else
        int age = 18;
        
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
        
        // Java Switch
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        // Java While Loop
        int i = 0;
        while (i < 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }
        
        // Java For Loop
        for (int j = 0; j < 5; j++) {
            System.out.println("For loop iteration: " + j);
        }
        
        // Java Break/Continue
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                continue; // Skip the rest of the loop for this iteration
            }
            if (k == 8) {
                break; // Exit the loop
            }
            System.out.println("Break/Continue loop iteration: " + k);
        }
    }
}
```

### Explanation and Output:

1. **Java Math**:
   ```java
   double sqrt = Math.sqrt(25.0);   // Square root of 25.0: 5.0
   double power = Math.pow(25.0, 2);// 25.0 to the power of 2: 625.0
   double max = Math.max(25.0, 9.0);// Maximum of 25.0 and 9.0: 25.0
   double min = Math.min(25.0, 9.0);// Minimum of 25.0 and 9.0: 9.0
   double random = Math.random();   // Random number: 0.0 <= x < 1.0 (random)
   ```

2. **Java Booleans**:
   ```java
   boolean isJavaFun = true;        // Is Java fun? true
   boolean isFishTasty = false;     // Is fish tasty? false
   ```

3. **Java If...Else**:
   ```java
   int age = 18;
   if (age < 18) {
       System.out.println("You are a minor.");
   } else {
       System.out.println("You are an adult."); // You are an adult.
   }
   ```

4. **Java Switch**:
   ```java
   int day = 3;
   switch (day) {
       case 1: System.out.println("Monday"); break;
       case 2: System.out.println("Tuesday"); break;
       case 3: System.out.println("Wednesday"); break; // Wednesday
       case 4: System.out.println("Thursday"); break;
       case 5: System.out.println("Friday"); break;
       case 6: System.out.println("Saturday"); break;
       case 7: System.out.println("Sunday"); break;
       default: System.out.println("Invalid day");
   }
   ```

5. **Java While Loop**:
   ```java
   int i = 0;
   while (i < 5) {
       System.out.println("While loop iteration: " + i); // 0, 1, 2, 3, 4
       i++;
   }
   ```

6. **Java For Loop**:
   ```java
   for (int j = 0; j < 5; j++) {
       System.out.println("For loop iteration: " + j); // 0, 1, 2, 3, 4
   }
   ```

7. **Java Break/Continue**:
   ```java
   for (int k = 0; k < 10; k++) {
       if (k == 5) {
           continue; // Skip the rest of the loop for this iteration
       }
       if (k == 8) {
           break; // Exit the loop
       }
       System.out.println("Break/Continue loop iteration: " + k); // 0, 1, 2, 3, 4, 6, 7
   }
   ```

This comprehensive program demonstrates the usage of Java's math functions, boolean variables, conditional statements (`if...else` and `switch`), loops (`while` and `for`), and control flow statements (`break` and `continue`). The comments in the code provide the expected output for each section.


---


Certainly! Below is a comprehensive Java program that demonstrates various ways to declare and initialize arrays, as well as common methods and operations:

```java
public class Main {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        int[] arr1 = {1, 2, 3, 4, 5}; // Static initialization
        int[] arr2 = new int[5]; // Declaration with size
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;

        int[] arr3; // Declaration
        arr3 = new int[]{100, 200, 300}; // Dynamic initialization

        // 2. Accessing elements
        System.out.println("First element of arr1: " + arr1[0]);
        System.out.println("Second element of arr2: " + arr2[1]);
        System.out.println("Third element of arr3: " + arr3[2]);

        // 3. Array Length
        System.out.println("Length of arr1: " + arr1.length);
        System.out.println("Length of arr2: " + arr2.length);
        System.out.println("Length of arr3: " + arr3.length);

        // 4. Iterating over Arrays
        System.out.print("Elements of arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("Elements of arr2 using enhanced for loop: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Copying Arrays
        int[] arr4 = arr1.clone(); // Using clone method
        System.out.print("Elements of arr4 (cloned from arr1): ");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Sorting Arrays
        java.util.Arrays.sort(arr2); // Sorting arr2
        System.out.print("Sorted elements of arr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Searching Arrays
        int index = java.util.Arrays.binarySearch(arr2, 30); // Binary search in sorted arr2
        System.out.println("Index of 30 in sorted arr2: " + index);

        // 8. Filling Arrays
        int[] arr5 = new int[5];
        java.util.Arrays.fill(arr5, 7); // Filling arr5 with 7
        System.out.print("Elements of arr5 after filling: ");
        for (int num : arr5) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 9. Comparing Arrays
        boolean areEqual = java.util.Arrays.equals(arr1, arr4); // Comparing arr1 and arr4
        System.out.println("Are arr1 and arr4 equal?: " + areEqual);

        // 10. Multidimensional Arrays
        int[][] multiArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Elements of multiArr:");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Explanation and Output:

1. **Declaration and Initialization**:
   ```java
   int[] arr1 = {1, 2, 3, 4, 5};           // Static initialization
   int[] arr2 = new int[5];                // Declaration with size
   arr2[0] = 10;
   arr2[1] = 20;
   arr2[2] = 30;
   arr2[3] = 40;
   arr2[4] = 50;

   int[] arr3;                             // Declaration
   arr3 = new int[]{100, 200, 300};        // Dynamic initialization
   ```

2. **Accessing elements**:
   ```java
   System.out.println("First element of arr1: " + arr1[0]);    // First element of arr1: 1
   System.out.println("Second element of arr2: " + arr2[1]);   // Second element of arr2: 20
   System.out.println("Third element of arr3: " + arr3[2]);    // Third element of arr3: 300
   ```

3. **Array Length**:
   ```java
   System.out.println("Length of arr1: " + arr1.length);       // Length of arr1: 5
   System.out.println("Length of arr2: " + arr2.length);       // Length of arr2: 5
   System.out.println("Length of arr3: " + arr3.length);       // Length of arr3: 3
   ```

4. **Iterating over Arrays**:
   ```java
   System.out.print("Elements of arr1: ");
   for (int i = 0; i < arr1.length; i++) {
       System.out.print(arr1[i] + " ");                       // Elements of arr1: 1 2 3 4 5
   }

   System.out.print("Elements of arr2 using enhanced for loop: ");
   for (int num : arr2) {
       System.out.print(num + " ");                           // Elements of arr2 using enhanced for loop: 10 20 30 40 50
   }
   ```

5. **Copying Arrays**:
   ```java
   int[] arr4 = arr1.clone();                                 // Using clone method
   System.out.print("Elements of arr4 (cloned from arr1): ");
   for (int num : arr4) {
       System.out.print(num + " ");                           // Elements of arr4 (cloned from arr1): 1 2 3 4 5
   }
   ```

6. **Sorting Arrays**:
   ```java
   java.util.Arrays.sort(arr2);                               // Sorting arr2
   System.out.print("Sorted elements of arr2: ");
   for (int num : arr2) {
       System.out.print(num + " ");                           // Sorted elements of arr2: 10 20 30 40 50
   }
   ```

7. **Searching Arrays**:
   ```java
   int index = java.util.Arrays.binarySearch(arr2, 30);       // Binary search in sorted arr2
   System.out.println("Index of 30 in sorted arr2: " + index);// Index of 30 in sorted arr2: 2
   ```

8. **Filling Arrays**:
   ```java
   int[] arr5 = new int[5];
   java.util.Arrays.fill(arr5, 7);                            // Filling arr5 with 7
   System.out.print("Elements of arr5 after filling: ");
   for (int num : arr5) {
       System.out.print(num + " ");                           // Elements of arr5 after filling: 7 7 7 7 7
   }
   ```

9. **Comparing Arrays**:
   ```java
   boolean areEqual = java.util.Arrays.equals(arr1, arr4);    // Comparing arr1 and arr4
   System.out.println("Are arr1 and arr4 equal?: " + areEqual);// Are arr1 and arr4 equal?: true
   ```

10. **Multidimensional Arrays**:
   ```java
   int[][] multiArr = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };

   System.out.println("Elements of multiArr:");
   for (int i = 0; i < multiArr.length; i++) {
       for (int j = 0; j < multiArr[i].length; j++) {
           System.out.print(multiArr[i][j] + " ");            // Elements of multiArr: 1 2 3  4 5 6  7 8 9
       }
       System.out.println();
   }
   ```

This program covers various ways to declare and initialize arrays, common methods such as `clone`, `sort`, `binarySearch`, `fill`, and `equals`, and operations like accessing elements, iterating over arrays, copying arrays, and working with multidimensional arrays.


---


Sure! Below is a single Java program that demonstrates Java methods, method parameters, and method overloading:

```java
public class Main {
    public static void main(String[] args) {
        // Java Methods
        greet(); // Calling the greet method

        // Java Method Parameters
        int a = 10;
        int b = 20;
        int sum = add(a, b); // Calling the add method with parameters
        System.out.println("Sum of " + a + " and " + b + ": " + sum);

        // Java Method Overloading
        System.out.println("Area of rectangle (5, 10): " + calculateArea(5, 10)); // Two int parameters
        System.out.println("Area of square (5): " + calculateArea(5)); // One int parameter
        System.out.println("Area of rectangle (5.0, 10.0): " + calculateArea(5.0, 10.0)); // Two double parameters
    }

    // Method without parameters and return type
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and return type
    public static int add(int x, int y) {
        return x + y;
    }

    // Method Overloading: Different number of parameters
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    // Method Overloading: Single parameter (square)
    public static int calculateArea(int side) {
        return side * side;
    }

    // Method Overloading: Different parameter types
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
```

### Explanation and Output:

1. **Java Methods**:
   ```java
   public static void greet() {
       System.out.println("Hello, World!"); // Output: Hello, World!
   }
   ```

2. **Java Method Parameters**:
   ```java
   public static int add(int x, int y) {
       return x + y; // Returns the sum of x and y
   }

   int a = 10;
   int b = 20;
   int sum = add(a, b);
   System.out.println("Sum of " + a + " and " + b + ": " + sum); // Output: Sum of 10 and 20: 30
   ```

3. **Java Method Overloading**:
   ```java
   // Method Overloading: Different number of parameters
   public static int calculateArea(int length, int width) {
       return length * width; // Returns the area of a rectangle
   }

   // Method Overloading: Single parameter (square)
   public static int calculateArea(int side) {
       return side * side; // Returns the area of a square
   }

   // Method Overloading: Different parameter types
   public static double calculateArea(double length, double width) {
       return length * width; // Returns the area of a rectangle with double parameters
   }

   System.out.println("Area of rectangle (5, 10): " + calculateArea(5, 10)); // Output: Area of rectangle (5, 10): 50
   System.out.println("Area of square (5): " + calculateArea(5)); // Output: Area of square (5): 25
   System.out.println("Area of rectangle (5.0, 10.0): " + calculateArea(5.0, 10.0)); // Output: Area of rectangle (5.0, 10.0): 50.0
   ```

This program demonstrates how to define and use methods in Java, including methods with parameters and return types, as well as method overloading, which allows multiple methods with the same name but different parameters. The comments provide the expected output for each section.


---

Certainly! Here’s a single Java program that demonstrates Java classes, Object-Oriented Programming (OOP) concepts, classes and objects, class attributes, class methods, and constructors:

```java
// Java Classes, OOP, Classes/Objects, Class Attributes, Class Methods, Constructors

class Car {
    // Class Attributes
    String brand;
    String model;
    int year;
    double price;

    // Constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Class Method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Another Class Method
    public void startEngine() {
        System.out.println(model + " engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object (Instance of Car)
        Car car1 = new Car("Toyota", "Corolla", 2020, 20000);
        Car car2 = new Car("Honda", "Civic", 2019, 22000);

        // Accessing Class Attributes
        System.out.println("Car 1 Brand: " + car1.brand); // Output: Car 1 Brand: Toyota
        System.out.println("Car 2 Model: " + car2.model); // Output: Car 2 Model: Civic

        // Calling Class Methods
        System.out.println("\nCar 1 Info:");
        car1.displayInfo(); // Display information of car1
        car1.startEngine(); // Output: Corolla engine started.

        System.out.println("\nCar 2 Info:");
        car2.displayInfo(); // Display information of car2
        car2.startEngine(); // Output: Civic engine started.
    }
}
```

### Explanation and Output:

1. **Java Classes and OOP Concepts**:
   - The `Car` class is a blueprint for creating car objects. It encapsulates data (attributes) and methods (functions) related to a car.
   - **Attributes**: `brand`, `model`, `year`, and `price` are attributes of the `Car` class.
   - **Methods**: `displayInfo` and `startEngine` are methods of the `Car` class.
   - **Constructor**: The `Car` constructor initializes the object with values for `brand`, `model`, `year`, and `price`.

2. **Java Classes/Objects**:
   - Objects are instances of classes. In the `Main` class, two `Car` objects (`car1` and `car2`) are created using the `Car` constructor.
     ```java
     Car car1 = new Car("Toyota", "Corolla", 2020, 20000);
     Car car2 = new Car("Honda", "Civic", 2019, 22000);
     ```

3. **Java Class Attributes**:
   - Class attributes are accessed using the dot notation.
     ```java
     System.out.println("Car 1 Brand: " + car1.brand); // Output: Car 1 Brand: Toyota
     System.out.println("Car 2 Model: " + car2.model); // Output: Car 2 Model: Civic
     ```

4. **Java Class Methods**:
   - Class methods are also accessed using the dot notation and can perform actions using the object's attributes.
     ```java
     car1.displayInfo();
     car1.startEngine(); // Output: Corolla engine started.

     car2.displayInfo();
     car2.startEngine(); // Output: Civic engine started.
     ```

5. **Java Constructors**:
   - The constructor method initializes the object's attributes when an object is created.
     ```java
     public Car(String brand, String model, int year, double price) {
         this.brand = brand;
         this.model = model;
         this.year = year;
         this.price = price;
     }
     ```

### Output:

```
Car 1 Brand: Toyota
Car 2 Model: Civic

Car 1 Info:
Brand: Toyota
Model: Corolla
Year: 2020
Price: $20000.0
Corolla engine started.

Car 2 Info:
Brand: Honda
Model: Civic
Year: 2019
Price: $22000.0
Civic engine started.
```

This comprehensive program demonstrates the essential OOP concepts in Java, including class creation, object instantiation, attribute manipulation, method invocation, and constructor usage.


---


Sure! Here's a comprehensive Java program that covers Java modifiers, encapsulation, packages, inheritance, and polymorphism:

```java
// Java Packages / API
package com.example;

// Java Modifiers, Encapsulation, Inheritance, Polymorphism

// Modifier Example: Public class
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Person person = new Person("John", 25);
        Student student = new Student("Jane", 22, "Computer Science");

        // Accessing and modifying attributes via getters and setters (Encapsulation)
        System.out.println("Person Name: " + person.getName()); // Output: Person Name: John
        System.out.println("Person Age: " + person.getAge());   // Output: Person Age: 25

        System.out.println("Student Name: " + student.getName()); // Output: Student Name: Jane
        System.out.println("Student Age: " + student.getAge());   // Output: Student Age: 22
        System.out.println("Student Major: " + student.getMajor()); // Output: Student Major: Computer Science

        // Using method overriding (Polymorphism)
        System.out.println(person.getDescription()); // Output: John is 25 years old.
        System.out.println(student.getDescription()); // Output: Jane is 22 years old and studies Computer Science.
    }
}

// Modifier Example: Public class with private attributes (Encapsulation)
class Person {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age (Encapsulation)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to return description
    public String getDescription() {
        return name + " is " + age + " years old.";
    }
}

// Inheritance: Student is a subclass of Person
class Student extends Person {
    // Additional attribute for Student
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age); // Call the constructor of the superclass (Person)
        this.major = major;
    }

    // Getter and Setter for major (Encapsulation)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Overriding getDescription method (Polymorphism)
    @Override
    public String getDescription() {
        return getName() + " is " + getAge() + " years old and studies " + major + ".";
    }
}
```

### Explanation:

1. **Java Packages / API**:
   - Packages are used to group related classes and avoid naming conflicts. In this example, `com.example` is the package name.
     ```java
     package com.example;
     ```

2. **Java Modifiers**:
   - The `public` modifier makes the class and methods accessible from other classes.
   - The `private` modifier restricts access to the class members.
     ```java
     public class Main { ... }
     class Person { ... }
     class Student extends Person { ... }
     ```

3. **Java Encapsulation**:
   - Encapsulation is achieved by making class attributes private and providing public getter and setter methods to access and modify them.
     ```java
     private String name;
     private int age;

     public String getName() { ... }
     public void setName(String name) { ... }
     public int getAge() { ... }
     public void setAge(int age) { ... }
     ```

4. **Java Inheritance**:
   - Inheritance allows a class to inherit attributes and methods from another class. `Student` class inherits from `Person` class.
     ```java
     class Student extends Person { ... }
     ```

5. **Java Polymorphism**:
   - Polymorphism allows methods to have different implementations based on the object that is calling them. The `getDescription` method is overridden in the `Student` class.
     ```java
     @Override
     public String getDescription() { ... }
     ```

### Output:

```
Person Name: John
Person Age: 25
Student Name: Jane
Student Age: 22
Student Major: Computer Science
John is 25 years old.
Jane is 22 years old and studies Computer Science.
```

This program demonstrates the use of Java modifiers, encapsulation, packages, inheritance, and polymorphism, with clear and concise examples of each concept.

---


Sure! Below is a comprehensive Java program that includes examples of inner classes, abstraction, interfaces, enums, user input, and date manipulation.

```java
// Import necessary packages
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

// Java Inner Classes, Abstraction, Interface, Enums, User Input, Date

public class Main {
    public static void main(String[] args) {
        // Java User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!"); // Output depends on user input

        // Java Date
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Current date and time: " + formatter.format(date)); // Output: Current date and time: <formatted current date and time>

        // Java Enums
        Level level = Level.HIGH;
        System.out.println("Selected level: " + level); // Output: Selected level: HIGH

        // Java Inner Classes
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Output: This is an inner class.

        // Java Abstraction and Interface
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea()); // Output: Area of circle: <calculated area>

        scanner.close();
    }
}

// Java Enums
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

// Java Inner Classes
class OuterClass {
    int outerValue = 10;

    class InnerClass {
        int innerValue = 20;

        void display() {
            System.out.println("This is an inner class."); // Output: This is an inner class.
            System.out.println("Outer value: " + outerValue); // Output: Outer value: 10
            System.out.println("Inner value: " + innerValue); // Output: Inner value: 20
        }
    }
}

// Java Abstraction
abstract class Shape {
    abstract double calculateArea();
}

// Java Interface
interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

### Explanation:

1. **Java User Input**:
   - Uses `Scanner` to read user input from the console.
     ```java
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter your name: ");
     String name = scanner.nextLine();
     System.out.println("Hello, " + name + "!");
     ```

2. **Java Date**:
   - Uses `Date` and `SimpleDateFormat` to display the current date and time.
     ```java
     Date date = new Date();
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
     System.out.println("Current date and time: " + formatter.format(date));
     ```

3. **Java Enums**:
   - Defines an enum `Level` and uses it to set a level.
     ```java
     enum Level {
         LOW,
         MEDIUM,
         HIGH
     }

     Level level = Level.HIGH;
     System.out.println("Selected level: " + level);
     ```

4. **Java Inner Classes**:
   - Demonstrates the use of inner classes.
     ```java
     class OuterClass {
         int outerValue = 10;

         class InnerClass {
             int innerValue = 20;

             void display() {
                 System.out.println("This is an inner class.");
                 System.out.println("Outer value: " + outerValue);
                 System.out.println("Inner value: " + innerValue);
             }
         }
     }

     OuterClass outer = new OuterClass();
     OuterClass.InnerClass inner = outer.new InnerClass();
     inner.display();
     ```

5. **Java Abstraction**:
   - Demonstrates abstraction through the `Shape` abstract class.
     ```java
     abstract class Shape {
         abstract double calculateArea();
     }
     ```

6. **Java Interface**:
   - Implements the `Drawable` interface in the `Circle` class.
     ```java
     interface Drawable {
         void draw();
     }

     class Circle extends Shape implements Drawable {
         private double radius;

         public Circle(double radius) {
             this.radius = radius;
         }

         @Override
         double calculateArea() {
             return Math.PI * radius * radius;
         }

         @Override
         public void draw() {
             System.out.println("Drawing a circle.");
         }
     }

     Shape circle = new Circle(5);
     System.out.println("Area of circle: " + circle.calculateArea());
     ```

### Output:

```
Enter your name: [User enters name]
Hello, [User's name]!
Current date and time: [Formatted current date and time]
Selected level: HIGH
This is an inner class.
Outer value: 10
Inner value: 20
Area of circle: [Calculated area]
```

This program integrates various Java concepts into a cohesive example, demonstrating inner classes, abstraction, interfaces, enums, user input, and date manipulation.


---


Sure! Here is a comprehensive Java program that includes examples of using `ArrayList`, `LinkedList`, `List` sorting, and `HashMap`:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Java ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList); // Output: ArrayList: [Banana, Apple, Orange]

        // Java LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");
        System.out.println("LinkedList: " + linkedList); // Output: LinkedList: [Dog, Cat, Horse]

        // Java List Sorting
        // Sorting ArrayList
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList); // Output: Sorted ArrayList: [Apple, Banana, Orange]

        // Sorting LinkedList
        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList); // Output: Sorted LinkedList: [Cat, Dog, Horse]

        // Sorting with custom comparator
        arrayList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted ArrayList: " + arrayList); // Output: Reverse Sorted ArrayList: [Orange, Banana, Apple]

        // Java HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap); // Output: HashMap: {One=1, Two=2, Three=3}

        // Iterating through HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            // Output:
            // Key: One, Value: 1
            // Key: Two, Value: 2
            // Key: Three, Value: 3
        }

        // Another way of iterating through HashMap using forEach
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        // Output:
        // Key: One, Value: 1
        // Key: Two, Value: 2
        // Key: Three, Value: 3
    }
}
```

### Explanation and Output:

1. **Java ArrayList**:
   - `ArrayList` is a resizable array implementation of the `List` interface.
   - Elements can be added and retrieved by index.
     ```java
     ArrayList<String> arrayList = new ArrayList<>();
     arrayList.add("Banana");
     arrayList.add("Apple");
     arrayList.add("Orange");
     System.out.println("ArrayList: " + arrayList); // Output: ArrayList: [Banana, Apple, Orange]
     ```

2. **Java LinkedList**:
   - `LinkedList` is a doubly-linked list implementation of the `List` and `Deque` interfaces.
   - It allows for efficient insertion and removal of elements.
     ```java
     LinkedList<String> linkedList = new LinkedList<>();
     linkedList.add("Dog");
     linkedList.add("Cat");
     linkedList.add("Horse");
     System.out.println("LinkedList: " + linkedList); // Output: LinkedList: [Dog, Cat, Horse]
     ```

3. **Java List Sorting**:
   - Lists can be sorted using `Collections.sort()`.
   - Custom sorting can be achieved using a `Comparator`.
     ```java
     // Sorting ArrayList
     Collections.sort(arrayList);
     System.out.println("Sorted ArrayList: " + arrayList); // Output: Sorted ArrayList: [Apple, Banana, Orange]

     // Sorting LinkedList
     Collections.sort(linkedList);
     System.out.println("Sorted LinkedList: " + linkedList); // Output: Sorted LinkedList: [Cat, Dog, Horse]

     // Sorting with custom comparator
     arrayList.sort(Comparator.reverseOrder());
     System.out.println("Reverse Sorted ArrayList: " + arrayList); // Output: Reverse Sorted ArrayList: [Orange, Banana, Apple]
     ```

4. **Java HashMap**:
   - `HashMap` is a collection that stores key-value pairs.
   - Keys must be unique, but values can be duplicated.
     ```java
     HashMap<String, Integer> hashMap = new HashMap<>();
     hashMap.put("One", 1);
     hashMap.put("Two", 2);
     hashMap.put("Three", 3);
     System.out.println("HashMap: " + hashMap); // Output: HashMap: {One=1, Two=2, Three=3}

     // Iterating through HashMap
     for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
         // Output:
         // Key: One, Value: 1
         // Key: Two, Value: 2
         // Key: Three, Value: 3
     }

     // Another way of iterating through HashMap using forEach
     hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
     // Output:
     // Key: One, Value: 1
     // Key: Two, Value: 2
     // Key: Three, Value: 3
     ```

This comprehensive program demonstrates the use of `ArrayList`, `LinkedList`, list sorting, and `HashMap` in Java, with clear examples and expected outputs.


---

Certainly! Here’s a comprehensive Java program that includes examples of using `HashSet`, `Iterator`, wrapper classes, exceptions, regular expressions (RegEx), threads, and lambda expressions:

```java
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        // Java HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate, will not be added
        System.out.println("HashSet: " + hashSet); // Output: HashSet: [Banana, Cherry, Apple]

        // Java Iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.print("Iterating HashSet: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // Output: Iterating HashSet: Banana Cherry Apple

        // Java Wrapper Classes
        Integer intWrapper = Integer.valueOf(100);
        Double doubleWrapper = Double.valueOf(10.5);
        System.out.println("\nInteger value: " + intWrapper); // Output: Integer value: 100
        System.out.println("Double value: " + doubleWrapper); // Output: Double value: 10.5

        // Java Exceptions
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage()); // Output: Exception: / by zero
        }

        // Java RegEx
        String text = "Hello, my email is example@example.com";
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found email: " + matcher.group()); // Output: Found email: example@example.com
        } else {
            System.out.println("No email found.");
        }

        // Java Threads
        Thread thread1 = new Thread(new RunnableTask());
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 is running")); // Using lambda for Runnable
        thread1.start(); // Output: Thread 1 is running
        thread2.start(); // Output: Thread 2 is running

        // Java Lambda
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Addition: " + operate(5, 3, addition)); // Output: Addition: 8
        System.out.println("Multiplication: " + operate(5, 3, multiplication)); // Output: Multiplication: 15
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }

    // Lambda expression for a functional interface
    interface MathOperation {
        int operation(int a, int b);
    }

    public static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    // Runnable task for threads
    static class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread 1 is running");
        }
    }
}
```

### Explanation and Output:

1. **Java HashSet**:
   - `HashSet` stores unique elements and does not allow duplicates.
     ```java
     HashSet<String> hashSet = new HashSet<>();
     hashSet.add("Apple");
     hashSet.add("Banana");
     hashSet.add("Cherry");
     hashSet.add("Apple"); // Duplicate, will not be added
     System.out.println("HashSet: " + hashSet); // Output: HashSet: [Banana, Cherry, Apple]
     ```

2. **Java Iterator**:
   - `Iterator` is used to traverse elements in a collection.
     ```java
     Iterator<String> iterator = hashSet.iterator();
     System.out.print("Iterating HashSet: ");
     while (iterator.hasNext()) {
         System.out.print(iterator.next() + " ");
     }
     // Output: Iterating HashSet: Banana Cherry Apple
     ```

3. **Java Wrapper Classes**:
   - Wrapper classes provide a way to use primitive data types as objects.
     ```java
     Integer intWrapper = Integer.valueOf(100);
     Double doubleWrapper = Double.valueOf(10.5);
     System.out.println("Integer value: " + intWrapper); // Output: Integer value: 100
     System.out.println("Double value: " + doubleWrapper); // Output: Double value: 10.5
     ```

4. **Java Exceptions**:
   - Demonstrates exception handling using `try-catch`.
     ```java
     try {
         int result = divide(10, 0);
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Exception: " + e.getMessage()); // Output: Exception: / by zero
     }

     public static int divide(int a, int b) {
         return a / b; // This will throw ArithmeticException if b is 0
     }
     ```

5. **Java RegEx**:
   - Regular expressions are used for pattern matching.
     ```java
     String text = "Hello, my email is example@example.com";
     String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
     Pattern pattern = Pattern.compile(emailPattern);
     Matcher matcher = pattern.matcher(text);
     if (matcher.find()) {
         System.out.println("Found email: " + matcher.group()); // Output: Found email: example@example.com
     } else {
         System.out.println("No email found.");
     }
     ```

6. **Java Threads**:
   - Demonstrates creating and starting threads.
     ```java
     Thread thread1 = new Thread(new RunnableTask());
     Thread thread2 = new Thread(() -> System.out.println("Thread 2 is running")); // Using lambda for Runnable
     thread1.start(); // Output: Thread 1 is running
     thread2.start(); // Output: Thread 2 is running

     // Runnable task for threads
     static class RunnableTask implements Runnable {
         @Override
         public void run() {
             System.out.println("Thread 1 is running");
         }
     }
     ```

7. **Java Lambda**:
   - Demonstrates using lambda expressions with a functional interface.
     ```java
     // Lambda expression for a functional interface
     interface MathOperation {
         int operation(int a, int b);
     }

     public static int operate(int a, int b, MathOperation mathOperation) {
         return mathOperation.operation(a, b);
     }

     MathOperation addition = (a, b) -> a + b;
     MathOperation multiplication = (a, b) -> a * b;
     System.out.println("Addition: " + operate(5, 3, addition)); // Output: Addition: 8
     System.out.println("Multiplication: " + operate(5, 3, multiplication)); // Output: Multiplication: 15
     ```

### Output:

```
HashSet: [Banana, Cherry, Apple]
Iterating HashSet: Banana Cherry Apple 
Integer value: 100
Double value: 10.5
Exception: / by zero
Found email: example@example.com
Thread 1 is running
Thread 2 is running
Addition: 8
Multiplication: 15
```

This comprehensive program demonstrates the use of `HashSet`, `Iterator`, wrapper classes, exceptions, regular expressions, threads, and lambda expressions in Java, with clear examples and expected outputs.
