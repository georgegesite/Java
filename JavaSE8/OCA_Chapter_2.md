# Understanding Java Operators

A Java operator is a special symbol that can be applied to a set of variables, values, or literals—referred to as operands—and that returns a result.
Flavors of Operators:

- unary
- binary
- ternary

Java operators follow order of operation

# Working with Binary Arithmetic Operators

Binary operators, by far the most common operators in the Java language.

## Arithmetic Operators

Arithmetic operators:
addition(+), subtraction (-), multiplication (\*), division (/), and modulus (%)
the multiplicative operators (\*, /, %) have a higher order of precedence than the additive operators (+, -).

You can change the order of operation explicitly by wrapping parentheses around the sections you want evaluated first.
Only the addition operators + and += may be applied to String values, which results in String concatenation.

The modulus operation results in a value between 0 and (y - 1) for positive dividends.

## Numeric Promotion

Numeric Promotion Rules

1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.
3. Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator, even if neither of the operands is int.
4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

# Working with unary operators

a unary operator is one that requires exactly one operand, or variable, to function

## Logical Compliment and negation operators

The logical complement operator, !, flips the value of a boolean expression.
negation operator, - ,

```java
int x = !5; // DOES NOT COMPILE - cannot perform a logical inversion of a numeric value.
boolean y = -true; // DOES NOT COMPILE - cannot numerically negate a boolean value
boolean z = !0; // DOES NOT COMPILE -  cannot take the logical complement of a numeric value, nor can you assign an integer to a boolean variable
```

## Increment and Decrement Operators

++ and -- can be applied to numeric operands and have the higher order or precedence
pre-increment operator and the pre-decrement operator, operators is applied and returns the new value
post-increment operator and the post-decrement operator, current value is returned, then operator is applied and returns new value

Increment and Decrement operators are handles first left to right before binary operators
Following binary operators, starting with multiplication/division/modulus from left to right, then add/sub left to right

# Using Additional Binary Operators

## Assignemnt Operator

An assignment operator is a binary operator that modifi es, or assigns, the variable on the left-hand side of the operator, with the result of the value on the right-hand side of the equation.

```java
int x = 1.0; // DOES NOT COMPILE
short y = 1921222; // DOES NOT COMPILE
int z = 9f; // DOES NOT COMPILE
long t = 192301398193810323; // DOES NOT COMPILE
```

Important: The assignment itself has the value of the assignment.

## Casting Primitive Values

Casting primitives is required when :

- larger numerical data -> smaller numerical data
- floating-point number -> interger value

```java
int x = (int)1.0;
short y = (short)1921222; // Stored as 20678
int z = (int)9f;
long t = 192301398193810323L;
byte sum = (byte)(a + b);
```

## Compound Assignment Operator

+= and -= are required for the exam

```java
int x = 2, z = 3;
x = x * z; // Simple assignment operator
x *= z; // Compound assignment operator, x variable needs to be declared for it to compile
```

Compound Operators can also save us from having to explicitly cast a value

```java
long x = 10;
int y = 5;
y *= x; // y = (int) y * x;
```

## Relational Operators

relational operators, which compare two expressions and return a boolean value.

< Strictly less than
<= Less than or equal to

> Strictly greater than
> = Greater than or equal to

## Logical operators

The logical operators, (&), (|), and (^), may be applied to both numeric and boolean data types.
Logical operators for boolean data types.
Bitwise Operators for for numeric data types.

■ AND is only true if both operands are true.
■ Inclusive OR is only false if both operands are false.
■ Exclusive OR is only true if the operands are different.

Conditional operators, && and ||, which are often referred to as short-circuit operators
The right-hand side of the expression may never be evaluated if the fi nal result can be determined by the left-hand side of the expression

## Equality Operators

== and !=

1. Comparing two numeric primitive types
2. Comparing two boolean values.
3. Comparing two Objetcs, including Strings values and null.

```java
boolean x = true == 3; // DOES NOT COMPILE
boolean y = false != "Giraffe"; // DOES NOT COMPILE
boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
```

For object comparison, the equality operator is applied to the references to the objects,
not the objects they point to. Two references are equal if and only if they point to the same
object, or both point to null.

```java
File x = new File("myFile.txt");
File y = new File("myFile.txt");
File z = x;
System.out.println(x == y); // Outputs false
System.out.println(x == z); // Outputs true
```

# Understanding Java Statements

A Java statement is a complete unit of execution in Java, terminated with a semicolon (;).
Control flow statements break up the flow of execution by using decision making, looping, and branching, allowing the application to selectively execute particular segments of code.

## The if-then statement

```java
boolean condition = true;
if(condition){
    // Do something
}
```

## The if-then-else Statement

```java
boolean condition = true;
if(condition){
    // Do something
} else {
    // This code block is executed when "condition" is false.
}
```

## The ternary operator

```java
boolean isValid = true;
String x = isValid ? "Login" : "Logout"; // can be used in assignment
return isValid ? "Login" : "Logout"; // can also be used in return statement
```

Using ternary operator makes code smaller to read.

```java
int y = 10;
final int x;
if(y > 5) {
 x = 2 * y;
} else {
 x = 3 * y;
}

// can be coded like below

int y = 10;
int x = (y > 5) ? (2 * y) : (3 * y);
```

```java
System.out.println((y > 5) ? 21 : "Zebra");
int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE Error: string cannot be converted to int
```

## The switch statement

Data types supported by switch statements include the following:
■ int and Integer
■ byte and Byte
■ short and Short
■ char and Character
■ int and Integer
■ String
■ enum values

boolean and long data types along with their wrapper classes are not supported by switch statements

## Compile-time Constant Values

When evaluating switch statements on the exam, always consider that multiple branches may be visited in a single execution.

the case statement value must also be a

