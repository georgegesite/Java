# Java Programming Concepts

## Variables

- **Local Variables**: Must be assigned a value before they are referenced within a method.
- **Instance Variables**: Have default values and can be referenced without explicit assignment. These are properties or fields of a class.
- **Identifiers**:
  - Must begin with a letter, underscore (`_`), or dollar sign (`$`).
  - Can contain digits, but cannot start with them.
  - Cannot include special characters like a dot (`.`), comma (`,`), or slash (`/`).
  - Cannot be equal to reserved words like `class`, `int`, `public`, etc.

## Strings

- The `equals()` method compares the actual content of two strings, not just their reference in memory.

## Arrays

- Arrays can be initialized using anonymous initializers. For example:
  ```java
  int[] numbers = {1, 2, 3, 4}; // Declaration and initialization at the same time.
  ```

## Method Overriding

- When overriding a method from an interface or parent class, the access modifier of the overriding method cannot be more restrictive than that of the original method.

## Abstract Classes

- Abstract classes cannot be instantiated directly. You must implement all abstract methods in a subclass before creating an instance of the subclass.

## Arguments

- **Pass by Value**: In Java, all arguments (whether primitives or references) are passed by value. This means that changes to the method parameter inside the method do not affect the original argument outside of the method.

## Exceptions

### Checked Exceptions:

- Must be caught or declared in the method signature.
- Usually thrown by programmer code.
- Examples: `Exception`, `IOException`

### Runtime Exceptions:

- Can be thrown by both the JVM and programmer code.
- Do not need to be caught or declared.

### Errors:

- Typically thrown by the JVM and are not intended to be caught by the programmer.
- Example: `StackOverflowError` (which is an error, not an exception).

## Classes and Interfaces

- A class cannot implement two interfaces that define default methods with the same signature unless the class overrides the method with its own implementation (either abstract or concrete).
- An interface can inherit two abstract methods with the same signature without issue.

## Lambda Expressions

Lambda expressions can be written in various forms, depending on the syntax you prefer. All forms below are valid:

```java
System.out.println(test(i -> i == 5));
System.out.println(test((i) -> i == 5));
System.out.println(test((i) -> { return i == 5; }));

```

Classes are basic building blocks
Variables hold the data and methods are responsible to do an action based on the instructions given
Comments are ignored by the compiler, it is used for documentation purposes
The main method is the entry point of any java program the JVM tries to find the method to execute the code in it.
A java file can only contain one public class
