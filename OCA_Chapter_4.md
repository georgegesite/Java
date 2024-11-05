# Designing Methods

 `Method declaration`, which specifies all the information needed to call the method. 

```java
public final void nap(int minutes) throws InterruptedException{
    // method body
}
```
## Access Modifiers

- `public` The method can be called from any class.
- `private` The method can only be called from within the same class.
- `protected` The method can only be called from classes in the same package or subclasses.
- `default` The method can only be called from classes in the same package. There is no keyword for default access. You simply omit the access modifier.

```java
public void walk1() {}
default void walk2() {} // DOES NOT COMPILE
void public walk3() {} // DOES NOT COMPILE
void walk4() {} // default access - same as omitting the access modifier
```
## Optional Specifiers
You can have multiple specifiers in the same method, you can specify them in any order.

- `static` Covered later in this chapter. Used for class methods.
- `abstract` Covered in Chapter 5. Used when not providing a method body.
- `final` Covered in Chapter 5. Used when a method is not allowed to be overridden by a subclass.

```java
public void walk1() {}
public final void walk2() {}
public static final void walk3() {} 
public final static void walk4() {}
public modifier void walk5() {} // DOES NOT COMPILE
public void final walk6() {} // DOES NOT COMPILE
final public void walk7() {}
```

Java allows the optional specifiers to appear before the access modifiers.

## Return Type
Remember that a method must have a return type. If no value is returned, 
the return type is void.

```java
public void walk1() { }
public void walk2() { return; }
public String walk3() { return ""; }
public String walk4() { } // DOES NOT COMPILE
public walk5() { } // DOES NOT COMPILE
String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE

int integerExpanded() {
 int temp = 9;
 return temp;
}
int longExpanded() {
 int temp = 9L; // DOES NOT COMPILE - You can’t stuff that long into an int variable
 return temp;
}
```
## Method Name
- Method names follow the same rules as we practiced with variable names.
- an identifier may only contain letters, numbers, $, or _. 
- first character is not allowed to be a number, and reserved words are not allowed. 

```java
public void walk1() { }
public void 2walk() { } // DOES NOT COMPILE - identifi ers are not allowed to begin with numbers.
public walk3 void() { } // DOES NOT COMPILE - method name comes before return type
public void Walk_$() { }
public void() { } // DOES NOT COMPILE - method name is missing
```
## Parameter List

Although the parameter list is required, it doesn’t have to contain any parameters.

```java
public void walk1() { }
public void walk2 { } // DOES NOT COMPILE - missing the parentheses around the parameter list
public void walk3(int a) { }
public void walk4(int a; int b) { } // DOES NOT COMPILE - comma must be used to separate parameters
public void walk5(int a, int b) { }
```
## Optional Exception List

You can list as many types of exceptions as you want in this clause separated by commas.

```java
public void zeroExceptions() { }
public void oneException() throws IllegalArgumentException { }
public void twoExceptions() throws IllegalArgumentException, InterruptedException { }
```
## Method Body

`Abstract Methods` and `Interfaces` do not have a method body. A method body is simply a code block.

```java
public void walk1() { }
public void walk2; // DOES NOT COMPILE
public void walk3(int a) { int name = 5; }
```

# Working with Varargs
- A `vararg parameter` must be the `last element` in a method’s parameter list.
- This implies you are only allowed to have `one vararg parameter per method`.

```java
public void walk1(int... nums) { }
public void walk2(int start, int... nums) { }
public void walk3(int... nums, int start) { } // DOES NOT COMPILE - varargs must be the last parameter
public void walk4(int... start, int... nums) { } // DOES NOT COMPILE - varargs must be only one per method
```
You can pass in an array, or you can list the elements of the array and let Java create it for you.

```java
 public static void walk(int start, int... nums) {
 System.out.println(nums.length);
 }
 public static void main(String[] args) {
 walk(1); // 0 - Java creates an array of length 0 for nums
 walk(1, 2); // 1 - converts this one value to an array of length 1
 walk(1, 2, 3); // 2 - converts these two value to an array of length 2
 walk(1, new int[] {4, 5}); // 2 - passes 1 as start and an array of length 2 directly as nums.
 walk(1, null); // throws a NullPointerException
 }
```

Accessing a vararg parameter is also just like accessing an array.

```java
 public static void run(int... nums) {
 System.out.println(nums[1]);
 }
 public static void main(String[] args) {
 run(11, 22); // 22
 }
```

# Applying Access Modifiers

- `private`: Only accessible within the same class
- `default (package private) access`: private and other classes in the same package
- `protected`: default access and child classes
- `public`: protected and classes in the other packages

## Private Access

`Private` access is easy. Only code in the same class can call private methods or access private fields.

```java
 package pond.duck;
 public class FatherDuck {
 private String noise = "quack";
 private void quack() {
 System.out.println(noise); // private access is ok
 }
 private void makeNoise() {
 quack(); // private access is ok
 } }

 package pond.duck;
 public class BadDuckling {
 public void makeNoise() {
 FatherDuck duck = new FatherDuck();
 duck.quack(); // DOES NOT COMPILE - method is private
 System.out.println(duck.noise); // DOES NOT COMPILE - field is private
} }
```
## Default (Package Private) Access
When there is no access modifier, Java uses the `default`, which is package private access.
This means that the member is “private”  to classes in the same package.
Only classes in the package may access it.

