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

An `abstract class` is a class that is marked with the abstract keyword and cannot be instantiated.
An `abstract method` is a method marked with the abstract keyword defined in an abstract class, for which no implementation is provided in the class in which it is declared.

```java
public abstract class Animal {
 protected int age;
 public void eat() {
 System.out.println("Animal is eating");
 }
 public abstract String getName(); // abstract method - no brackets, end with semicolon
}
public class Swan extends Animal {
 public String getName() { // abstract method overidden
 return "Swan";
 }
}
```

## Defining an Abstract Class

An abstract class is `not required to include any abstract methods`.

```java
public abstract class Cow {
}
```

An abstract class doesn’t have to implement any abstract methods, an abstract method may only be defined in an abstract class.

```java
public class Chicken {
 public abstract void peck(); // DOES NOT COMPILE - not an abstract class
}
```

```java
public abstract class Turtle {
 public abstract void swim() {} // DOES NOT COMPILE - two brackets are provided instead of a semicolon
 public abstract int getAge() { // DOES NOT COMPILE - provides a body to an abstract method
 return 10;
 }
}
```

- an `abstract class cannot be marked as final` for a somewhat obvious reason.
- an abstract class is one that must be extended by another class to
  be instantiated.
- a final class can’t be extended by another class.
- an abstract method may not be marked as final for the same reason that
  an abstract class may not be marked as final.
- a method may not be marked as both abstract and private

```java
public final abstract class Tortoise { // DOES NOT COMPILE
}

// an abstract method may not be marked as final for the same reason that an abstract class may not be marked as final.
public abstract class Goat {
 public abstract final void chew(); // DOES NOT COMPILE
}

// a method may not be marked as both abstract and private
public abstract class Whale {
 private abstract void sing(); // DOES NOT COMPILE
}
public class HumpbackWhale extends Whale {
 private void sing() {
 System.out.println("Humpback whale is singing");
 }
}
```

```java
public abstract class Whale {
 protected abstract void sing();
}
public class HumpbackWhale extends Whale {
 private void sing() { // DOES NOT COMPILE - the subclass cannot reduce the visibility of the parent method
 System.out.println("Humpback whale is singing");
 }
}
```

## Creating a Concrete Class

Abstract classes cannot be instantiated and therefore do not do much other than define static variables and methods.

```java
public abstract class Eel {
 public static void main(String[] args) {
 final Eel eel = new Eel(); // DOES NOT COMPILE
 }
}
```

An abstract class becomes useful when it is extended by a concrete subclass. A `concrete class` is the first nonabstract subclass that extends an abstract class and is required to implement all inherited abstract methods.

```java
public abstract class Animal {
 public abstract String getName();
}
public class Walrus extends Animal { // DOES NOT COMPILE - did not implement abstract methods
}
```

The key point is that the fi rst class to extend the nonabstract class must implement all
inherited abstract methods.

```java
public abstract class Animal {
 public abstract String getName();
}
public class Bird extends Animal { // DOES NOT COMPILE - concrete class must implement all abstract methods
}
public class Flamingo extends Bird {
 public String getName() {
 return "Flamingo";
 }
}
```

## Extending an Abstract Clas

- abstract classes can extend other abstract classes and are
  not required to provide implementations for any of the abstract methods.
- a concrete class that extends an abstract class must implement all inherited abstract
  methods.

```java
public abstract class Animal {
 public abstract String getName();
}
public abstract class BigCat extends Animal {
 public abstract void roar();
}
public class Lion extends BigCat { // concrete class
 public String getName() { // implements abstract method from abstract class Animal
 return "Lion";
 }
 public void roar() {// implements abstract method from abstract class BigCat
 System.out.println("The Lion lets out a loud ROAR!");
 }
}
```

a concrete
subclass is not required to provide an implementation for an abstract method if an intermediate abstract class provides the implementation.

```java
public abstract class Animal {
 public abstract String getName();
}
public abstract class BigCat extends Animal {
 public String getName() {
    return "BigCat";
 }
 public abstract void roar();
}
public class Lion extends BigCat {
 public void roar() {
 System.out.println("The Lion lets out a loud ROAR!");
 }
}
```

if an intermediate class provides an implementation
for an abstract method, that method is inherited by subclasses as a concrete method, not
as an abstract one. In other words, the subclasses do not consider it an inherited abstract
method because it is no longer abstract by the time it reaches the subclasses.

### Abstract Class Definition Rules:

1. Abstract classes cannot be instantiated directly.
2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract methods.
3. Abstract classes may not be marked as private or final.
4. An abstract class that extends another abstract class inherits all of its abstract methods
   as its own abstract methods.
