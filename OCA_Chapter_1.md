#Understanding the Java Class Structure

Classes are the basic building blocks
Objects are runtime instance of a class in memory

## Fields and Methods

Members of a class

- Fields
- Methods
  void means that no value at all is returned.
  This method requires information be supplied to it from the calling method this information is called a parameter.
  The full declaration of a method is called a method signature.

## Comments

A single-line comment begins with two slashes
A multiple-line comment (also known as a multiline comment) includes anything starting from the symbol /_ until the symbol _/.
Java doc comment

## Classes vs. Files

You can even put two classes in the same file. When you do so, at most one of the classes in the file is allowed to be public.

## Writing a main() Method

A java program begins with main() method. A main() method is the
gateway between the startup of a Java process, which is managed by the Java Virtual
Machine (JVM), and the beginning of the programmer’s code.

The result is a file of bytecode by the same name, but with
a .class fi lename extension. Bytecode consists of instructions that the JVM knows how
to execute.
access modifier. It declares this method’s level of exposure
to potential callers in the program.

## Understanding Package declerations

Packages
Import Statments
If package begins with java or javax, this means it came with the JDK.

## Naming Conflicts

If you explicitly import a class name, it takes precedence over any wildcards present.
Sometimes you really do want to use Date from two different packages. When this happens, you can pick one to use in the import and use the other’s fully qualified class name (the package name, a dot, and the class name) to specify that it’s special
public class Conflicts { java.util.Date date; java.sql.Date sqlDate; }

## Creating a new Package

## Code Formatting on the Exam

You’ll also see code that doesn’t have a main() method. When this happens, assume the main() method, class definition, and all necessary imports are present. You’re just being asked if the part of the code you’re shown compiles when dropped into valid surrounding code.

# Creating Objects

object is an instance of a class

## Constructors

It’s called a constructor, which is a special type of method that creates a new Object
For most classes, you don’t have to code a constructor—the compiler will supply a “do nothing” default constructor for you.

## Reading and Writing Object fields

It’s possible to read and write instance variables directly from the caller

## Instance Initializer Blocks

The code between the braces is called a code block.
Other times, code blocks appear outside a method. These are called instance initializers

## Order of Initialization

Fields and instance initializer blocks are run in the order in which they appear in the file.
The constructor runs after all fields and instance initializer blocks have run.

# Distinguishing Between Object References and Primitives

Java applications contain two types of data:

- primitive types and
- reference types

## Primitive Types

boolean, byte, short, int, long, float, double, char
■float and double are used for floating-point (decimal) values.
■ A float requires the letter f following the number so Java knows it is a float.
■ byte, short, int, and long are used for numbers without decimal points.
■ Each numeric type uses twice as many bits as the smaller similar type. For example, short uses twice as many bits as byte does.

Java allows you to specify digits in several other formats:
■ octal (digits 0–7), which uses the number 0 as a prefix—for example, 017
■ hexadecimal (digits 0–9 and letters A–F), which uses the number 0 followed by x or X as a prefix—for example, 0xFF
■ binary (digits 0–1), which uses the number 0 followed by b or B as a prefix—for example, 0b10

You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal point, or right after a decimal point.

## Reference Types

A reference type refers to an object (an instance of a class).
■ A reference can be assigned to another object of the same type.
■ A reference can be assigned to a new object using the new keyword

## Key Differences

First, reference types can be assigned null, which means they do not currently refer to an object.
Primitive types will give you a compiler error if you attempt to assign them null.

Primitives do not have methods.
reference types can be used to call methods when they do not point to null.

# Declaring and Initializing Variables

A variable is a name for a piece of memory that stores data.

```java
//Declaring a variable
String firstName;
//Initializing a bariable
firstName = "George";
```

## Declaring Multiple Variables

You can declare many variables in the same declaration as long as they are all of the same type.
You can also initialize any or all of those values inline.

```java
boolean b1, b2; //legal
String s1 = "1", s2; //legal
double d1, double d2; //not valid
int i1; int i2; // legal
int i3; i4; //not valid
```

A semicolon (;) separates statements in Java

## Identifiers

Must begin with a letter, underscore (`_`), or dollar sign (`$`).
Can contain digits, but cannot start with them.
Cannot include special characters like a dot (`.`), comma (`,`), or slash (`/`).
Cannot be equal to reserved words like `class`, `int`, `public`, etc.

■ Method and variables names begin with a lowercase letter followed by CamelCase.
■ Class names begin with an uppercase letter followed by CamelCase. Don’t start any identifiers with $. The compiler uses this symbol for some fi les.

