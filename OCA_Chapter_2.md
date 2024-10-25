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

## Casting Primitive Values

Casting primitives is required when :

- larger numerical data -> smaller numerical data
- floating-point number -> interger value

```java
int x = (int)1.0;
short y = (short)1921222; // Stored as 20678
int z = (int)9f;
long t = 192301398193810323L;
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

109/435