- literal,
- enum constant,
- or final constant variable

```java
private int getSortOrder(String firstName, final String lastName) {
 String middleName = "Patricia";
 final String suffix = "JR";
 int id = 0;
 switch(firstName) {
 case "Test": // String literal
 return 52;
 case middleName: // DOES NOT COMPILE | if final was added, it will compile
 id = 5;
 break;
 case suffix: // final constant variable
 id = 0;
 break;
 case lastName: // DOES NOT COMPILE despite lastName being final, it is not constant as it is passed to the function
 id = 8;
 break;
 case 5: // DOES NOT COMPILE
 id = 7;
 break;
 case 'J': // DOES NOT COMPILE
 id = 10;
 break;
 case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
 id=15;
 break;
 }
 return id;
}
```

## The while statement

The simplest such repetition control structure in Java is the while statement

```java
while(booleanExpression ){
    // Do something
}
```

## The do-while Statement

Unlike a while loop, though, a do-while loop guarantees that the statement or block will be executed at least once.

```java
int x = 0;
do {
 x++;
} while(false);
System.out.println(x); // Outputs 1
```

Java will execute the statement block fi rst, and then check the loop condition.

## The for Statement

- basic for loop
- enhanced for loop

```java
for(initialization; booleanExpression; updateStatement) {
    // Body
}
```

1. Creating an Infinite Loop

```java
for( ; ; ) {
 System.out.println("Hello World");
}
```

2. Adding Multiple Terms to the for Statement

```java
int x = 0;
for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
 System.out.print(y + " ");
}
System.out.print(x);
```

3. Redeclaring a Variable in the Initialization Block

```java
int x = 0;
for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
 System.out.print(x + " ");
}
```

compiler stopping because of a duplicate variable declaration

4. Using Incompatible Data Types in the Initialization Block

```java
for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
 System.out.print(x + " ");
}
```

The variables in the initialization block must all be of the same type.

5. Using Loop Variables Outside the Loop

```java
for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
 System.out.print(y + " ");
}
System.out.print(x); // DOES NOT COMPILE out of scope
```

The variable x is out of scope.

## The for-each statement

```java
for(datatype instance: collection){
    // Body
}
```

For the OCA exam, the only members of the Collections framework that you need to be aware of are List and ArrayList.
Make sure the right-hand side is an array or Iterable object and the left-hand side has a matching type

error: for-each not applicable to expression type
error: incompatible types: String cannot be converted to int

```java
for(String name : names) {
 System.out.print(name + ", ");
}
// The two loops are equivalent
for(int i=0; i < names.length; i++) {
 String name = names[i];
 System.out.print(name + ", ");
}
```

# Understanding advanced flow control

## Nested Loops

```java
int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
for(int[] mySimpleArray : myComplexArray) {
 for(int i=0; i<mySimpleArray.length; i++) {
 System.out.print(mySimpleArray[i]+"\t");
 }
 System.out.println();
}
```

## Adding Optional Labels

A label is an optional pointer to the head of a statement that allows the application fl ow to jump to it or break from it.

this topic is not on the OCA exam

```java
int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
 INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
 System.out.print(mySimpleArray[i]+"\t");
 }
 System.out.println();
}
```

## The break statement

```java
optionalLabel: while(booleanExpression){
    // Do something
    // Somewhere in the loop
    break optionalLabel;
}
```

```java
PARENT_LOOP: for(int i=0; i<list.length; i++) {
 for(int j=0; j<list[i].length; j++) {
    if(condition){
        //The optional label parameter allows us to break out of a higher level outer loop
        break PARENT_LOOP;
    }
  }
}
```

## The continue statement

```java
optionalLabel: while(booleanExpression){
    // Do something
    // Somewhere in the loop
    continue optionalLabel;
}
```

The continue statements end the current iteration of the loop.

# Summary

This chapter covered a wide variety of topics, including dozens of Java operators, along with numerous control flow statements. Many of these operators and statements may have been new to you.

It is important that you understand how to use all of the required Java operators covered in this chapter and know how operator precedence influences the way a particular expression is interpreted. There will likely be numerous questions on the exam that appear to test one thing, such as StringBuilder or exception handling, when in fact the answer is related to the misuse of a particular operator that causes the application to fail to compile. When you see an operator on the exam, always check that the appropriate data types are used and that they match each other where applicable.

For statements, this chapter covered two types of control structures: decision-making
controls structures, including if-then, if-then-else, and switch statements, as well as
repetition control structures including for, for-each, while, and do-while. Remember that
most of these structures require the evaluation of a particular boolean expression either for
branching decisions or once per repetition. The switch statement is the only one that supports a variety of data types, including String variables as of Java 7.

With a for-each statement you don’t need to explicitly write a boolean expression, since
the compiler builds them implicitly. For clarity, we referred to an enhanced for loop as a
for-each loop, but syntactically they are written as a for statement.

We concluded this chapter by discussing advanced control options and how flow can be
enhanced through nested loops, break statements, and continue statements. Be wary of
questions on the exam that use nested statements, especially ones with labels, and verify
they are being used correctly.

This chapter is especially important because at least one component of this chapter will
likely appear in every exam question with sample code. Many of the questions on the exam
focus on proper syntactic use of the structures, as they will be a large source of questions
that end in “Does not compile.” You should be able to answer all of the review questions
correctly or fully understand those that you answered incorrectly before moving on to later
chapters.

# Review Questions Result

/1. A, D
/2. A, B, D
O3. C | F
O4. D, F | B,C,D,F
/5. C
/6. F
/7. D
/8. B
/9. F
O10. C | D
/11. A
/12. D
/13. A
/14. C
/15. E
O16. E | D
O17. B | D
/18. A
O19. F | D
/20. B

14/20
