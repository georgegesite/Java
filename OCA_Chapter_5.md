`class structure` is one of the most powerful features in the Java language

- by creating a new `class that extends an existing class`,
  you may gain access to a slew of inherited primitives, objects, and methods
- designing a `standard interface` for your application, you ensure that any class that implements the interface has certain required methods defined.
- creating `abstract class` definitions, you’re defi ning a platform that other developers can extend and build on top of

# Introducing Class Inheritance

`Inheritance` is the process by which the new child subclass automatically includes any
public or protected primitives, objects, or methods defi ned in the parent class.
`single inheritance`, by which a class may inherit from only one direct parent class.
`multiple inheritance`, by which a class may have multiple direct parents.
classes may implement multiple interfaces

## Extending a Class

you can extend a class by adding the parent class name in the definition using the `extends` keyword
![alt text](image-10.png)

## Applying Class Access Modifiers

- The `public access` modifier applied to a class indicates that it can be referenced and used
  in any class.
- The `default` package private modifier, which is the lack of any access modifi er,
  indicates the class can be accessed only by a subclass or class within the same package.
- a Java file can have many classes but `at most one public class or no public class at all`.

```java
//Groundhog.java
class Rodent {}
public class Groundhog extends Rodent {} // only one public class is allowed in a Java file
```

There can be at most `one public class or interface` in a Java file.

## Creating Java Objects

all classes inherit from a single class, java.lang.Object.

```java
// two equivalent class defi nitions
public class Zoo {
}
public class Zoo extends java.lang.Object {
}
```

The key is that when Java sees you defi ne a class that doesn’t extend another class, it
immediately adds the syntax extends java.lang.Object to the class definition.
Any class will always end with java.lang.Object on the top of the tree.

## Defining Constructors

- `this()` - the first statement of every constructor is either a call to another constructor within the class
- `supper()` - the first statement of every constructor is a call to a constructor in the direct parent class.
- the `super()` command may only be used as the fi rst statement of the constructor.

```java
public class Animal {
    private int age;

    public Animal(int age) {
        super(); // call to the parent constructor defi ned in java.lang.Object, which takes no arguments.
        this.age = age;
    }
}

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // call to Animal’s constructor, which takes a single argument
    }

    public Zebra() {
        this(4);
    }
}
```

If the parent class has more than one constructor, the child class may use any valid
parent constructor in its defi nition.

```java
public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla() {
        super(5);
    }
}
```

## Understanding Compiler Enhancements

Java compiler automatically inserts a call to the no-argument constructor super() if the fi rst
statement is not a call to the parent constructor.

```java
// All are equivalent
public class Donkey {
}
public class Donkey {
 public Donkey() {
 }
}
public class Donkey {
 public Donkey() {
 super();
 }
}
```

```java
public class Mammal {
 public Mammal(int age) {
 }
}
public class Elephant extends Mammal { // DOES NOT COMPILE
}
```

```java
public class Mammal {
 public Mammal(int age) {
 }
}
public class Elephant extends Mammal {
 public Elephant() { // DOES NOT COMPILE
 }
}
```

```java
public class Mammal {
 public Mammal(int age) {
 }
}
public class Elephant extends Mammal {
 public Elephant() {
 super(10); // we have added a constructor with an explicit call to a parent constructor.
 }
}
```

Subclasses may defi ne no-argument constructors
even if their parent classes do not, provided the constructor of the child maps to a parent
constructor via an explicit call of the super() command.

## Reviewing Constructor Rules

1. The first statement of every constructor is a call to another constructor within the class
   using this(), or a call to a constructor in the direct parent class using super().
2. The super() call may not be used after the first statement of the constructor.
3. If no super() call is declared in a constructor, Java will insert a no-argument super()
   as the first statement of the constructor.
4. If the parent doesn’t have a no-argument constructor and the child doesn’t define any
   constructors, the compiler will throw an error and try to insert a default no-argument
   constructor into the child class.
5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
   call to a parent constructor in each child constructor.

## Calling Constructors

the parent constructor is always executed before the child constructor.

```java
class Primate {
 public Primate() {
 System.out.println("Primate");
 }
}
class Ape extends Primate {
 public Ape() {
 System.out.println("Ape");
 }
}
public class Chimpanzee extends Ape {
 public static void main(String[] args) {
 new Chimpanzee(); // Outputs Primate Ape
 }
}
```

## Calling Inherited Class Members

- Java classes may use any public or protected member of the parent class, including methods, primitives, or object references.
- If the parent class and child class are part of the same package, the child class may also use any default members defi ned in the parent class.
- Finally, a child class may never access a private member of the parent class (must use getters and setters).