```java
package pond.duck;
public class MotherDuck {
 String noise = "quack";
 void quack() {
 System.out.println(noise); // default access is ok
 }
 private void makeNoise() {
 quack(); // default access is ok
 } }

 package pond.duck;
public class GoodDuckling {
 public void makeNoise() {
 MotherDuck duck = new MotherDuck();
 duck.quack(); // default access
 System.out.println(duck.noise); // default access
 } }

 package pond.swan;
import pond.duck.MotherDuck; // import another package
public class BadCygnet {
 public void makeNoise() {
 MotherDuck duck = new MotherDuck();
 duck.quack(); // DOES NOT COMPILE - must be in the same package to access a default method
 System.out.println(duck.noise); // DOES NOT COMPILE - must be in the same package to access a default field
 } }
```
## Protected Access
`Protected access` allows everything that default (package private) access allows and more.
The `protected access` modifier adds the ability to access members of a parent class.
![alt text](image-2.png)
```java
package pond.shore;
public class Bird {
 protected String text = "floating"; // protected access
 protected void floatInWater() { // protected access
 System.out.println(text);
 } }

// Creating sub class
package pond.goose;
import pond.shore.Bird; // in a different package
public class Gosling extends Bird { // extends means create subclass
 public void swim() {
 floatInWater(); // calling protected member
 System.out.println(text); // calling protected member
 } }
```
Extending means creating a subclass that has access to any protected or public members of the parent class.
Remember that protected also gives us access to everything that default access does. 
This means that a class in the same package as Bird can access its protected members
```java
package pond.shore; // same package as Bird
public class BirdWatcher {
 public void watchBird() {
 Bird bird = new Bird();
 bird.floatInWater(); // calling protected member
 System.out.println(bird.text); // calling protected member
 } }
```
The definition of protected allows access to subclasses and classes in the same package.

```java
package pond.swan;

import pond.shore.Bird; // in different package than Bird

public class Swan extends Bird { // but subclass of Bird
    
    public void swim() {
        floatInWater(); // package access to superclass via inherting - A member is used without referring to a variable
        System.out.println(text); // package access to superclass via via inherting - A member is used without referring to a variable
    }
    
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass via inherting of Swan Object - A member is used through a variable(other)
        System.out.println(other.text); // package access to superclass via inherting  of Swan Object - A member is used through a variable
    }
    
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater(); // DOES NOT COMPILE - Bird class from a different package -A member is used through a variable
        System.out.println(other.text); // DOES NOT COMPILE - Bird class from a different package -A member is used through a variable
    }
}
```

```java
package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        other.floatInWater(); // DOES NOT COMPILE - not allowed to refer to members of the Bird class since we are not in the same package
        System.out.println(other.text); // DOES NOT COMPILE - - not allowed to refer to members of the Bird class since we are not in the same package
    }
}
```
```java
package pond.duck;

import pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE -we are not in the Goose class
        // GooseWatcher is not in the same package as Bird, nor does it extend Bird
    }
}
```

## Public Access
`Public` means anyone can access the member from anywhere.

```java
package pond.duck;

public class DuckTeacher {
    public String name = "helpful"; // public access
    
    public void swim() { // public access
        System.out.println("swim");
    }
}

package pond.goose;

import pond.duck.DuckTeacher;

public class LostDuckling {
    
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.println("Thanks " + teacher.name); // allowed
    }
}
```

Remember that a member is a method or field.
![alt text](image-3.png)
![alt text](image-4.png)
## Designing Static Methods and Fields

Static methods don't require an object to be created/ an instance of the class.
They are shared among all users of the class.

```java
public class Koala {
 public static int count = 0; // static variable
 public static void main(String[] args) { // static method
 System.out.println(count);
 }
}

public class KoalaTester {
 public static void main(String[] args) {
 Koala.main(new String[0]); // call static method
 // Prints count = 0
 }
}
```
In addition to main() methods, static methods have two main purposes:
- For utility or helper methods that don’t require any object state. Since there is no need 
to access instance variables, having static methods eliminates the need for the caller to 
instantiate the object just to call the method.
- For state that is shared by all instances of a class, like a counter. All instances must 
share the same state. Methods that merely use that state should be static as well.

## Calling a Static Variable or Method
You can use an instance of the object to call a static method.
The compiler checks for the type of the reference and uses that instead of the object—which is sneaky of Java.

```java
Koala k = new Koala();
System.out.println(k.count); // Prints 0 - k is a Koala
k = null;
System.out.println(k.count); // Prints 0 -k is still a Koala
```

Remember to look at the reference type for a variable when you see a static method or variable.

## Static vs. Instance
229/263
## Static Variables
## Static Initialization
## Static Imports

# Passing Data among methods

# Overloading Methods
## Overloading and Varargs
## Autoboxing
## Reference Types
## Primitives
## Putting It All Together

# Creating Constructors
## Default Constructor
## Overloading Constructors
## Final Fields
## Order of Initialization

# Encapsulating Data
## Creating Immutable Classes

# Writing Simple Lambdas
## Lambda Example
## Lambda Syntax    
## Predicates

# Summary

# Exam Essentials
- Be able to identify correct and incorrect method declarations.
- Identify when a method or field is accessible. 
- Recognize valid and invalid uses of static imports.
- State the output of code involving methods.
- Evaluate code involving constructors. 
- Be able to recognize when a class is properly encapsulated.
- Write simple lambda expressions.

# Review Questions Result
