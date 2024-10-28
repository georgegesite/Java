# Creating and Manipulating Strings

A `string` is basically a sequence of characters
String class is special and doesn’t need to be instantiated with new

```java
String name = "Fluffy";
String name = new String("Fluffy");
```

- concatenation,
- immutability,
- the string pool,
- common methods,
- and method chaining.

## Concatenation

Placing one String before the other String and combining them together is called string `concatenation`.

1. If both operands are numeric, + means numeric addition.
2. If either operand is a String, + means concatenation.
3. The expression is evaluated left to right.

```java
System.out.println(1 + 2); // 3
System.out.println("a" + "b"); // ab
System.out.println("a" + "b" + 3); // ab3
System.out.println(1 + 2 + "c"); // 3c
```

## Immutability

Once a String object is created, it is not allowed to change.
It cannot be made larger or smaller, and you cannot change one of the characters inside it.

`Mutable` is another word for changeable
`Immutable` is the opposite—an object that can’t be changed once it’s created.

## The String Pool

The `string pool`, also known as the intern pool, is a location in the Java virtual machine (JVM) that collects all these strings.

```java
String name = "Fluffy"; //it is a literal, so it goes into the string pool
String name = new String("Fluffy"); // creates new object string, doesnt go into the string pool
```

## Important String Methods

The method `length()` returns the number of characters in the String.

```java
String string = "animals";
System.out.println(string.length()); // 7
```

The method `charAt()` lets you query the string to fi nd out what character is at a specific index.

```java
String string = "animals";
System.out.println(string.charAt(0)); // a
System.out.println(string.charAt(6)); // s
System.out.println(string.charAt(7)); // throws exception
```

The method `indexOf()` looks at the characters in the string and finds the first index that matches the desired value.
indexOf can work with an individual character or a whole String as input.
It can also start from a requested position.

```java
String string = "animals";
System.out.println(string.indexOf('a')); // 0
System.out.println(string.indexOf("al")); // 4
System.out.println(string.indexOf('a', 4)); // 4
System.out.println(string.indexOf("al", 5)); // -1
```

The method `substring()` also looks for characters in a string.
The substring() method is the trickiest String method on the exam.
The method returns the string starting from the requested index. If an end index is requested, it stops right before that index. Otherwise, it goes to the end of the string.

```java
String string = "animals";
System.out.println(string.substring(3)); // mals
System.out.println(string.substring(string.indexOf('m'))); // mals
System.out.println(string.substring(3, 4)); // m
System.out.println(string.substring(3, 7)); // mals

System.out.println(string.substring(3, 3)); // empty string
System.out.println(string.substring(3, 2)); // throws exception
System.out.println(string.substring(3, 8)); // throws exception
```

`toLowerCase()` and `toUpperCase()`

```java
String string = "animals";
System.out.println(string.toUpperCase()); // ANIMALS
System.out.println("Abc123".toLowerCase()); // abc123
```

`equals()` and `equalsIgnoreCase()`

```java
System.out.println("abc".equals("ABC")); // false
System.out.println("ABC".equals("ABC")); // true
System.out.println("abc".equalsIgnoreCase("ABC")); // true
```

`startsWith()` and `endsWith()`

```java
System.out.println("abc".startsWith("a")); // true
System.out.println("abc".startsWith("A")); // false
System.out.println("abc".endsWith("c")); // true
System.out.println("abc".endsWith("a")); // false
```

The `contains()` method also looks for matches in the String.
The contains() method is a convenience method so you don’t have to write `str.indexOf(otherString) != -1`.

```java
System.out.println("abc".contains("b")); // true
System.out.println("abc".contains("B")); // false
```

The `replace()` method does a simple search and replace on the string.

```java
System.out.println("abcabc".replace('a', 'A')); // AbcAbc
System.out.println("abcabc".replace("a", "A")); // AbcAbc
```

The `trim()` method removes whitespace from the beginning and end of a String.
Removes \t (tab), \n (newline) and \r (carriage return).

```java
System.out.println("abc".trim()); // abc
System.out.println("\t a b c\n".trim()); // a b c
```

length()
charAt(int index)
indexOf(char ch || String s)
subString(int beginIndexint || beginIndex, int endIndex)
toLowerCase(String s)
toUpperCase(String s)
equals(String s) returns boolean
equalsIgnoreCase(String s) returns boolean
startsWith(String prefix) returns boolean
endsWith(String suffix) returns boolean
contains(String s) returns boolean
replace(char ch, char newCh || String s, String newS) return String
trim() return String