```java
class Fish {
 protected int size;
 private int age;

 public Fish(int age) {
 this.age = age;
 }

 public int getAge() {
 return age;
 }
}
public class Shark extends Fish {
 private int numberOfFins = 8;

 public Shark(int age) {
 super(age);
 this.size = 4;
 }

 public void displaySharkDetails() {
 System.out.print("Shark with age: "+getAge()); // calls parent class field with indirectly with getter
 System.out.print(" and "+size+" meters long");// calls parent class field directly - allowed since protected modifier
 System.out.print(" with "+numberOfFins+" fins");// calls instance variable
 }
}
```

You may also use this to access members of the parent class that are accessible from the child class,
since a child class inherits all of its parent members.

```java
public void displaySharkDetails() {
 System.out.print("Shark with age: "+this.getAge());
 System.out.print(" and "+this.size+" meters long");
 System.out.print(" with "+this.numberOfFins+" fins");
}
```

In Java, you can explicitly reference a member of the parent class by using the super keyword.

```java
public void displaySharkDetails() {
 System.out.print("Shark with age: "+super.getAge()); // calls parent class method
 System.out.print(" and "+super.size+" meters long");// calls parent class field
 System.out.print(" with "+this.numberOfFins+" fins"); // calls own class field - compiles
 System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT COMPILE -  a member of the current class
}
```

- `this` and `super` may both be used for methods or variables defi ned in the parent class.
- only `this` may be used for members defined in the current class.

## Inheriting Methods

Inheriting a class grants us access to the public and protected members of the parent
class, but also sets the stage for collisions between methods defi ned in both the parent class
and the subclass.

## Overriding a Method

you can override a method a method by declaring a new method with the signature and return type as the method in the parent class.
`method signature` includes the name and list of input parameters.

```java
public class Canine {
 public double getAverageWeight() {
 return 50;
 }
}
public class Wolf extends Canine {
 public double getAverageWeight() {
 return super.getAverageWeight()+20;
 }
 public static void main(String[] args) {
 System.out.println(new Canine().getAverageWeight());
 System.out.println(new Wolf().getAverageWeight());
 }
}
// Outputs
// 50.00
// 70.00
```

```java
public double getAverageWeight() {
 return getAverageWeight()+20; // INFINITE LOOP - calls itself, also known as recursion
}
```

The compiler performs the following checks when you override a nonprivate method:

1. The method in the child class must have the same signature as the method in the parent
   class.
2. The method in the child class must be at least as accessible or more accessible than the
   method in the parent class. (private -> default -> protected -> public)
3. The method in the child class may not throw a checked exception that is new or
   broader than the class of any exception thrown in the parent class method. (Exception -> No Exception)
4. If the method returns a value, it must be the same or a subclass of the method in the
   parent class, known as `covariant return types`.

   Any time you see a method on the exam with the same name as a method in the parent
   class, determine whether the method is being overloaded or overridden fi rst; doing so
   will help you with questions about whether the code will compile.

```java
public class Camel {
 protected String getNumberOfHumps() {
 return "Undefined";
 }
}
public class BactrianCamel extends Camel {
 private int getNumberOfHumps() { // DOES NOT COMPILE - protected to private | String to int - non-covariant types
 return 2;
 }
}
```

```java
public class InsufficientDataException extends Exception {}
public class Reptile {
 protected boolean hasLegs() throws InsufficientDataException {
 throw new InsufficientDataException();
 }
 protected double getWeight() throws Exception {
 return 2;
 }
}
public class Snake extends Reptile {
 protected boolean hasLegs() { // allowed (Exception -> No Exception)
 return false;
 }
 protected double getWeight() throws InsufficientDataException{ // allowed (since InsufficientDataException is a subclass of Exception )
 return 2;
 }
}
```

```java
public class InsufficientDataException extends Exception {}
public class Reptile {
 protected double getHeight() throws InsufficientDataException {
 return 2;
 }
 protected int getLength() {
 return 10;
 }
}
public class Snake extends Reptile {
 protected double getHeight() throws Exception { // DOES NOT COMPILE - Exception is a parent/supper class of InsufficientDataException
 return 2;
 }
 // the child class defi nes a new exception that the parent class did not
 protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE - cannot override method that does not throw exception in parent class
 return 10;
 }
}
```

## Redeclaring private Methods

```java
public class Camel {
 private String getNumberOfHumps() {
 return "Undefined";
 }
}
// the method in the child class is a new method and not an override of the method in the parent class.
public class BactrianCamel extends Camel {
 private int getNumberOfHumps() {
 return 2;
 }
}
```

## Hiding Static Methods

A `hidden method` occurs when a child class defi nes a static method with the same name
and signature as a static method defi ned in a parent class.
five rules for hiding a method:

1. The method in the child class must have the same signature as the method in the parent
   class.
