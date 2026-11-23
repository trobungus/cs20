/*
 * Program: TestCircle.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Run the Circle skill-builder client examples.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

public class TestCircle
{
    /** pre: none; post: constructors and all Circle behaviours are demonstrated. */
    public static void main(String[] args)
    {
        Circle spot = new Circle();
        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
        System.out.printf(java.util.Locale.CANADA, "Circle area: %.2f%n", spot.area());
        Circle.displayAreaFormula();

        Circle other = new Circle(4);
        System.out.println("Same radius: " + spot.equals(other));
        System.out.println(spot);
        System.out.println(other);
        other.setRadius(3);
        System.out.println("Same radius after change: " + spot.equals(other));
    }
}

/* Screen Dump
Console run: TestCircle
Supplied input: (none)
Circle radius: 3.0
Circle circumference: 18.84
Circle area: 28.26
The formula for the area of a circle is a=Pi*r*r
Same radius: false
Circle has radius 3.0
Circle has radius 4.0
Same radius after change: true
*/
