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