2. The method in the child class must be at least as accessible or more accessible than the
   method in the parent class.
3. The method in the child class may not throw a checked exception that is new or
   broader than the class of any exception thrown in the parent class method.
4. If the method returns a value, it must be the same or a subclass of the method in the
   parent class, known as covariant return types.
5. The method defined in the child class must be marked as static if it is marked as
   static in the parent class (method hiding). Likewise, the method must not be marked
   as static in the child class if it is not marked as static in the parent class (method
   overriding).

```java
public class Bear {
 public static void eat() {
 System.out.println("Bear is eating");
 }
}
public class Panda extends Bear {
 public static void eat() {
 System.out.println("Panda bear is chewing");
 }
 public static void main(String[] args) {
 Panda.eat();
 }
}
```

The eat() method in the child class hides the eat() method in the parent class.
Because they are both marked as static, this is not considered an overridden method.

```java
public class Bear {
 public static void sneeze() {
 System.out.println("Bear is sneezing");
 }
 public void hibernate() {
 System.out.println("Bear is hibernating");
 }
}
public class Panda extends Bear {
 public void sneeze() { // DOES NOT COMPILE -  trying to override a method that should be hidden
 System.out.println("Panda bear sneezes quietly");
 }
 public static void hibernate() { // DOES NOT COMPILE - trying to hide a method that should be overridden
 System.out.println("Panda bear is going to sleep");
 }
}
```

## Overriding vs. Hiding Methods

```java
public class Marsupial {
 public static boolean isBiped() { //hidden method, only accesible to this parent class
 return false;
 }
 public void getMarsupialDescription() {
 System.out.println("Marsupial walks on two legs: "+isBiped());
 }
}
public class Kangaroo extends Marsupial {
 public static boolean isBiped() { // hidden method, only accessible to this subclass
 return true;
 }
 public void getKangarooDescription() {
 System.out.println("Kangaroo hops on two legs: "+isBiped());
 }
 public static void main(String[] args) {
 Kangaroo joey = new Kangaroo();
 joey.getMarsupialDescription();
 joey.getKangarooDescription();
 }
}
//Outputs
//Marsupial walks on two legs: false
//Kangaroo hops on two legs: true
//
```

```java
class Marsupial {
 public boolean isBiped() {
 return false;
 }
 public void getMarsupialDescription() {
 System.out.println("Marsupial walks on two legs: "+isBiped());
 }
}
public class Kangaroo extends Marsupial {
 public boolean isBiped() { // overrides method in parent class
 return true;
 }
 public void getKangarooDescription() {
 System.out.println("Kangaroo hops on two legs: "+isBiped());
 }
 public static void main(String[] args) {
 Kangaroo joey = new Kangaroo();
 joey.getMarsupialDescription();
 joey.getKangarooDescription();
 }
}
//Outputs
//Marsupial walks on two legs: true
//Kangaroo hops on two legs: true
//
```

## Creating final methods

- `final methods` cannot be overridden
- you cannot hide a static method in a parent class if it is marked as final.

```java
public class Bird {
 public final boolean hasFeathers() {
 return true;
 }
}
public class Penguin extends Bird {
 public final boolean hasFeathers() { // DOES NOT COMPILE - cannot override final methods
 return false;
 }
}
//Note that whether or not the child method used the final keyword is irrelevant—the code
//will not compile either way.
```

## Inheriting Variables

Java doesn’t allow variables to be overridden but instead hidden.

## Hiding Variables

- If you’re referencing the variable from within the parent class, the variable
  defined in the parent class is used.
- if you’re referencing the variable from
  within a child class, the variable defi ned in the child class is used.

```java
public class Rodent {
 protected int tailLength = 4;
 public void getRodentDetails() {
 System.out.println("[parentTail="+tailLength+"]");
 }
}
public class Mouse extends Rodent {
 protected int tailLength = 8;
 public void getMouseDetails() {
 System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
 }
 public static void main(String[] args) {
 Mouse mouse = new Mouse();
 mouse.getRodentDetails();
 mouse.getMouseDetails();
 }
}
```

# Creating Abstract Classes

305/334

## Defining an Abstract Class

## Creating a Concrete Class

## Extending an Abstract Clas

# Implementing Interfaces

## Defining an Interface

## Inheriting an Interface

## Classes, Interfaces, and Keywords

## Abstract Methods and Multiple Inheritance

## Interface Variables

## Default Interface Methods

## Default Methods and Multiple Inheritance

## Static Interface Methods

# Understanding Polymorphism

## Object vs. Reference

## Casting Objects

## Virtual Methods

## Polymorphic Parameters

## Polymorphism and Method Overriding

# Summary

# Exam Essentials

# Review Question Results