5. The first concrete class that extends an abstract class must provide an implementation
   for all of the inherited abstract methods.

### Abstract Method Definition Rules:

1. Abstract methods may only be defined in abstract classes.
2. Abstract methods may not be declared private or final.
3. Abstract methods must not provide a method body/implementation in the abstract
   class for which is it declared.
4. Implementing an abstract method in a subclass follows the same rules for overriding a
   method. For example, the name and signature must be the same, and the visibility of
   the method in the subclass must be at least as accessible as the method in the parent
   class.

# Implementing Interfaces

- Java allow classes to implement any
  number of interfaces.
- An `interface` is an abstract data type that defi nes a list of abstract
  public methods that any class implementing the interface must provide.
- A class invokes the interface by using the i`mplements keyword` in its class definition.
  ![alt text](image-11.png)

method access modifiers such as bstract and public , are assumed. In other words, whether or not you provide
them, the compiler will automatically insert them as part of the method definition.

```java
public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {
}
```

## Defining an Interface

1.  Interfaces cannot be instantiated directly.
2.  An interface is not required to have any methods.
3.  An interface may not be marked as final.
4.  All top-level interfaces are assumed to have public or default access, and they must
    include the abstract modifier in their definition. Therefore, marking an interface as
    ` private, protected, or final` will trigger a compiler error, since this is incompatible
    with these assumptions.
5.  All nondefault methods in an interface are assumed to have the modifiers abstract
    and public in their definition. Therefore, marking a method as `private, protected, or final`
    will trigger compiler errors as these are incompatible with the abstract and
    public keywords.

````java
public interface WalksOnTwoLegs {} // compiles - interface are not required to define any methods.

public class TestClass {
  public static void main(String[] args) {
    WalksOnTwoLegs example = new WalksOnTwoLegs();  // DOES NOT COMPILE -cannot instantiate an interface
  }
 }
 public final interface WalksOnEightLegs {  // DOES NOT COMPILE - cannot be defined as final
 }

```java
 public interface CanFly {
  void fly(int speed);
  abstract void takeoff();
  public abstract double dive();
 }

 // both are equivalent
 public abstract interface CanFly { //  abstract keyword is fi rst automatically added to the interface  defi nition
  public abstract void fly(int speed); //  each method is prepended with abstract and public keywords.
  public abstract void takeoff();
  public abstract double dive();
 }
````

```java
 private final interface CanCrawl {  // DOES NOT COMPILE - interface cannot be private or final
  private void dig(int depth);  // DOES NOT COMPILE -- interface methods cannot be private
  protected abstract double depth();  // DOES NOT COMPILE -- interface methods cannot be protected
  public final void surface();  // DOES NOT COMPILE -- interface methods cannot be final
 }
```

## Inheriting an Interface

There are two inheritance rules you should keep in mind when extending an interface:

1.  An interface that extends another interface, as well as an abstract class that
    implements an interface, inherits all of the abstract methods as its own abstract
    methods.
2.  The first concrete class that implements an interface, or extends an abstract class
    that implements an interface, must provide an implementation for all of the inherited
    abstract methods.

- an interface may be extended using the extend keyword. the new child interface inherits all the abstract methods of the parent interface
- an interface may extend multiple interfaces

```java
 public interface HasTail {
  public int getTailLength();
 }
 public interface HasWhiskers {
  public int getNumberOfWhiskers();
 }
 public interface Seal extends HasTail, HasWhiskers {
 }

 // Any class that implements the Seal interface must provide
 // an implementation for all methods in the parent interfaces
```

- an abstract class can implement an interface. it is treated the same way as n interface extending another interface.
- the abstract class inherits the abstract methods of the interface but is not required to implement them.
- the first concrete class to extend the abstract class must implement all the inherited abstract methods of the interface.

```java
public interface HasTail {
  public int getTailLength();
 }
 public interface HasWhiskers {
  public int getNumberOfWhiskers();
 }
 public abstract class HarborSeal implements HasTail, HasWhiskers { // compiles - it inherits abstract methods and no need to implement
 }
 public class LeopardSeal implements HasTail, HasWhiskers {  // DOES NOT COMPILE - it does not implement abstract method of the interface
 }
```

## Classes, Interfaces, and Keywords

- a class can implement an interface
- a class cannot extend an interface
- an interface can extend another interface,
- an interface cannot implement another interface.

```java
 public interface CanRun {}
 public class Cheetah extends CanRun {}  // DOES NOT COMPILE - class cannot extend interface
 public class Hyena {}
 public interface HasFur extends Hyena {} // DOES NOT COMPILE - an interface cannot extend class

 //class implements interface syntax
