# Chapter 3 Mastery: Planning and Reflection

## Digits - page 58

### IPO chart

| Input | Process | Output |
| --- | --- | --- |
| A two-digit integer | Divide by 10 and use modulus 10 for the tens digit. Use modulus 10 for the ones digit. | The tens-place and ones-place digits |

### Reflection

The program uses integer division and the modulus operator to separate the digits. The calculation is placed in methods so each result can be tested independently. JUnit tests check a regular two-digit number and a number whose ones digit is zero.

## GradeAvg - pages 59 and 61

### IPO chart

| Input | Process | Output |
| --- | --- | --- |
| Five integer grades | Add each grade to the running total with `+=`. Cast the total to `double` and divide by five. | The average grade formatted as a percentage |

### Reflection

The program uses an array and loop to avoid repeating the same calculation five times. Real division preserves the decimal part of the average. JUnit tests check both a whole-number average and an average containing a decimal.

## PizzaCost - Exercise 2

### IPO chart

| Input | Process | Output |
| --- | --- | --- |
| Pizza diameter in inches | Add $0.75 labour, $1.00 rent, and `0.05 * diameter * diameter` for materials. | Cost of making the pizza, formatted as currency |

### Reflection

Named constants make each part of the formula clear. The cost calculation is kept separate from keyboard input and screen output. JUnit tests verify the textbook example and another diameter.

## TimeConversion - Exercise 8

### IPO chart

| Input | Process | Output |
| --- | --- | --- |
| A time in minutes | Divide by 60 to find hours and use modulus 60 to find remaining minutes. | Time in `hours:minutes` format |

### Reflection

Integer division and modulus divide the total time into hours and leftover minutes. `String.format` adds a leading zero when the remaining minutes are less than ten. JUnit tests check both ordinary minutes and the required leading-zero case.

## JUnit evidence

All four test classes were run together with the `AllTests` suite in Eclipse on September 16, 2026. The JUnit 5 view reported **8/8 tests run, 0 errors, and 0 failures**. Add a screen dump of the green JUnit result bar to the assignment submission.
