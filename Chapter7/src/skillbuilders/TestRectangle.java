/*
 * Program: TestRectangle.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Demonstrate every assigned Rectangle skill-builder method.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

public class TestRectangle
{
    /** pre: none; post: constructors, dimensions, formulas and equality are shown. */
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        System.out.println("Default: " + box);
        box.setLength(5);
        box.setWidth(3);
        System.out.println("Length: " + box.getLength());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Area: " + box.area());
        System.out.println("Perimeter: " + box.perimeter());
        Rectangle.displayAreaFormula();
        Rectangle other = new Rectangle(5, 3);
        System.out.println("Same dimensions: " + box.equals(other));
        other.setWidth(4);
        System.out.println("Same dimensions after change: " + box.equals(other));
        System.out.println(other);
    }
}

/* Screen Dump
Console run: TestRectangle
Supplied input: (none)
Default: Rectangle has length 1.0 and width 1.0
Length: 5.0
Width: 3.0
Area: 15.0
Perimeter: 16.0
The formula for the area of a rectangle is a=length*width
Same dimensions: true
Same dimensions after change: false
Rectangle has length 5.0 and width 4.0
*/