# Understanding Default Initialization of Variables

Before you can use a variable, it needs a value.

## Local Variables

A local variable is a variable defi ned within a method.
Local variables must be initialized before use.

## Instance and Class variables

Instance variables are also called fields.
Class variables are shared across multiple objects.
simplest type it can give the value: null for an object and 0/false for a primitive.

boolean - false
byte, short, int, long - 0 (in the type’s bit-length)
float, double - 0.0 (in the type’s bit-length)
char '\u0000' - (NUL)
All object references (everything else) - null

# Understanding Variable Scope

Method paramerters are also considered as local variables
Each block of code has its own scope

Luckily the rule for instance variables is easier: they are available as soon as they are defi ned and last for the entire lifetime of the object itself.

■ Local variables—in scope from declaration to end of block
■ Instance variables—in scope from declaration until object garbage collected
■ Class variables—in scope from declaration until program ends

# Ordering Elements in a class

package declarations must come before import statements if present.
Class declaration must come immediately after the import

Think of the acronym PIC (picture): package, import, and class.

Multiple classes can be defi ned in the same fi le, but only one of them is allowed to be public
A file is also allowed to have neither class be public

# Destroying Objects

Java provides a garbage collector to automatically look for objects that aren’t needed anymore.
All Java objects are stored in your program memory’s heap.

## Garbage Collecation

Process of automatically freeing memory on the heap by deleting objects that are no longer reachable in your program.

You do need to know that System.gc() is not guaranteed to run

Java waits patiently until the code no longer needs that memory.
An object will remain on the heap until it is no longer reachable. An object is no longerreachable when one of two situations occurs:
■ The object no longer has any references pointing to it.
■ All references to the object have gone out of scope.

A reference can be assigned to another reference, passed to a method, or returned from a method.
An object cannot be assigned to another object, nor can an object be passed to a method or returned from a method
It is the object that gets garbage collected, not its reference.

## finalize()

This method gets called if the garbage collector tries to collect the object.
It might not get called and that it defi nitely won’t be called twice.
static variables stay in scope until the program ends

# Summary

In this chapter, you saw that Java classes consist of members called fi elds and methods.
Anobject is an instance of a Java class. There are three styles of comment: a single-line comment (//), a multiline comment (/\* _/), and a Javadoc comment (/\*\* _/).

Java begins program execution with a main() method.
The most common signature for this method run from the command line is public static void main(String[] args).
Arguments are passed in after the class name, as in java NameOfClass firstArgument.
Arguments are indexed starting with 0.

Java code is organized into folders called packages.
To reference classes in other packages, you use an import statement.
A wildcard ending an import statement means you want to import all classes in that package. It does not include packages that are inside that one.
java.lang is a special package that does not need to be imported.

Constructors create Java objects.
A constructor is a method matching the class name and omitting the return type.
When an object is instantiated, fi elds and blocks of code are initialized first. Then the constructor is run.

Primitive types are the basic building blocks of Java types. They are assembled into reference types.
Reference types can have methods and be assigned to null.
In addition to“normal” numbers, numeric literals are allowed to begin with 0 (octal), 0x (hex), 0X (hex), 0b (binary), or 0B (binary). Numeric literals are also allowed to contain underscores as long as they are directly between two other numbers.

Declaring a variable involves stating the data type and giving the variable a name.
Variables that represent f elds in a class are automatically initialized to their corresponding “zero” or null value during object instantiation.
Local variables must be specifically initialized.
Identifiers may contain letters, numbers, $, or \_. Identifiers may not begin with numbers.

Scope refers to that portion of code where a variable can be accessed.
There are three kinds of variables in Java, depending on their scope: instance variables, class variables, and
local variables.
Instance variables are the nonstatic fields of your class.
Class variables are the static fields within a class.
Local variables are declared within a method.

For some class elements, order matters within the file. The package statement comes first if present.
Then comes the import statements if present. Then comes the class declaration.
Fields and methods are allowed to be in any order within the class.

Garbage collection is responsible for removing objects from memory when they can never be used again.
An object becomes eligible for garbage collection when there are no more references to it or its references have all gone out of scope. The finalize() method will run once for each object if/when it is first garbage collected.

Java code is object oriented, meaning all code is defi ned in classes.
Access modifiers allow classes to encapsulate data. Java is platform independent, compiling to bytecode.
It is robust and simple by not providing pointers or operator overloading.
Finally, Java is secure because it runs inside a virtual machine.