```

## Abstract Methods and Multiple Inheritance

a class that inherits from two interfaces that contain the same abstract method

```java

 public interface Herbivore {
  public void eatPlants();
 }
 public interface Omnivore {
  public void eatPlants();
  public void eatMeat();
 }
 public class Bear implements Herbivore, Omnivore {
  public void eatMeat() {
    System.out.println("Eating meat");
  }
  public void eatPlants() {
    System.out.println("Eating plants");
  }
 }
```

If two abstract interface methods have identical behaviors—or in this case the same method signature— creating a class that implements one of the two methods automatically implements the second method.

If the method name is the same but the input parameters are different, there is no confl ict because this is considered a method overload.

```java
 public interface Herbivore {
  public int eatPlants(int quantity);
 }

public interface Omnivore {
  public void eatPlants();
 }
 public class Bear implements Herbivore, Omnivore {
  public int eatPlants(int quantity) {
    System.out.println("Eating plants: "+quantity);
    return quantity;
  }
  public void eatPlants() {
    System.out.println("Eating plants");
  }
 }
```

It is not possible in
Java to define two methods in a class with the same name and input parameters but different return types.

```java
 public interface Herbivore {
  public int eatPlants();
 }
 public interface Omnivore {
  public void eatPlants();
 }
 public class Bear implements Herbivore, Omnivore {
  public int eatPlants() {  // DOES NOT COMPILE
    System.out.println("Eating plants: 10");
    return 10;
  }
  public void eatPlants() {  // DOES NOT COMPILE
    System.out.println("Eating plants");
  }
 }

```

The compiler would also throw an exception if you defi ne an interface or abstract class
that inherits from two confl icting interfaces

```java

public interface Herbivore {
  public int eatPlants();
 }
 public interface Omnivore {
  public void eatPlants();
 }
 public interface Supervore extends Herbivore, Omnivore {} // DOES NOT COMPILE - conflicting  interface methods
 public abstract class AbstractBear implements Herbivore, Omnivore {} // DOES NOT COMPILE - conflicting  interface methods
```

## Interface Variables

interface variables are also assumed to be `static and final`.
Here are two interface variables rules:

1.  Interface variables are assumed to be public, static, and final. Therefore, marking
    a variable as private or protected will trigger a compiler error, as will marking any
    variable as abstract.
2.  The value of an interface variable must be set when it is declared since it is marked as
    final

```java
 // compiler will automatically convert them both to the second example:
 public interface CanSwim {
  int MAXIMUM_DEPTH = 100;
  final static boolean UNDERWATER = true;
  public static final String TYPE = "Submersible";
 }
 public interface CanSwim {
  public static final int MAXIMUM_DEPTH = 100;
  public static final boolean UNDERWATER = true;
  public static final String TYPE = "Submersible";
 }
```

the compiler will automatically insert public static final to
any constant interface variables it fi nds missing those modifi ers.

```java
public interface CanDig {
  private int MAXIMUM_DEPTH = 100;  // DOES NOT COMPILE - interface variables cannot be private
  protected abstract boolean UNDERWATER = false;  // DOES NOT COMPILE - cannot be protected and abstract
  public static String TYPE;  // DOES NOT COMPILE - value is not declared - you must provide a value to a static final member of the class when it is defined
 }
```

## Default Interface Methods

- A `default method` is a method defined within an
  interface with the default keyword in which a method body is provided.
- classes have the option to override the default method if they
  need to, but they are not required to do so.
- The purpose of adding default methods to the Java language was in part to help with
  code development and backward compatibility.

```java
  public interface IsWarmBlooded {
  boolean hasScales();
  public default double getTemperature() {
    return 10.0;
  }
 }
```

The following are the default interface method rules you need to be familiar with:

1.  A default method may only be declared within an interface and not within a class or
    abstract class.
2.  A default method must be marked with the default keyword. If a method is marked as
    default, it must provide a method body.
3.  A default method is not assumed to be static, final, or abstract, as it may be used
    or overridden by a class that implements the interface
4.  Like all methods in an interface, a default method is assumed to be public and will not
    compile if marked as private or protected

```java
public interface Carnivore {
  public default void eatMeat();  // DOES NOT COMPILE - marked as default but doesn’t provide a method body
  public int getRequiredFoodAmount() {  // DOES NOT COMPILE - provides a method body but isn't a default method
    return 13;
  }
 }
