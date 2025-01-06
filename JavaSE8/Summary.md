# Chapter 1

In this chapter, you saw that Java classes consist of members called fields and methods. An
object is an instance of a Java class. There are three styles of comment: a single-line comment (//), a multiline comment (/\* _/), and a Javadoc comment (/\*\* _/).
Java begins program execution with a main() method. The most common signature for
this method run from the command line is public static void main(String[] args).
Arguments are passed in after the class name, as in java NameOfClass firstArgument.
Arguments are indexed starting with 0.
Java code is organized into folders called packages. To reference classes in other packages, you use an import statement. A wildcard ending an import statement means you want
to import all classes in that package. It does not include packages that are inside that one.
java.lang is a special package that does not need to be imported.
Constructors create Java objects. A constructor is a method matching the class name and
omitting the return type. When an object is instantiated, fields and blocks of code are
initialized first. Then the constructor is run.
Primitive types are the basic building blocks of Java types. They are assembled into
reference types. Reference types can have methods and be assigned to null. In addition to
"normal" numbers, numeric literals are allowed to begin with 0 (octal), 0x (hex), 0X (hex),
0b (binary), or 0B (binary). Numeric literals are also allowed to contain underscores as long
as they are directly between two other numbers.
Declaring a variable involves stating the data type and giving the variable a name.
Variables that represent fields in a class are automatically initialized to their corresponding "zero" or null value during object instantiation. Local variables must be specifically
initialized. Identifiers may contain letters, numbers, $, or \_. Identifiers may not begin with
numbers.
Scope refers to that portion of code where a variable can be accessed. There are three
kinds of variables in Java, depending on their scope: instance variables, class variables, and
local variables. Instance variables are the nonstatic fields of your class. Class variables are
the static fields within a class. Local variables are declared within a method.
For some class elements, order matters within the file. The package statement comes first
if present. Then come the import statements if present. Then comes the class declaration.
Fields and methods are allowed to be in any order within the class.
Garbage collection is responsible for removing objects from memory when they can
never be used again. An object becomes eligible for garbage collection when there are no
more references to it or its references have all gone out of scope. The finalize() method
will run once for each object if/when it is first garbage collected.
Java code is object oriented, meaning all code is defined in classes. Access modifiers
allow classes to encapsulate data. Java is platform independent, compiling to bytecode. It is
robust and simple by not providing pointers or operator overloading. Finally, Java is secure
because it runs inside a virtual machine.

## Exam Essentials

- `Be able to write code using a main() method.` A main() method is usually written as public
  static void main(String[] args). Arguments are referenced starting with args[0]. Accessing
  an argument that wasn't passed in will cause the code to throw an exception.

- `Understand the effect of using packages and imports.` Packages contain Java classes.
  Classes can be imported by class name or wildcard. Wildcards do not look at subdirectories. In the event of a conflict, class name imports take precedence.

- `Be able to recognize a constructor.` A constructor has the same name as the class. It looks
  like a method without a return type.

- `Be able to identify legal and illegal declarations and initialization.` Multiple variables can
  be declared and initialized in the same statement when they share a type. Local variables
  require an explicit initialization; others use the default value for that type. Identifiers may
  contain letters, numbers, $, or \_. Identifiers may not begin with numbers. Numeric literals
  may contain underscores between two digits and begin with 1–9, 0, 0x, 0X, 0b, and 0B.

- `Be able to determine where variables go into and out of scope.` All variables go into scope
  when they are declared. Local variables go out of scope when the block they are declared
  in ends. Instance variables go out of scope when the object is garbage collected. Class
  variables remain in scope as long as the program is running.

- `Be able to recognize misplaced statements in a class.` Package and import statements are
  optional. If present, both go before the class declaration in that order. Fields and methods
  are also optional and are allowed in any order within the class declaration.

- `Know how to identify when an object is eligible for garbage collection.` Draw a diagram
  to keep track of references and objects as you trace the code. When no arrows point to a
  box (object), it is eligible for garbage collection.

# Chapter 2

This chapter covered a wide variety of topics, including dozens of Java operators, along
with numerous control fl ow statements. Many of these operators and statements may have
been new to you.
It is important that you understand how to use all of the required Java operators covered
in this chapter and know how operator precedence infl uences the way a particular expression is interpreted. There will likely be numerous questions on the exam that appear to test
one thing, such as StringBuilder or exception handling, when in fact the answer is related
to the misuse of a particular operator that causes the application to fail to compile. When
you see an operator on the exam, always check that the appropriate data types are used and
that they match each other where applicable.
For statements, this chapter covered two types of control structures: decision-making
controls structures, including if-then, if-then-else, and switch statements, as well as
repetition control structures including for, for-each, while, and do-while. Remember that
most of these structures require the evaluation of a particular boolean expression either for
branching decisions or once per repetition. The switch statement is the only one that supports a variety of data types, including String variables as of Java 7.
With a for-each statement you don’t need to explicitly write a boolean expression, since
the compiler builds them implicitly. For clarity, we referred to an enhanced for loop as a
for-each loop, but syntactically they are written as a for statement.
We concluded this chapter by discussing advanced control options and how fl ow can be
enhanced through nested loops, break statements, and continue statements. Be wary of
questions on the exam that use nested statements, especially ones with labels, and verify
they are being used correctly.
This chapter is especially important because at least one component of this chapter will
likely appear in every exam question with sample code. Many of the questions on the exam
focus on proper syntactic use of the structures, as they will be a large source of questions
that end in “Does not compile.” You should be able to answer all of the review questions
correctly or fully understand those that you answered incorrectly before moving on to later
chapters.

## Exam Essentials

-`Be able to write code that uses Java operators.` This chapter covered a wide variety of
operator symbols. Go back and review them several times so that you are familiar with
them throughout the rest of the book.

-`Be able to recognize which operators are associated with which data types.` Some operators may be applied only to numeric primitives, some only to boolean values, and some
only to objects. It is important that you notice when an operator and operand(s) are mismatched, as this issue is likely to come up in a couple of exam questions.

-`Understand Java operator precedence.` Most Java operators you’ll work with are binary,
but the number of expressions is often greater than two. Therefore, you must understand
the order in which Java will evaluate each operator symbol.

-`Be able to write code that uses parentheses to override operator precedence.` You can use
parentheses in your code to manually change the order of precedence.

-`Understand if and switch decision control statements.`The if-then and switch statements come up frequently throughout the exam in questions unrelated to decision control,
so make sure you fully understand these basic building blocks of Java.

-`Understand loop statements`. Know the syntactical structure of all loops, including while,
do-while, and for. Each loop has its own special properties and structures. Also, be familiar with the enhanced for-each loops that iterate over lists.

-`Understand how break and continue can change flow control.` Know how to change the
flow control within a statement by applying a break or continue command. Also know
which control statements can accept break statements and which can accept continue
statements. Finally, understand how these statements work inside embedded loops or
switch statements.

# Chapter 3

In this chapter, you learned that Strings are immutable sequences of characters. The new
operator is optional. The concatenation operator (+) creates a new String with the content of the fi rst String followed by the content of the second String. If either operand
involved in the + expression is a String, concatenation is used; otherwise, addition is used.
String literals are stored in the string pool. The String class has many methods. You need
to know charAt(), concat(), endsWith(), equals(), equalsIgnoreCase(), indexOf(),
length(), replace(), startsWith(), substring(), toLowerCase(), toUpperCase(), and
trim().
StringBuilders are mutable sequences of characters. Most of the methods return a
reference to the current object to allow method chaining. The StringBuilder class has
many methods. You need to know append(), charAt(), delete(), deleteCharAt(),
indexOf(), insert(), length(), reverse(), substring(), and toString(). StringBuffer
is the same as StringBuilder except that it is thread safe.
Calling == on String objects will check whether they point to the same object in the
pool. Calling == on StringBuilder references will check whether they are pointing to the
same StringBuilder object. Calling equals() on String objects will check whether the
sequence of characters is the same. Calling equals() on StringBuilder objects will check
whether they are pointing to the same object rather than looking at the values inside.
An array is a fi xed-size area of memory on the heap that has space for primitives or
pointers to objects. You specify the size when creating it—for example, int[] a = new
int[6];. Indexes begin with 0 and elements are referred to using a[0]. The Arrays.sort()
method sorts an array. Arrays.binarySearch() searches a sorted array and returns the
index of a match. If no match is found, it negates the position where the element would
need to be inserted and subtracts 1. Methods that are passed varargs (…) can be used as
if a normal array was passed in. In a multidimensional array, the second-level arrays and
beyond can be different sizes.
An ArrayList can change size over its life. It can be stored in an ArrayList or List
reference. Generics can specify the type that goes in the ArrayList. You need to know the
methods add(), clear(), contains(), equals(), isEmpty(), remove(), set(), and size().
Although an ArrayList is not allowed to contain primitives, Java will autobox parameters
passed in to the proper wrapper type. Collections.sort() sorts an ArrayList.
A LocalDate contains just a date, a LocalTime contains just a time, and a LocalDateTime
contains both a date and time. All three have private constructors and are created using
LocalDate.now() or LocalDate.of() (or the equivalents for that class). Dates and times
can be manipulated using plusXXX or minusXXX methods. The Period class represents a
number of days, months, or years to add or subtract from a LocalDate or LocalDateTime.
DateTimeFormatter is used to output dates and times in the desired format. The date and
time classes are all immutable, which means the return value must be used.

## Exam Essentials

-`Be able to determine the output of code using String.` Know the rules for concatenating Strings and how to use common String methods. Know that Strings are immutable.
Pay special attention to the fact that indexes are zero based and that substring() gets the
string up until right before the index of the second parameter.

-`Be able to determine the output of code using StringBuilder.` Know that
StringBuilder is mutable and how to use common StringBuilder methods. Know that
substring() does not change the value of a StringBuilder whereas append(), delete(),
and insert() do change it. Also note that most StringBuilder methods return a reference
to the current instance of StringBuilder.

-`Understand the difference between == and equals.` == checks object equality. equals()
depends on the implementation of the object it is being called on. For Strings, equals()
checks the characters inside of it.

-`Be able to determine the output of code using arrays.` Know how to declare and instantiate one-dimensional and multidimensional arrays. Be able to access each element and know
when an index is out of bounds. Recognize correct and incorrect output when searching
and sorting.

-`Be able to determine the output of code using ArrayList.` Know that ArrayList can
increase in size. Be able to identify the different ways of declaring and instantiating an
ArrayList. Identify correct output from ArrayList methods, including the impact of
autoboxing.

-`Recognize invalid uses of dates and times.` LocalDate does not contain time fi elds and
LocalTime does not contain date fi elds. Watch for operations being performed on the
wrong time. Also watch for adding or subtracting time and ignoring the result.

# Chapter 4

As you learned in this chapter, Java methods start with an access modifi er of public,
private, protected or blank (default access). This is followed by an optional specifi er such
as static, final, or abstract. Next comes the return type, which is void or a Java type.
The method name follows, using standard Java identifi er rules. Zero or more parameters go
in parentheses as the parameter list. Next come any optional exception types. Finally, zero
or more statements go in braces to make up the method body.
Using the private keyword means the code is only available from within the same class.
Default (package private) access means the code is only available from within the same
package. Using the protected keyword means the code is available from the same package
or subclasses. Using the public keyword means the code is available from anywhere. Static
methods and static variables are shared by the class. When referenced from outside the
class, they are called using the classname—for example, StaticClass.method(). Instance
members are allowed to call static members, but static members are not allowed to call
instance members. Static imports are used to import static members.
Java uses pass-by-value, which means that calls to methods create a copy of the parameters.
Assigning new values to those parameters in the method doesn’t affect the caller’s variables.
Calling methods on objects that are method parameters changes the state of those objects and
is refl ected in the caller.
Overloaded methods are methods with the same name but a different parameter list.
Java calls the most specifi c method it can fi nd. Exact matches are preferred, followed by
wider primitives. After that comes autoboxing and fi nally varargs.
Constructors are used to instantiate new objects. The default no-argument constructor
is called when no constructor is coded. Multiple constructors are allowed and can call each
other by writing this(). If this() is present, it must be the fi rst statement in the constructor.
Constructors can refer to instance variables by writing this before a variable name to indicate they want the instance variable and not the method parameter with that name. The order
of initialization is the superclass (which we will cover in Chapter 5); static variables and static
initializers in the order they appear; instance variables and instance initializers in the order
they appear; and fi nally the constructor.
Encapsulation refers to preventing callers from changing the instance variables directly.
This is done by making instance variables private and getters/setters public. Immutability
refers to preventing callers from changing the instance variables at all. This uses several
techniques, including removing setters. JavaBeans use methods beginning with is and get
for boolean and non-boolean property types, respectively. Methods beginning with set are
used for setters.
Lambda expressions, or lambdas, allow passing around blocks of code. The full syntax
looks like (String a, String b) -> { return a.equals(b); }. The parameter types can
be omitted. When only one parameter is specifi ed without a type, the parentheses can also
be omitted. The braces and return statement can be omitted for a single statement, making
the short form a -> a.equals(b). Lambdas are passed to a method expecting an interface with one method. Predicate is a common interface. It has one method named test
that returns a boolean and takes any type. The removeIf() method on ArrayList takes a
Predicate.

## Exam Essentials

-`Be able to identify correct and incorrect method declarations.` A sample method signature
is public static void method(String... args) throws Exception {}.
Identify when a method or field is accessible. Recognize when a method or fi eld is
accessed when the access modifi er (private, protected, public, or default access) does not
allow it.

-`Recognize valid and invalid uses of static imports.` Static imports import static members.
They are written as import static, not static import. Make sure they are importing static
methods or variables rather than classnames.

-`State the output of code involving methods.` Identify when to call static rather than
instance methods based on whether the classname or object comes before the method.
Recognize the correct overloaded method. Exact matches are used fi rst, followed by wider
primitives, followed by autoboxing, followed by varargs. Assigning new values to method
parameters does not change the caller, but calling methods on them does.

-`Evaluate code involving constructors. `Constructors can call other constructors by calling this() as the fi rst line of the constructor. Recognize when the default constructor is
provided. Remember the order of initialization is the superclass, static variables/initializers,
instance variables/initializers, and the constructor.

-`Be able to recognize when a class is properly encapsulated.` Look for private instance
variables and public getters and setters when identifying encapsulation.

-`Write simple lambda expressions.` Look for the presence or absence of optional elements
in lambda code. Parameter types are optional. Braces and the return keyword are optional
when the body is a single statement. Parentheses are optional when only one parameter is
specifi ed and the type is implicit. The Predicate interface is commonly used with lambdas
because it declares a single method called test(), which takes one parameter.

# Chapter 5

This chapter took the basic class structure we presented in Chapter 4 and expanded it by
introducing the notion of inheritance. Java classes follow a multilevel single-inheritance
pattern in which every class has exactly one direct parent class, with all classes eventually inheriting from java.lang.Object. Java interfaces simulate a limited form of multiple
inheritance, since Java classes may implement multiple interfaces.
Inheriting a class gives you access to all of the public and protected methods of the
class, but special rules for constructors and overriding methods must be followed or the
code will not compile. For example, if the parent class doesn’t include a no-argument constructor, an explicit call to a parent constructor must be provided in the child’s constructors. Pay close attention on the exam to any class that defi nes a constructor with arguments
and doesn’t defi ne a no-argument constructor.
We reviewed overloaded, overridden, and hidden methods and showed how they differ,
especially in terms of polymorphism. We also introduced the notion of hiding variables,
although we strongly discourage this in practice as it often leads to confusing, diffi cult-tomaintain code.
We introduced abstract classes and interfaces and showed how you can use them to
defi ne a platform for other developers to interact with. By defi nition, an abstract type cannot be instantiated directly and requires a concrete subclass for the code to be used. Since
default and static interface methods are new to Java 8, expect to see at least one question
on them on the exam.
Finally, this chapter introduced the concept of polymorphism, central to the Java language, and showed how objects can be accessed in a variety of forms. Make sure you
understand when casts are needed for accessing objects, and be able to spot the difference
between compile-time and runtime cast problems.

## Exam Essentials

-`Be able to write code that extends other classes.` A Java class that extends another class
inherits all of its public and protected methods and variables. The fi rst line of every
constructor is a call to another constructor within the class using this() or a call to a constructor of the parent class using the super() call. If the parent class doesn’t contain a noargument constructor, an explicit call to the parent constructor must be provided. Parent
methods and objects can be accessed explicitly using the super keyword. Finally, all classes
in Java extend java.lang.Object either directly or from a superclass.

-`Understand the rules for method overriding.` The Java compiler allows methods to be
overridden in subclasses if certain rules are followed: a method must have the same signature, be at least as accessible as the parent method, must not declare any new or broader
exceptions, and must use covariant return types.

-`Understand the rules for hiding methods and variables.` When a static method is recreated in a subclass, it is referred to as method hiding. Likewise, variable hiding is when
a variable name is reused in a subclass. In both situations, the original method or variable
still exists and is used in methods that reference the object in the parent class. For method
hiding, the use of static in the method declaration must be the same between the parent
and child class. Finally, variable and method hiding should generally be avoided since it
leads to confusing and diffi cult-to-follow code.

-`Recognize the difference between method overriding and method overloading.` Both
method overloading and overriding involve creating a new method with the same name
as an existing method. When the method signature is the same, it is referred to as method
overriding and must follow a specifi c set of override rules to compile. When the method
signature is different, with the method taking different inputs, it is referred to as method
overloading and none of the override rules are required.

-`Be able to write code that creates and extends abstract classes.` In Java, classes and methods can be declared as abstract. Abstract classes cannot be instantiated and require a concrete subclass to be accessed. Abstract classes can include any number, including zero, of
abstract and nonabstract methods. Abstract methods follow all the method override rules
and may only be defi ned within abstract classes. The fi rst concrete subclass of an abstract
class must implement all the inherited methods. Abstract classes and methods may not be
marked as final or private.

-`Be able to write code that creates, extends, and implements interfaces.` Interfaces are similar
to a specialized abstract class in which only abstract methods and constant static final
variables are allowed. New to Java 8, an interface can also defi ne default and static methods with method bodies. All members of an interface are assumed to be public. Methods
are assumed to be abstract if not explicitly marked as default or static. An interface that
extends another interface inherits all its abstract methods. An interface cannot extend a class,
nor can a class extend an interface. Finally, classes may implement any number of interfaces.

-`Be able to write code that uses default and static interface methods.` A default method
allows a developer to add a new method to an interface used in existing implementations,
without forcing other developers using the interface to recompile their code. A developer
using the interface may override the default method or use the provided one. A static
method in an interface follows the same rules for a static method in a class.

-`Understand polymorphism.` An object in Java may take on a variety of forms, in part
depending on the reference used to access the object. Methods that are overridden will be
replaced everywhere they are used, whereas methods and variables that are hidden will
only be replaced in the classes and subclasses that they are defi ned. It is common to rely on
polymorphic parameters—the ability of methods to be automatically passed as a superclass
or interface reference—when creating method defi nitions.

-`Recognize valid reference casting.` An instance can be automatically cast to a superclass
or interface reference without an explicit cast. Alternatively, an explicit cast is required if
the reference is being narrowed to a subclass of the object. The Java compiler doesn’t permit casting to unrelated types. You should be able to discern between compiler-time casting
errors and those that will not occur until runtime and that throw a CastClassException.

# Chapter 6

An exception indicates something unexpected happened. A method can handle an exception by catching it or declaring it for the caller to deal with. Many exceptions are thrownby Java libraries. You can throw your own exception with code such as throw new
Exception().
Subclasses of java.lang.Error are exceptions that a programmer should not attempt to
handle. Subclasses of java.lang.RuntimeException are runtime (unchecked) exceptions.
Subclasses of java.lang.Exception, but not java.lang.RuntimeException are checked
exceptions. Java requires checked exceptions to be handled or declared.
If a try statement has multiple catch blocks, at most one catch block can run. Java
looks for an exception that can be caught by each catch block in the order they appear, and
the fi rst match is run. Then execution continues after the try statement. If both catch and
finally throw an exception, the one from finally gets thrown.

Common runtime exceptions include:

- ArithmeticException
- ArrayIndexOutOfBoundsException
- ClassCastException
- IllegalArgumentException
- NullPointerException
- NumberFormatException
  IllegalArgumentException and NumberFormatException are typically thrown by the
  programmer, whereas the others are typically thrown by the JVM.
  Common checked exceptions include:
- IOException
- FileNotFoundException
  Common errors include:
- ExceptionInInitializerError
- StackOverflowError
- NoClassDefFoundError
  When a method overrides a method in a superclass or interface, it is not allowed to add
  checked exceptions. It is allowed to declare fewer exceptions or declare a subclass of a
  declared exception. Methods declare exceptions with the keyword throws.

## Exam Essentials

-`Differentiate between checked and unchecked exceptions.` Unchecked exceptions are also
known as runtime exceptions and are subclasses of java.lang.RuntimeException. All
other subclasses of java.lang.Exception are checked exceptions.

-`Understand the flow of a try statement.` A try statement must have a catch or a finally
block. Multiple catch blocks are also allowed, provided no superclass exception type
appears in an earlier catch block than its subclass. The finally block runs last regardless
of whether an exception is thrown.

-`Identify whether an exception is thrown by the programmer or the JVM.` Illegal
ArgumentException and NumberFormatException are commonly thrown by the programmer. Most of the other runtime exceptions are typically thrown by the JVM.

`Declare methods that declare exceptions.` The throws keyword is used in a method declaration to indicate an exception might be thrown. When overriding a method, the method is allowed to throw fewer exceptions than the original version.

-`Recognize when to use throw versus throws.` The throw keyword is used when you actually want to throw an exception—for example, throw new RuntimeException(). The throws keyword is used in a method declaration.
