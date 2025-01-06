# Taking the test

1. Does the Code compile - Check choices, if `“Code does not compile”` isn't a choice, the code compiles.
2. The code does not compile due to line \_\_\_ - check choies if this an option, and stated line.

3. Understand the Question
   - Does the Code compile
4. Check the Answers
   - Check choices, if `“Code does not compile”` isn't a choice, the code compiles.
   - `The code does not compile due to line ___` - check choies if this an option, and focus on stated line.
5. Determining what the Question is asking

   - Question may say what is the output, but the code fails to compile

6. Taking advantage of context clues

   - you can assume a question’s code block will compile and run if `“Does not compile”` and `“Throw an exception at runtime”` are not available in the list of answers.

7. Reviewing Common Compiler Issues

# Common Tips to Determine if Code Compiles

## General Tips

- Keep an eye out for all reserved words. [Chapter 1]
- Verify brackets `{}` and parentheses `()` are being used correctly. [Chapter 1]
- Verify `new` is used appropriately for creating objects. [Chapter 1]
- Ignore all line indentation, especially with `if-then` statements that do not use brackets `{}`. [Chapter 2]

## Operators and Data Types

- Make sure operators use compatible data types:
  - The logical complement operator (`!`) should only be applied to boolean values. [Chapter 2]
  - Arithmetic operators (`+`, `-`, `++`, `--`) should only be applied to numeric values. [Chapter 2]
- For any numeric operators, check for:
  - Automatic numeric promotion.
  - Order of operation when evaluating an expression. [Chapter 2]
- Verify `switch` statements use acceptable data types. [Chapter 2]

## Strings and Equality

- Remember `==` is not the same as `equals()`. [Chapter 3]
- String values are immutable. [Chapter 3]

## Methods and Access Modifiers

- Non-void methods must return a value that matches or is a subclass of the return type of the method. [Chapter 4]
- If two classes are involved, make sure access modifiers allow proper access to variables and methods. [Chapter 4]
- Non-static methods and variables require an object instance to access. [Chapter 4]

## Constructors and Abstract Concepts

- If a class is missing a default no-argument constructor or the provided constructors do not explicitly call `super()`, assume the compiler will automatically insert them. [Chapter 5]
- Make sure:
  - Abstract methods do not define an implementation.
  - Concrete methods always define an implementation. [Chapter 5]
- You implement an interface and extend a class. [Chapter 5]
- A class can be cast to a reference of any superclass it inherits from or interface it implements. [Chapter 5]

## Exceptions and Error Handling

- Checked exceptions must be caught; unchecked exceptions may be caught but do not need to be. [Chapter 6]
- `try` blocks require a `catch` and/or `finally` block for the OCA exam. [Chapter 6]

# Applying Process of Elimination

apply the process of elimination to help improve your score

## Using the Provided Writing Material

ask for paper, if in test center

## Understanding Relationships Between Answers
## Guessing the Correct Answer
your guess will be better than blind luck

# Optimizing your Time
 one and  half minutes per question.

## Checking the Time Remaining
We do recommend you check the time remaining at certain points 
while taking the exam to determine whether you should try to increase your pace.

## Skiping Hard Questions
It is 
a far better use of your time to spend fi ve minutes answering ten easy questions than the 
same amount of time answering one diffi cult question.The trick is to not get stuck on a diffi cult question for a long 
period of time.

## Improving your Test-Taking Speed
The idea is that you want to be good at quickly 
reading through the question, honing in on the key concept the question is asking, and 
being able to select the answer that best represents it.