```

When an interface extends another interface that contains a default method, it may
choose to ignore the default method, in which case the default implementation for the
method will be used. Alternatively, the interface may override the defi nition of the default
method using the standard rules for method overriding, such as not limiting the acces
sibility of the method and using covariant returns. Finally, the interface may redeclare the
method as abstract, requiring classes that implement the new interface to explicitly provide
a method body.

```java
public interface HasFins {
  public default int getNumberOfFins() { // default method
    return 4;
  }
  public default double getLongestFinLength() { // default method
    return 20.0;
  }
  public default boolean doFinsHaveScales() { // default method
    return true;
  }
 }
public interface SharkFamily extends HasFins {
  public default int getNumberOfFins() {
    return 8;
  }
  public double getLongestFinLength();
  public boolean doFinsHaveScales() {  // DOES NOT COMPILE - interface methods need default keyword if it has method body
    return false;
  }
 }


```

## Default Methods and Multiple Inheritance

```java
public interface Walk {
  public default int getSpeed() {
    return 5;
  }
 }
 public interface Run {
  public default int getSpeed() {
    return 10;
  }
 }
 public class Cat implements Walk, Run {  // DOES NOT COMPILE - it is not clear whether the code should output 5 or 10, outputs neither value—it fails to compile
  public static void main(String[] args) {
    System.out.println(new Cat().getSpeed());
  }
 }

 // Error: class Cat inherits unrelated defaults for getSpeed() from types Walk and Run
```

If a class implements two interfaces that have default methods with the same name and
signature, the compiler will throw an error.

```java
 public class Cat implements Walk, Run {
  public int getSpeed() { // class overrides the duplicate method in Walk & Run
    return 1;
  }
  public static void main(String[] args) {
    System.out.println(new Cat().getSpeed());
  }
 }
```

You can see that having a class that implements or inherits two duplicate default methods
forces the class to implement a new version of the method, or the code will not compile.

## Static Interface Methods

A static method defined in an interface `is not inherited` in any classes that implement the interface.

Here are the static interface method rules you need to be familiar with:

1.  Like all methods in an interface, a static method is assumed to be public and will not
    compile if marked as private or protected.
2.  To reference the static method, a reference to the name of the interface must be used.

```java
 public interface Hop {
  static int getJumpHeight() {
    return 8;
  }
 }

 public class Bunny implements Hop {
  public void printDetails() {
    System.out.println(getJumpHeight()); // DOES NOT COMPILE - static interface methods are not inherited by a class implementing the interface
  }
 }
// Below is the correct reference
  public class Bunny implements Hop {
  public void printDetails() {
    System.out.println(Hop.getJumpHeight());
  }
 }
```

a class that implements two interfaces containing static methods
with the same signature will still compile at runtime.
When you define a static method in an interface, it can only be called on the interface itself, not on the instances of the implementing class.

# Understanding Polymorphism

Java supports `polymorphism`, the property of an object to take on many different forms.

```java
 public class Primate {
  public boolean hasHair() {
    return true;
  }
 }
 public interface HasTail {
  public boolean isTailStriped();
 }
 public class Lemur extends Primate implements HasTail {
  public boolean isTailStriped() {
    return false;
  }
  public int age = 10;
  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);
    // Using polymorphism: reference is of type HasTail, but object is of type Lemur
    HasTail hasTail = lemur;
    System.out.println(hasTail.isTailStriped());
    // Using polymorphism: reference is of type Primate, but object is of type Lemur
    Primate primate = lemur;
    System.out.println(primate.hasHair());
    }
 }

//Outputs 10 false true
```

- The ability of an instance of Lemur to be passed as an instance of an
  interface it implements, HasTail, as well as an instance of one of its superclasses, Primate,
  is the nature of polymorphism.

- Once the object has been assigned a new reference type, only the methods and variables
  available to that reference type are callable on the object without an explicit cast.

```java
HasTail hasTail = lemur;
    System.out.println(hasTail.age);  // DOES NOT COMPILE - hasTail has acecss only to the methods defined in the HasTail class
Primate primate = lemur;
   System.out.println(primate.isTailStriped());  // DOES NOT COMPILE -  primate has access only to methods defi ned in the Primate class

```

## Object vs. Reference

all objects are accessed by reference,
Regardless of the type of the reference you have for the object in memory, the object itself doesn’t change.

```java
 Lemur lemur = new Lemur();
 Object lemurAsObject = lemur;

```

We can summarize this principle with the following two rules:

1.  The type of the object determines which properties exist within the object in memory.
2.  The type of the reference to the object determines which methods and variables are
    accessible to the Java program.

## Casting Objects

We can reclaim those references by `casting the object back to the specific subclass` it came from

```java
 Primate primate = lemur;
 Lemur lemur2 = primate; // DOES NOT COMPILE
 Lemur lemur3 = (Lemur)primate;
 System.out.println(lemur3.age);
