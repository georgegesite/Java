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

-`static` Covered later in this chapter. Used for class methods.
-`abstract` Covered in Chapter 5. Used when not providing a method body.
-`final` Covered in Chapter 5. Used when a method is not allowed to be overridden by a subclass.

```java
public void walk1() {}
public final void walk2() {}
public static final void walk3() {} 
public final static void walk4() {}
public modifier void walk5() {} // DOES NOT COMPILE
public void final walk6() {} // DOES NOT COMPILE
final public void walk7() {}
```

Java allows the optional specifi ers to appear before the access.

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

Private access is easy. Only code in the same class can call private methods or access private fields.
## Default (Package Private) Access
221
## Protected Access
## Public Access
## Designing Static Methods and Fields
## Calling a Static Variable or Method
## Static vs. Instance
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
