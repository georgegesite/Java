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

“Legal,” “valid,” and “compiles” are all synonyms in the Java exam
world.

## Static Imports

Syntax for importing static fields is:  import static <package>.<classname>.\*; or import static <package>.<classname>.<fieldname>;

## Default Values

Following are the default values that instance variables are initialized with if not initialized explicitly:
types (byte, short, char, int, long, float, double) to 0 ( or 0.0 ).
All Object types to null.
boolean to false.

## Main Method Valid

A valid declaration of "the" main() method must be public and static, should return void, and should take a single array of Strings as a parameter.

## Equalty

- == checks reference equality for both String and StringBuilder.
- String.equals() checks content equality.
- StringBuilder.equals() behaves like == and checks reference equality (it does not compare content).
- To compare content between a String and a StringBuilder, use StringBuilder.toString() to convert StringBuilder to a String.
- Java does not allow you to compare String and StringBuilder using ==

## Important

- Interfaces, classes, and enums are all "types".
- "State", on the other hand, is represented by instance fields. Only a class can have instance fields and therefore, only a class can have a state.
- Java's support for multiple inheritance of type(Interfaces, classes, and enums).

## DateTime

```java
System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-01-20
System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 11:12:34
System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-20T11:12:34

DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
```

# Java Notes

## Variables

- **Instance Variables** and **Static Variables**:
  - Receive a default value if not explicitly initialized.
- **Local Variables**:
  - Visibility cannot be specified.
  - Accessible only within the block in which they are declared.

---

## Java Operators

- **`instanceof`**:
  - A valid Java operator.

---

## Exceptions

- You can declare anything that is a `Throwable` or a subclass of `Throwable` in the `throws` clause.

---

## Rules for `Switch` Statement

- **Unsupported Types**:
  - `boolean`, `long`, `float`, and `double` cannot be used.
- **Supported Types**:
  - `String`, `byte`, `char`, `short`, `int`, and their wrapper classes (`Byte`, `Character`, `Short`, `Integer`), and enums.
  - `String` is allowed since Java 7.
- **Case Labels**:
  - Must be **compile-time constants**.
  - Example:
    ```java
    int x = 10;
    final int I = 2 * 3;
    switch(x) {
       case I: System.out.println(x); // Valid because I is a compile-time constant.
    }
    ```
- **Range Constraints**:
  - The `switch` variable must be large enough to hold all case constants.
  - Example (Invalid):
    ```java
    byte b = 10;
    switch(b) {
        case 100: System.out.print(100); // OK
        case 200: System.out.print(200); // Will not compile
    }
    ```
- **Uniqueness**:
  - No two case constant expressions may have the same value.
- **Default Label**:
  - Optional.
  - At most one `default` label is allowed per `switch` statement.
- **Empty Switch Block**:
  - Valid construct.

---

## Class-Level and Instance-Level Fields

- **Class-Level (Static Fields)**:
  - Can be accessed from anywhere in the class (static or non-static methods) and from outside the class depending on their accessibility.
- **Instance-Level Fields**:
  - Can only be accessed from instance methods in the class.

---

## Multiple Inheritance

- **Functional Interface**:
  - Must have exactly one abstract method.
  - May have other default or static methods.
- **Inheritance Rules**:
  - A class can implement an interface and extend a class.
  - An interface may extend another interface.
  - An interface cannot implement another interface.
  - A final class cannot be extended.
  - An abstract class can be extended by:
    - An abstract class.
    - A concrete class.
  - A concrete class can be extended by:
    - An abstract class.
    - A concrete class.

---

## Arrays

- You can create arrays of any type with length zero.

---

## `Predicate` Interface

- A functional interface with one abstract method:
  ```java
  public boolean test(T t);
  ```

## Casting

- **Explicit Casting**:
  - Required for converting:
    - `short` to `char`
    - `char` to `short`

---

## Abstract Methods

- **Definition**:
  - Abstract methods describe a behavior but do not implement it.
- **Rules**:
  - Must be overridden in the subclass to implement the behavior.
  - If a subclass does not override it, the subclass must also be declared abstract.

---

## Primitive Types

- **Integral Types**:
  - Include `byte`, `short`, `int`, `long`, and `char`.

## LABELS

- Remember that a labeled break or continue statement must always exist inside the loop where the label is declared.
- break LABEL; would be valid only when it is within the block of code under the scope of the label LABEL.

```java
public class TestLabeledBreak {
    public static void main(String[] args) {
        outerLoop:  // Label for the outer loop
        for (int i = 0; i < 5; i++) {
            innerLoop:  // Label for the inner loop
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 2) {
                    // This break refers to the innerLoop
                    break innerLoop;
                }
                if (i == 3 && j == 1) {
                    // This break refers to the outerLoop
                    break outerLoop;
                }
            }
        }
    }
}
```

```java
public class TestLabeledBreakInvalid {
    public static void main(String[] args) {
        outerLoop:  // Label for the outer loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // This will cause an error because break is outside the outer loop's scope
        break outerLoop;  // Invalid, will result in compilation error
    }
}

```

Java OCA 8 Self Study Scores
Chapter 1 - 16/23 - 69%
Chapter 2 - 14/20 - 70%
Chapter 3 - 20/33 - 61%
Chapter 4 - 15/29 - 52%
Chapter 5 - 11/20 - 55%
Chapter 6 - 10/20 - 50%

Java OCA 8 Self Study Scores
Chapter 1 - 16/23 - 69%
Chapter 2 - 14/20 - 70%
Chapter 3 - 20/33 - 61%
Chapter 4 - 20/29 - 69%
Chapter 5 - 14/20 - 70%
Chapter 6 - 16/20 - 80%

Chapter 4 - 22/29 - 69%
