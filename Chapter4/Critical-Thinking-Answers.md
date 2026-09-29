# Chapter 4 Critical Thinking

## 1. Decision structures

### a

```java
if (grade >= 90)
{
    System.out.println("Great job!");
}
```

### b

```java
if (number < 20 || number > 50)
{
    System.out.println("Error");
}
```

### c

```java
if (y < 100)
{
    y += 2;
}
```

## 2. Comparing two integers

```java
if (num1 > num2)
{
    System.out.println("First number is larger.");
}
else if (num2 > num1)
{
    System.out.println("Second number is larger.");
}
else
{
    System.out.println("Numbers are equal.");
}
```

## 3. Odd or even

### a

The first blank is **even** and the second blank is **odd**.

### b

```java
switch (num % 2)
{
    case 0:
        System.out.println("even number");
        break;
    default:
        System.out.println("odd number");
}
```

## 4. Random numbers

### a

```java
int number = (int) (50 * Math.random() + 1);
```

### b

```java
int number = (int) (81 * Math.random() + 20);
```

### c

```java
double number = 10 * Math.random() + 10;
```

## 5. Age conditions

The original conditions do not display anything when age is exactly 18 or exactly 65. The conditions can be written without gaps like this:

```java
if (age < 18)
{
    System.out.println("child");
}
else if (age < 65)
{
    System.out.println("adult");
}
else
{
    System.out.println("senior");
}
```

## 6. Boolean expressions

Given `size = 100`, `weight = 50`, and `value = 75`:

- a) **True**
- b) **False**
- c) **True**
- d) **True**
- e) **True**
- f) **True**
- g) **True**

## 8. True or false

- a) **True.** An `if` condition must evaluate to either true or false.
- b) **False.** A nested `if` is inside another decision structure. An `if-else if` statement is a chain of choices.
- c) **False.** A `switch` expression cannot use a `double` value.
- d) **True.** Computer-generated random values are pseudorandom.
- e) **False.** An `(int)` cast is used to make a random integer. A `(double)` cast would still produce a decimal value.
- f) **True.** More than two Boolean expressions can be joined together.
- g) **True.** Both sides of `&&` must be true for the whole expression to be true.
- h) **True.** The `&&` operator is evaluated before `||`.
- i) **True.** `Math.pow()` is used for exponentiation.
- j) **False.** The method must include the class name: `x = Math.abs(-3);`.
