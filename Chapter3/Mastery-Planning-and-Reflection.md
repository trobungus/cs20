# Chapter 3 Reflections and Test Evidence

## Digits - page 58

### Reflection

The program uses integer division and the modulus operator to separate the digits. The calculation is placed in methods so each result can be tested independently. JUnit tests check a regular two-digit number and a number whose ones digit is zero.

## GradeAvg - pages 59 and 61

### Reflection

The program uses an array and loop to avoid repeating the same calculation five times. Real division preserves the decimal part of the average. JUnit tests check both a whole-number average and an average containing a decimal.

## PizzaCost - Exercise 2

### Reflection

Named constants make each part of the formula clear. The cost calculation is kept separate from keyboard input and screen output. JUnit tests verify the textbook example and another diameter.

## TimeConversion - Exercise 8

### Reflection

Integer division and modulus divide the total time into hours and leftover minutes. `String.format` adds a leading zero when the remaining minutes are less than ten. JUnit tests check both ordinary minutes and the required leading-zero case.

## JUnit evidence

All four test classes were run together with the `AllTests` suite in Eclipse on September 16, 2026. The JUnit 5 view reported **8/8 tests run, 0 errors, and 0 failures**. Add a screen dump of the green JUnit result bar to the assignment submission.