## Method Chaining

It is common to call multiple methods on the same String

```java
String start = "AniMaL ";
String trimmed = start.trim(); // "AniMaL"
String lowercase = trimmed.toLowerCase(); // "animal"
String result = lowercase.replace('a', 'A'); // "Animal"
System.out.println(result);

// Same as below
String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
System.out.println(result);
```

# Using the StringBuilder class

The StringBuilder class creates a String without storing all those interim String values. Unlike the String class, StringBuilder is not immutable

## Mutability and Chaining

## Creating a String Builder

```java
StringBuilder sb1 = new StringBuilder(); //containing an empty sequence of characters
StringBuilder sb2 = new StringBuilder("animal"); //containing a specific value
StringBuilder sb3 = new StringBuilder(10); // reserve a certain number of slots for characters
```

## Important StringBuilder Methods

`charAt()`, `indexOf()`, `length()`, and `substring()`
These four methods work exactly the same as in the String class.

The `append()` method is by far the most frequently used method in StringBuilder.
it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder.

```java
StringBuilder sb = new StringBuilder().append(1).append('c');
sb.append("-").append(true);
System.out.println(sb); // 1c-true
```

The `insert()` method adds characters to the StringBuilder at the requested index and
returns a reference to the current StringBuilder.

```java
 StringBuilder sb = new StringBuilder("animals");
 sb.insert(7, "-"); // sb = animals
 sb.insert(0, "-"); // sb = -animals
 sb.insert(4, "-"); // sb = -ani-mals
 System.out.println(sb);
```

`delete()` removes characters from the sequence and returns a reference to the current StringBuilder.
The `deleteCharAt()` method is convenient when you want to delete only one character.

```java
StringBuilder sb = new StringBuilder("abcdef");
sb.delete(1, 3); // sb = adef
sb.deleteCharAt(5); // throws an exception
```

The `reverse()` method does just what it sounds like: it reverses the characters in the sequences and returns a reference to the current StringBuilder.

```java
StringBuilder sb = new StringBuilder("ABC");
sb.reverse();
System.out.println(sb); // CBA
```

`toString()` The last method converts a StringBuilder into a String.

length()
charAt(int index)
indexOf(char ch || String s)
subString(int beginIndexint || beginIndex, int endIndex)
append(String str)
insert(int offset, String str)
delete(int start, int end)
deleteCharAt(int index)
reverse()
toString()

## StringBuilder vs. StringBUffer

When writing new code that concatenates a lot of String objects together, you should use StringBuilder.

# Understanding Equality

```java
String x = "Hello World";
String y = "Hello World";
System.out.println(x == y); // true
```

Remember that Strings are immutable and literals are pooled. The JVM created only one literal in memory.
x and y both point to the same location in memory; therefore, the statement outputs true.

```java
String x = "Hello World"; // added to string pool on compile time
String z = " Hello World".trim(); //creates new object at runtime
System.out.println(x == z); // false, isnt the same at compile time

String x = new String("Hello World"); //creates new object String, different String object
String y = "Hello World"; // added to string pool on compile time
System.out.println(x == y); // false
```

`equals()` to check the values inside the String rather than the String itself

```java
String x = "Hello World";
String z = " Hello World".trim();
System.out.println(x.equals(z)); // true
```

If you call `equals()` on two StringBuilder instances, it will check reference equality.

```java
Tiger t1 = new Tiger();
Tiger t2 = new Tiger();
Tiger t3 = t1;
System.out.println(t1 == t1); // true - we are comparing references to the same object
System.out.println(t1 == t2); // false -  false because the two object references are different
System.out.println(t1.equals(t2)); // false - false since Tiger does not implement equals()
```

# Understanding Java Arrays

An `array` is an area of memory on the heap with space for a designated number of elements
A `String` is `implemented as an array` with some methods that you might want to use when dealing with characters specifically
A `StringBuilder` is `implemented as an array` where the array object is
replaced with a new bigger array object when it runs out of space to store all the characters.

## Creating an Array of Primitives

```java
int[] numbers1 = new int[3];
int[] numbers2 = new int[] {42, 55, 99};

int[] numAnimals;
int [] numAnimals2;
int numAnimals3[];
int numAnimals4 [];
```

## Creating an Array with Reference Variable

167/198