```

Here are some basic rules to keep in mind when casting variables:

1.  Casting an object from a subclass to a superclass doesn’t require an explicit cast.
2.  Casting an object from a superclass to a subclass requires an explicit cast.
3.  The compiler will not allow casts to unrelated types.
4.  Even when the code compiles without issue, an exception may be thrown at runtime if
    the object being cast is not actually an instance of that class.

Rule 3 example

```java

 public class Bird {}
 public class Fish {
  public static void main(String[] args) {
    Fish fish = new Fish();
    Bird bird = (Bird)fish;  // DOES NOT COMPILE - Bird and Fish are not related
  }
 }
```

```java
 public class Rodent {
 }
 public class Capybara extends Rodent {
  public static void main(String[] args) {
    Rodent rodent = new Rodent();
    Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime - the object that was created is not related to the Capybara class in any way.
  }
 }
```

Related means that this object class extends other class.
We are able to cast an object1 to object2 when object2 is a subclass of object1.

## Virtual Methods

A `virtual method` is a method in which the specific implementation is not determined until runtime.
In fact, all `non-final`, `non-static`, and `non-private` Java methods are considered virtual methods, since any of them can be overridden at runtime.

```java
public class Bird {
  public String getName() {
    return "Unknown";
  }
  public void displayInformation() {
    System.out.println("The bird name is: "+getName());
  }
 }
 public class Peacock extends Bird {
  public String getName() {
    return "Peacock";
  }
  public static void main(String[] args) {
    Bird bird = new Peacock();
    bird.displayInformation(); // Outputs The bird name is: Peacock - since it is of object peacock
  }
 }
```

## Polymorphic Parameters

One of the most useful applications of polymorphism is the ability to pass instances of
a subclass or interface to a method.

```java
class Reptile {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}

class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}

public class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Reptile());
        // able to handle instances of Alligator and Crocodile without issue, because
        // both are subclasses of the Reptile class.
        feed(new Alligator());
        feed(new Crocodile());

    }
}

```

## Polymorphism and Method Overriding

- Java eliminates this contradiction, thus disal
  lowing a method from being overridden by a less accessible version of the method.
- Java compiler disallows overriding meth
  ods with new or broader exceptions.
- Java only allows covariant return types for overridden methods.

# Summary

This chapter took the basic class structure we presented in Chapter 4 and expanded it by
introducing the notion of inheritance. Java classes follow a multilevel single-inheritance
pattern in which every class has exactly one direct parent class, with all classes eventu
ally inheriting from java.lang.Object. Java interfaces simulate a limited form of multiple
inheritance, since Java classes may implement multiple interfaces.

Inheriting a class gives you access to all of the public and protected methods of the
class, but special rules for constructors and overriding methods must be followed or the
code will not compile. For example, if the parent class doesn’t include a no-argument con
structor, an explicit call to a parent constructor must be provided in the child’s construc
tors. Pay close attention on the exam to any class that defi nes a constructor with arguments
and doesn’t defi ne a no-argument constructor.

We reviewed overloaded, overridden, and hidden methods and showed how they differ,
especially in terms of polymorphism. We also introduced the notion of hiding variables,
although we strongly discourage this in practice as it often leads to confusing, diffi cult-to
maintain code.

We introduced abstract classes and interfaces and showed how you can use them to
defi ne a platform for other developers to interact with. By defi nition, an abstract type can
not be instantiated directly and requires a concrete subclass for the code to be used. Since
default and static interface methods are new to Java 8, expect to see at least one question
on them on the exam

Finally, this chapter introduced the concept of polymorphism, central to the Java lan
guage, and showed how objects can be accessed in a variety of forms. Make sure you
understand when casts are needed for accessing objects, and be able to spot the difference
between compile-time and runtime cast problems.

# Exam Essentials

-  Be able to write code that extends other classes.
-  Understand the rules for method overriding.
-  Understand the rules for hiding methods and variables.
-  Recognize the difference between method overriding and method overloading.
-  Be able to write code that creates and extends abstract classes.
-  Be able to write code that creates, extends, and implements interfaces.
-  Be able to write code that uses default and static interface methods.
-  Understand polymorphism.
-  Recognize valid reference casting.



# Review Question Results

/1. B
/2. E
/3. A, B, D, E
O4. C | C,E
O5. A, D | A, D, E, F
/6. D
/7. B, C
/8. F
/9. A
O10. C, F, G | B, C, E, F
O11. D, E | A, D, E
O12. A | B
/13. A
O14. B, C | C
/15. B
O16. A | E
/17. B
O18. C | E
O19. A, C | A, C, F
/20. A

11/20
