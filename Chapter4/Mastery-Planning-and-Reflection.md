# Chapter 4 Reflections and Test Evidence

## Hurricane - page 81

### Reflection

I used an `if-else if` chain to match categories 1 through 5 with the wind-speed ranges from the chart. I tested categories 1 and 5 because they check both ends of the scale. I also tested an invalid category.

## RandomNum - page 83

### Reflection

I used the random-number formula from the textbook and cast the result to an integer. I tested it 100 times to make sure every result stayed between the minimum and maximum. I also checked equal and reversed values.

## Delivery - page 84

### Reflection

I joined the three size checks with `||` because the package must be rejected if any dimension is over 10. Testing a package exactly at the limit helped confirm that 10 is still accepted.

## PerfectSquare - page 85

### Reflection

I found the square root, changed it to an integer, and multiplied it by itself. If that result matches the original number, it is a perfect square. I tested a perfect square, a non-perfect square, and a negative number.

## PackageCheck - Exercise 2

### Reflection

I calculated the package volume by multiplying its length, width, and height. Two Boolean variables made it easier to choose between too heavy, too large, both, or accepted. I tested all four possible results.

## Grade - Exercise 5

### Reflection

I checked the percentage from the highest grade down so each value stops at the first matching range. I tested one value from every letter-grade range and an invalid percentage.

## JUnit evidence

I ran `AllTests` in Eclipse. All 21 tests passed with no errors or failures. The Eclipse screen dump is included with the Chapter 4 hand-in files.
