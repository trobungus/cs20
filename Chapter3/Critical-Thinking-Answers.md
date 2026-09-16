# Chapter 3 Critical Thinking - Page 70

## 1. Identifier names

### a) Four legal identifier names

- `numberOfStudents`
- `gradeAverage`
- `firstName`
- `totalCost`

### b) Four illegal identifier names

- `2ndGrade` is illegal because an identifier cannot begin with a number.
- `class` is illegal because it is a Java keyword.
- `grade average` is illegal because identifiers cannot contain spaces.
- `total-cost` is illegal because identifiers cannot contain a hyphen.

## 2. Declaring and assigning `numBeads`

### a) In two statements

```java
int numBeads;
numBeads = 5;
```

### b) In one statement

```java
int numBeads = 5;
```

## 3. Final value of `yourNumber`

### a)

The final value is **13**. `myNumber` becomes 8, and then 5 is added to it.

### b)

The final value is **11**. `myNumber` receives `4 + 7`, and that result is then assigned to `yourNumber`.

## 4. Appropriate data types

| Value | Data type | Reason |
| --- | --- | --- |
| Number of basketballs in a store | `int` | It is a whole-number count. |
| Price of a basketball | `double` | A price can contain a decimal portion. |
| Number of players on a team | `int` | It is a whole-number count. |
| Average age of the players | `double` | An average can contain a decimal portion. |
| Whether a player received a jersey | `boolean` | The value is either true or false. |
| First initial of a player's first name | `char` | It stores one character. |

## 5. Primitive types, abstract data types, classes, and objects

### a)

A primitive data type is built into Java and stores one simple value, such as an `int`, `double`, `char`, or `boolean`. An abstract data type groups data with the operations that act on that data and is usually represented by a class.

### b)

A class is the definition or blueprint that describes data and methods. An object is one instance created from that class.

## 11. Type casting and rounding

Given:

```java
int j = 5;
double k = 1.6;
int y;
double z;
```

### a)

```java
y = (int)(j * k + 0.5);
```

The multiplication produces a `double`, so the result must be rounded and cast before it can be stored in `y`.

### b)

```java
z = (double)j * k;
```

The cast is not required because Java automatically promotes `j` to a `double`, but the explicit cast makes the intended real-number calculation clear.

### c)

```java
z = k * k;
```

No cast is necessary because both operands and the destination are `double`.

### d)

```java
j = (int)(k + 0.5);
```

The `double` value is rounded and cast before being stored in the `int` variable.

### e)

```java
k = j;
```

No cast is necessary because Java automatically promotes the `int` value to a `double`.

### f)

```java
y = j + 3;
```

No cast is necessary because the operands and destination are all `int` values.
